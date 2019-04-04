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



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Toorla_ActionsParser}.
 */
public interface Toorla_ActionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Toorla_ActionsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Toorla_ActionsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Toorla_ActionsParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Toorla_ActionsParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void enterEntryClass(Toorla_ActionsParser.EntryClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void exitEntryClass(Toorla_ActionsParser.EntryClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Toorla_ActionsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Toorla_ActionsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Toorla_ActionsParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Toorla_ActionsParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(Toorla_ActionsParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(Toorla_ActionsParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#typpe}.
	 * @param ctx the parse tree
	 */
	void enterTyppe(Toorla_ActionsParser.TyppeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#typpe}.
	 * @param ctx the parse tree
	 */
	void exitTyppe(Toorla_ActionsParser.TyppeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Toorla_ActionsParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Toorla_ActionsParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#multiArgs}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgs(Toorla_ActionsParser.MultiArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#multiArgs}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgs(Toorla_ActionsParser.MultiArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#funcArray}.
	 * @param ctx the parse tree
	 */
	void enterFuncArray(Toorla_ActionsParser.FuncArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#funcArray}.
	 * @param ctx the parse tree
	 */
	void exitFuncArray(Toorla_ActionsParser.FuncArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(Toorla_ActionsParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(Toorla_ActionsParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldStmt(Toorla_ActionsParser.FieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldStmt(Toorla_ActionsParser.FieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#fieldVars}.
	 * @param ctx the parse tree
	 */
	void enterFieldVars(Toorla_ActionsParser.FieldVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#fieldVars}.
	 * @param ctx the parse tree
	 */
	void exitFieldVars(Toorla_ActionsParser.FieldVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Toorla_ActionsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Toorla_ActionsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(Toorla_ActionsParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(Toorla_ActionsParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Toorla_ActionsParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Toorla_ActionsParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(Toorla_ActionsParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(Toorla_ActionsParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#multiVar}.
	 * @param ctx the parse tree
	 */
	void enterMultiVar(Toorla_ActionsParser.MultiVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#multiVar}.
	 * @param ctx the parse tree
	 */
	void exitMultiVar(Toorla_ActionsParser.MultiVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Toorla_ActionsParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Toorla_ActionsParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(Toorla_ActionsParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(Toorla_ActionsParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(Toorla_ActionsParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(Toorla_ActionsParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(Toorla_ActionsParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(Toorla_ActionsParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(Toorla_ActionsParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(Toorla_ActionsParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(Toorla_ActionsParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(Toorla_ActionsParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#completeIf}.
	 * @param ctx the parse tree
	 */
	void enterCompleteIf(Toorla_ActionsParser.CompleteIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#completeIf}.
	 * @param ctx the parse tree
	 */
	void exitCompleteIf(Toorla_ActionsParser.CompleteIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunc(Toorla_ActionsParser.ReturnFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunc(Toorla_ActionsParser.ReturnFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Toorla_ActionsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Toorla_ActionsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(Toorla_ActionsParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(Toorla_ActionsParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(Toorla_ActionsParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(Toorla_ActionsParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#halt}.
	 * @param ctx the parse tree
	 */
	void enterHalt(Toorla_ActionsParser.HaltContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#halt}.
	 * @param ctx the parse tree
	 */
	void exitHalt(Toorla_ActionsParser.HaltContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(Toorla_ActionsParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(Toorla_ActionsParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Toorla_ActionsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Toorla_ActionsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(Toorla_ActionsParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(Toorla_ActionsParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void enterEqualExp(Toorla_ActionsParser.EqualExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void exitEqualExp(Toorla_ActionsParser.EqualExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#compareExp}.
	 * @param ctx the parse tree
	 */
	void enterCompareExp(Toorla_ActionsParser.CompareExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#compareExp}.
	 * @param ctx the parse tree
	 */
	void exitCompareExp(Toorla_ActionsParser.CompareExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(Toorla_ActionsParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(Toorla_ActionsParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#multExp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(Toorla_ActionsParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#multExp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(Toorla_ActionsParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(Toorla_ActionsParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(Toorla_ActionsParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#callExp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(Toorla_ActionsParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#callExp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(Toorla_ActionsParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#newExp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(Toorla_ActionsParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#newExp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(Toorla_ActionsParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Toorla_ActionsParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Toorla_ActionsParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(Toorla_ActionsParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(Toorla_ActionsParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#otherCall}.
	 * @param ctx the parse tree
	 */
	void enterOtherCall(Toorla_ActionsParser.OtherCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#otherCall}.
	 * @param ctx the parse tree
	 */
	void exitOtherCall(Toorla_ActionsParser.OtherCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#methodTempCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodTempCall(Toorla_ActionsParser.MethodTempCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#methodTempCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodTempCall(Toorla_ActionsParser.MethodTempCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(Toorla_ActionsParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(Toorla_ActionsParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void enterSingleCall(Toorla_ActionsParser.SingleCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void exitSingleCall(Toorla_ActionsParser.SingleCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(Toorla_ActionsParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(Toorla_ActionsParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(Toorla_ActionsParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(Toorla_ActionsParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Toorla_ActionsParser#paranExp}.
	 * @param ctx the parse tree
	 */
	void enterParanExp(Toorla_ActionsParser.ParanExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Toorla_ActionsParser#paranExp}.
	 * @param ctx the parse tree
	 */
	void exitParanExp(Toorla_ActionsParser.ParanExpContext ctx);
}