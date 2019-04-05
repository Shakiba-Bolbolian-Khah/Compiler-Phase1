package toorla.visitor;

import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.EntryClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.MethodDeclaration;
import toorla.ast.declaration.localVarDecs.ParameterDeclaration;
import toorla.ast.expression.*;
import toorla.ast.expression.binaryExpression.*;
import toorla.ast.expression.unaryExpression.Neg;
import toorla.ast.expression.unaryExpression.Not;
import toorla.ast.expression.value.BoolValue;
import toorla.ast.expression.value.IntValue;
import toorla.ast.expression.value.StringValue;
import toorla.ast.statement.*;
import toorla.ast.statement.localVarStats.LocalVarDef;
import toorla.ast.statement.localVarStats.LocalVarsDefinitions;
import toorla.ast.statement.returnStatement.Return;

import java.util.List;

public class TreePrinter implements Visitor<Void> {
    //TODO : Implement all visit methods in TreePrinter to print AST as required in phase1 document
    @Override
    public Void visit(PrintLine printStat) {
        Expression arg = printStat.getArg();
        System.out.println("( print" + arg.accept(this) + ")");
        return null;
    }

    @Override
    public Void visit(Assign assignStat) {
        Expression lvalue,rvalue;
        lvalue = assignStat.getLvalue();
        rvalue = assignStat.getRvalue();
        System.out.println("( = " + lvalue.accept(this) + rvalue.accept(this) + ")");
        return null;
    }

    @Override
    public Void visit(Block block) {
        List<Statement> body = block.body;
        System.out.println("(");
        for (int i = 0; i < body.size(); i++)
            System.out.println(body.get(i).accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Conditional conditional) {
        System.out.println("( if");
        System.out.println(conditional.getCondition().accept(this));
        System.out.println(conditional.getThenStatement().accept(this));
        System.out.println(conditional.getElseStatement().accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(While whileStat) {
        System.out.println("( while ");
        System.out.println(whileStat.expr.accept(this));
        System.out.println(whileStat.body.accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Return returnStat) {
        System.out.println("( return");
        System.out.println(returnStat.getReturnedExpr().accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Break breakStat) {
        System.out.println(breakStat.toString());
        return null;
    }

    @Override
    public Void visit(Continue continueStat) {
        System.out.println(continueStat.toString());
        return null;
    }

    @Override
    public Void visit(Skip skip) {
        System.out.println(skip.toString());
        return null;
    }

    @Override
    public Void visit(LocalVarDef localVarDef) {
        System.out.println("( var ");
        System.out.println(localVarDef.getLocalVarName().accept(this));
        System.out.println(localVarDef.getInitialValue().accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(IncStatement incStatement) {
        System.out.println("( ++");
        System.out.println(incStatement.getOperand().accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(DecStatement decStatement) {
        System.out.println("( ++");
        System.out.println(decStatement.getOperand().accept(this));
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Plus plusExpr) {
        return null;
    }

    @Override
    public Void visit(Minus minusExpr) {
        return null;
    }

    @Override
    public Void visit(Times timesExpr) {
        return null;
    }

    @Override
    public Void visit(Division divExpr) {
        return null;
    }

    @Override
    public Void visit(Modulo moduloExpr) {
        return null;
    }

    @Override
    public Void visit(Equals equalsExpr) {
        return null;
    }

    @Override
    public Void visit(GreaterThan gtExpr) {
        return null;
    }

    @Override
    public Void visit(LessThan lessThanExpr) {
        return null;
    }

    @Override
    public Void visit(And andExpr) {
        return null;
    }

    @Override
    public Void visit(Or orExpr) {
        return null;
    }

    @Override
    public Void visit(Neg negExpr) {
        return null;
    }

    @Override
    public Void visit(Not notExpr) {
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        return null; 
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(Self self) {
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(NewArray newArray) {
        return null;
    }

    @Override
    public Void visit(BoolValue booleanValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        return null;
    }

    @Override
    public Void visit(FieldCall fieldCall) {
        return null;
    }

    @Override
    public Void visit(ArrayCall arrayCall) {
        return null;
    }

    @Override
    public Void visit(NotEquals notEquals) {
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) { return null; }

    @Override
    public Void visit(EntryClassDeclaration entryClassDeclaration) {
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        return null;
    }

    @Override
    public Void visit(LocalVarsDefinitions localVarsDefinitions) {
        return null;
    }

    @Override
    public Void visit(Program program) {
        return null;
    }
}
