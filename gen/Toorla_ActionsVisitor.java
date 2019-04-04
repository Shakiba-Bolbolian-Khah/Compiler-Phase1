// Generated from /home/hosna/IdeaProjects/ph1/grammar/Toorla_Actions.g4 by ANTLR 4.7.2

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
 * by {@link Toorla_ActionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Toorla_ActionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Toorla_ActionsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Toorla_ActionsParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#entryClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryClass(Toorla_ActionsParser.EntryClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Toorla_ActionsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(Toorla_ActionsParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(Toorla_ActionsParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#typpe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyppe(Toorla_ActionsParser.TyppeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Toorla_ActionsParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#multiArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgs(Toorla_ActionsParser.MultiArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#funcArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArray(Toorla_ActionsParser.FuncArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(Toorla_ActionsParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#fieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldStmt(Toorla_ActionsParser.FieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#fieldVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldVars(Toorla_ActionsParser.FieldVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Toorla_ActionsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(Toorla_ActionsParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Toorla_ActionsParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation(Toorla_ActionsParser.InstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#multiVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVar(Toorla_ActionsParser.MultiVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(Toorla_ActionsParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#whileBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBody(Toorla_ActionsParser.WhileBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#ifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(Toorla_ActionsParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(Toorla_ActionsParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStmt(Toorla_ActionsParser.ElifStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(Toorla_ActionsParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#completeIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteIf(Toorla_ActionsParser.CompleteIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#returnFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunc(Toorla_ActionsParser.ReturnFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Toorla_ActionsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#printFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(Toorla_ActionsParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(Toorla_ActionsParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#halt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHalt(Toorla_ActionsParser.HaltContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(Toorla_ActionsParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Toorla_ActionsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#andExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(Toorla_ActionsParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#equalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExp(Toorla_ActionsParser.EqualExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#compareExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExp(Toorla_ActionsParser.CompareExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(Toorla_ActionsParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#multExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(Toorla_ActionsParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(Toorla_ActionsParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#callExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(Toorla_ActionsParser.CallExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(Toorla_ActionsParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Toorla_ActionsParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Toorla_ActionsParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#otherCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherCall(Toorla_ActionsParser.OtherCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#methodTempCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTempCall(Toorla_ActionsParser.MethodTempCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#argCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgCall(Toorla_ActionsParser.ArgCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#singleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCall(Toorla_ActionsParser.SingleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Toorla_ActionsParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(Toorla_ActionsParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Toorla_ActionsParser#paranExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanExp(Toorla_ActionsParser.ParanExpContext ctx);
}