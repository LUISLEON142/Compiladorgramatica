package gramatica;

import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Visitor que traduce el AST de SmallC a un stub de RISC-V.
 */
public class SmallCVisitorImpl extends SmallCBaseVisitor<String> {
    private int labelCnt = 0;
    private Map<String,Integer> varOffset = new HashMap<>();

    /** Genera etiquetas únicas */
    private String newLabel(String base) {
        return base + "_" + (labelCnt++);
    }

    /** Si no override devuelve cadena vacía en lugar de null */
    @Override
    protected String defaultResult() {
        return "";
    }

    /** Concatena dos resultados, ignorando null o cadena vacía */
    @Override
    protected String aggregateResult(String aggregate, String next) {
        if (aggregate == null || aggregate.isEmpty()) return next;
        if (next == null || next.isEmpty())       return aggregate;
        return aggregate + next;
    }

    @Override
    public String visitProgram(SmallCParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("# RISC-V ASM generado por Luis\n\n");
        for (ParseTree c : ctx.children) {
            sb.append(visit(c));
        }
        return sb.toString();
    }

    @Override
    public String visitFuncDecl(SmallCParser.FuncDeclContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("main:\n");
        sb.append("  addi sp, sp, -16    # prologue\n");
        sb.append("  sw   ra, 12(sp)\n\n");
        sb.append(visit(ctx.block()));
        sb.append("\n");
        sb.append("  lw   ra, 12(sp)\n");
        sb.append("  addi sp, sp, 16\n");
        sb.append("  ret\n\n");
        return sb.toString();
    }

    @Override
    public String visitVarDecl(SmallCParser.VarDeclContext ctx) {
        String name   = ctx.ID().getText();
        int offset    = (varOffset.size() + 1) * -4;
        varOffset.put(name, offset);

        String code = "";
        if (ctx.expr() != null) {
            code = visit(ctx.expr());
            code += String.format("  sw   t0, %d(sp)\n", offset);
        }
        return code;
    }

    @Override
    public String visitAssignStmt(SmallCParser.AssignStmtContext ctx) {
        String name = ctx.ID().getText();
        int    off  = varOffset.get(name);
        String code = visit(ctx.expr());
        code += String.format("  sw   t0, %d(sp)\n", off);
        return code;
    }

    @Override
    public String visitIfStmt(SmallCParser.IfStmtContext ctx) {
        String elseLbl = newLabel("else");
        String endLbl  = newLabel("endif");
        StringBuilder sb = new StringBuilder();

        // condición
        sb.append(visit(ctx.expr()));
        sb.append(String.format("  beq  t0, zero, %s\n", elseLbl));

        // then
        sb.append(visit(ctx.block(0)));
        sb.append(String.format("  j    %s\n", endLbl));

        // else?
        sb.append(elseLbl).append(":\n");
        if (ctx.block().size() > 1) {
            sb.append(visit(ctx.block(1)));
        }

        // fin
        sb.append(endLbl).append(":\n");
        return sb.toString();
    }

    @Override
    public String visitWhileStmt(SmallCParser.WhileStmtContext ctx) {
        String start = newLabel("loop");
        String end   = newLabel("endloop");
        StringBuilder sb = new StringBuilder();

        sb.append(start).append(":\n");
        sb.append(visit(ctx.expr()));
        sb.append(String.format("  beq  t0, zero, %s\n", end));
        sb.append(visit(ctx.block()));
        sb.append(String.format("  j    %s\n", start));
        sb.append(end).append(":\n");
        return sb.toString();
    }

    @Override
    public String visitExprStmt(SmallCParser.ExprStmtContext ctx) {
        return visit(ctx.expr());
    }

    // No override de visitExpr: usará defaultResult+visitChildren => devuelve ""
}
