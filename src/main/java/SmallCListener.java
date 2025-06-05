// Generated from SmallC.g4 by ANTLR 4.13.1
 package gramatica; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallCParser}.
 */
public interface SmallCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmallCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmallCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(SmallCParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(SmallCParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SmallCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SmallCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SmallCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SmallCParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SmallCParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SmallCParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SmallCParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SmallCParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SmallCParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SmallCParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(SmallCParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(SmallCParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(SmallCParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(SmallCParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SmallCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SmallCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(SmallCParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(SmallCParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(SmallCParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(SmallCParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(SmallCParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(SmallCParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SmallCParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SmallCParser.AtomContext ctx);
}