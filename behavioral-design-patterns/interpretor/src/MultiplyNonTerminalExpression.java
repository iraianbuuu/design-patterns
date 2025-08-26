public class MultiplyNonTerminalExpression implements AbstractExpression {
    AbstractExpression leftOperand;
    AbstractExpression rightOperand;

    MultiplyNonTerminalExpression(
            AbstractExpression leftOperand,
            AbstractExpression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Context context) {
        return leftOperand.interpret(context) * rightOperand.interpret(context);
    }

}
