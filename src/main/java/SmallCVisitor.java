// Generated from SmallC.g4 by ANTLR 4.13.1
 package gramatica; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmallCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmallCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmallCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SmallCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(SmallCParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SmallCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SmallCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SmallCParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(SmallCParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(SmallCParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(SmallCParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(SmallCParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SmallCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(SmallCParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(SmallCParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(SmallCParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SmallCParser.AtomContext ctx);
}