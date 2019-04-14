// Generated from /home/hosna/IdeaProjects/ph1/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.*;
    import toorla.ast.declaration.*;
    import toorla.ast.declaration.classDecs.*;
    import toorla.ast.declaration.classDecs.classMembersDecs.*;
    import toorla.ast.declaration.localVarDecs.*;
    import toorla.ast.expression.*;
    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.unaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.statement.*;
    import toorla.ast.statement.localVarStats.*;
    import toorla.ast.statement.returnStatement.*;
    import toorla.types.*;
    import toorla.types.arrayType.*;
    import toorla.types.singleType.*;



import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ToorlaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ToorlaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ToorlaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(ToorlaParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#typpe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyppe(ToorlaParser.TyppeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#multiArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgs(ToorlaParser.MultiArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#funcArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArray(ToorlaParser.FuncArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(ToorlaParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#fieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldStmt(ToorlaParser.FieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#fieldVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldVars(ToorlaParser.FieldVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(ToorlaParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ToorlaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation(ToorlaParser.InstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#multiVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVar(ToorlaParser.MultiVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ToorlaParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#whileBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBody(ToorlaParser.WhileBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#ifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(ToorlaParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#ifWithoutElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfWithoutElse(ToorlaParser.IfWithoutElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(ToorlaParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStmt(ToorlaParser.ElifStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(ToorlaParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#completeIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteIf(ToorlaParser.CompleteIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#returnFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunc(ToorlaParser.ReturnFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#printFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(ToorlaParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(ToorlaParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#halt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHalt(ToorlaParser.HaltContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#andExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(ToorlaParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#equalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExp(ToorlaParser.EqualExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#compareExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExp(ToorlaParser.CompareExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(ToorlaParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#multExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(ToorlaParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(ToorlaParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#callExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(ToorlaParser.CallExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(ToorlaParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ToorlaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ToorlaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#otherCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherCall(ToorlaParser.OtherCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#methodTempCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTempCall(ToorlaParser.MethodTempCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#argCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgCall(ToorlaParser.ArgCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#singleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCall(ToorlaParser.SingleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ToorlaParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ToorlaParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#paranExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanExp(ToorlaParser.ParanExpContext ctx);
}