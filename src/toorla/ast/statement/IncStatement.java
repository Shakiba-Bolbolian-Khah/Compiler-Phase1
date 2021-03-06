package toorla.ast.statement;

import toorla.ast.expression.Expression;
import toorla.visitor.Visitor;

public class IncStatement extends Statement {
    private Expression operand;

    public IncStatement(Expression operand) {
        this.operand = operand;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit( this );
    }

    @Override
    public String toString() {
        return "IncStat";
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }
}
