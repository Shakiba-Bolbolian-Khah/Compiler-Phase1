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



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToorlaParser}.
 */
public interface ToorlaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ToorlaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ToorlaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void enterEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void exitEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(ToorlaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(ToorlaParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#typpe}.
	 * @param ctx the parse tree
	 */
	void enterTyppe(ToorlaParser.TyppeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#typpe}.
	 * @param ctx the parse tree
	 */
	void exitTyppe(ToorlaParser.TyppeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#multiArgs}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgs(ToorlaParser.MultiArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#multiArgs}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgs(ToorlaParser.MultiArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#funcArray}.
	 * @param ctx the parse tree
	 */
	void enterFuncArray(ToorlaParser.FuncArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#funcArray}.
	 * @param ctx the parse tree
	 */
	void exitFuncArray(ToorlaParser.FuncArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(ToorlaParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(ToorlaParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldStmt(ToorlaParser.FieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldStmt(ToorlaParser.FieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#fieldVars}.
	 * @param ctx the parse tree
	 */
	void enterFieldVars(ToorlaParser.FieldVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#fieldVars}.
	 * @param ctx the parse tree
	 */
	void exitFieldVars(ToorlaParser.FieldVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(ToorlaParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(ToorlaParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ToorlaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ToorlaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(ToorlaParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(ToorlaParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#multiVar}.
	 * @param ctx the parse tree
	 */
	void enterMultiVar(ToorlaParser.MultiVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#multiVar}.
	 * @param ctx the parse tree
	 */
	void exitMultiVar(ToorlaParser.MultiVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ToorlaParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ToorlaParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(ToorlaParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(ToorlaParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(ToorlaParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(ToorlaParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#ifWithoutElse}.
	 * @param ctx the parse tree
	 */
	void enterIfWithoutElse(ToorlaParser.IfWithoutElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#ifWithoutElse}.
	 * @param ctx the parse tree
	 */
	void exitIfWithoutElse(ToorlaParser.IfWithoutElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(ToorlaParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(ToorlaParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(ToorlaParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(ToorlaParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(ToorlaParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(ToorlaParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#completeIf}.
	 * @param ctx the parse tree
	 */
	void enterCompleteIf(ToorlaParser.CompleteIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#completeIf}.
	 * @param ctx the parse tree
	 */
	void exitCompleteIf(ToorlaParser.CompleteIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunc(ToorlaParser.ReturnFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunc(ToorlaParser.ReturnFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(ToorlaParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(ToorlaParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(ToorlaParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(ToorlaParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#halt}.
	 * @param ctx the parse tree
	 */
	void enterHalt(ToorlaParser.HaltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#halt}.
	 * @param ctx the parse tree
	 */
	void exitHalt(ToorlaParser.HaltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(ToorlaParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(ToorlaParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void enterEqualExp(ToorlaParser.EqualExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void exitEqualExp(ToorlaParser.EqualExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#compareExp}.
	 * @param ctx the parse tree
	 */
	void enterCompareExp(ToorlaParser.CompareExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#compareExp}.
	 * @param ctx the parse tree
	 */
	void exitCompareExp(ToorlaParser.CompareExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(ToorlaParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(ToorlaParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#multExp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(ToorlaParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#multExp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(ToorlaParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(ToorlaParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(ToorlaParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#callExp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(ToorlaParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#callExp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(ToorlaParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#newExp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(ToorlaParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#newExp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(ToorlaParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ToorlaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ToorlaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ToorlaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ToorlaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#otherCall}.
	 * @param ctx the parse tree
	 */
	void enterOtherCall(ToorlaParser.OtherCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#otherCall}.
	 * @param ctx the parse tree
	 */
	void exitOtherCall(ToorlaParser.OtherCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#methodTempCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodTempCall(ToorlaParser.MethodTempCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#methodTempCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodTempCall(ToorlaParser.MethodTempCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(ToorlaParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(ToorlaParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void enterSingleCall(ToorlaParser.SingleCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#singleCall}.
	 * @param ctx the parse tree
	 */
	void exitSingleCall(ToorlaParser.SingleCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ToorlaParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ToorlaParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ToorlaParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ToorlaParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#paranExp}.
	 * @param ctx the parse tree
	 */
	void enterParanExp(ToorlaParser.ParanExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#paranExp}.
	 * @param ctx the parse tree
	 */
	void exitParanExp(ToorlaParser.ParanExpContext ctx);
}