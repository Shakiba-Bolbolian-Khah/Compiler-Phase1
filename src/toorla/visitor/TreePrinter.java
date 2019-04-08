package toorla.visitor;

import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.EntryClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
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

import java.util.ArrayList;
import java.util.List;

public class TreePrinter implements Visitor<Void> {
    //TODO : Implement all visit methods in TreePrinter to print AST as required in phase1 document
    @Override
    public Void visit(PrintLine printStat) {
        Expression arg = printStat.getArg();
        System.out.println("( print");
        arg.accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Assign assignStat) {
        Expression lvalue,rvalue;
        lvalue = assignStat.getLvalue();
        rvalue = assignStat.getRvalue();
        System.out.println("( = " );
        lvalue.accept(this);
        rvalue.accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Block block) {
        List<Statement> body = block.body;
        System.out.println("(");
        for (int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Conditional conditional) {
        System.out.println("( if");
        conditional.getCondition().accept(this);
        conditional.getThenStatement().accept(this);
        conditional.getElseStatement().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(While whileStat) {
        System.out.println("( while ");
        whileStat.expr.accept(this);
        whileStat.body.accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Return returnStat) {
        System.out.println("( return");
        returnStat.getReturnedExpr().accept(this);
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
        localVarDef.getLocalVarName().accept(this);
        localVarDef.getInitialValue().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(IncStatement incStatement) {
        System.out.println("( ++");
        incStatement.getOperand().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(DecStatement decStatement) {
        System.out.println("( --");
        decStatement.getOperand().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Plus plusExpr) {
        System.out.println("( + " );
        plusExpr.getLhs().accept(this);
        System.out.println("\t");
        plusExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Minus minusExpr) {
        System.out.println("( - " );
        minusExpr.getLhs().accept(this);
        System.out.println("\t");
        minusExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Times timesExpr) {
        System.out.println("( * " );
        timesExpr.getLhs().accept(this);
        System.out.println("\t");
        timesExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Division divExpr) {
        System.out.println("( / " );
        divExpr.getLhs().accept(this);
        System.out.println("\t");
        divExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Modulo moduloExpr) {
        System.out.println("( % " );
        moduloExpr.getLhs().accept(this);
        System.out.println("\t");
        moduloExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Equals equalsExpr) {
        System.out.println("( == " );
        equalsExpr.getLhs().accept(this);
        System.out.println("\t");
        equalsExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(GreaterThan gtExpr) {
        System.out.println("( > " );
        gtExpr.getLhs().accept(this);
        System.out.println("\t");
        gtExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(LessThan lessThanExpr) {
        System.out.println("( < " );
        lessThanExpr.getLhs().accept(this);
        System.out.println("\t");
        lessThanExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(And andExpr) {
        System.out.println("( && " );
        andExpr.getLhs().accept(this);
        System.out.println("\t");
        andExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Or orExpr) {
        System.out.println("( || " );
        orExpr.getLhs().accept(this);
        System.out.println("\t");
        orExpr.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Neg negExpr) {
        System.out.println("( -  ");
        negExpr.getExpr().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(Not notExpr) {
        System.out.println("( !  ");
        notExpr.getExpr().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        ArrayList<Expression> args = methodCall.getArgs();
        System.out.println("( . ");
        methodCall.getInstance().accept(this);
        System.out.println("\t");
        methodCall.getMethodName().accept(this);
        System.out.println("(");
        for (int i = 0; i < args.size();i++)
            args.get(i).accept(this);
        System.out.println("))");
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {

        String str = identifier.toString();
        if (str != "(Identifier,Dummy)")
            System.out.println(str);
        return null;
    }

    @Override
    public Void visit(Self self) {
        System.out.println(self.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println(intValue.toString());
        return null;
    }

    @Override
    public Void visit(NewArray newArray) {
        System.out.println("( new arrayof " + newArray.getType().toString());
        newArray.getLength().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(BoolValue booleanValue) {
        System.out.println(booleanValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println(stringValue.toString());
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println("(new ");
        newClassInstance.getClassName().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(FieldCall fieldCall) {
        System.out.println("( . ");
        fieldCall.getInstance().accept(this);
        System.out.println("\t");
        fieldCall.getField().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(ArrayCall arrayCall) {
        System.out.println("( [] ");
        arrayCall.getInstance().accept(this);
        System.out.println("\t");
        arrayCall.getIndex().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(NotEquals notEquals) {
        System.out.println("( <> " );
        notEquals.getLhs().accept(this);
        System.out.println("\t");
        notEquals.getRhs().accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println("( class " );
        classDeclaration.getName().accept(this);
        classDeclaration.getParentName().accept(this);
        ArrayList<ClassMemberDeclaration> members = classDeclaration.getClassMembers();
        for (int i = 0; i < members.size(); i++)
            members.get(i).accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(EntryClassDeclaration entryClassDeclaration) {
        System.out.println("( entry class " );
        entryClassDeclaration.getName().accept(this);
        entryClassDeclaration.getParentName().accept(this);
        ArrayList<ClassMemberDeclaration> members = entryClassDeclaration.getClassMembers();
        for (int i = 0; i < members.size(); i++)
            members.get(i).accept(this);
        System.out.println(")");
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        System.out.println("( " + fieldDeclaration.getAccessModifier().toString() + " field ");
        fieldDeclaration.getIdentifier().accept(this);
        System.out.println(fieldDeclaration.getType().toString() + ")");
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        System.out.println("( ");
        parameterDeclaration.getIdentifier().accept(this);
        System.out.println(":" + parameterDeclaration.getType().toString() + ")");
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        ArrayList<ParameterDeclaration> args = methodDeclaration.getArgs();
        ArrayList<Statement> body = methodDeclaration.getBody();
        System.out.println("( " + methodDeclaration.getAccessModifier().toString() + "method");
        methodDeclaration.getName().accept(this);
        for (int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
        System.out.println(methodDeclaration.getReturnType().toString());
        System.out.println("(");
        for (int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        System.out.println(")\n)");
        return null;
    }

    @Override
    public Void visit(LocalVarsDefinitions localVarsDefinitions) {
        List<LocalVarDef> definitions = localVarsDefinitions.getVarDefinitions();
        for (int i = 0; i < definitions.size(); i++)
            definitions.get(i).accept(this);
        return null;
    }

    @Override
    public Void visit(Program program) {
        List<ClassDeclaration> classes = program.getClasses();
        System.out.println("(");
        for (int i = 0; i < classes.size(); i++)
            classes.get(i).accept(this);
        System.out.println(")");
        return null;
    }
}
