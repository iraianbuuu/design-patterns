public class ArithmeticNonTerminalExpression implements AbstractExpression {
    AbstractExpression leftOperand;
    AbstractExpression rightOperand;
    Character operation;

    ArithmeticNonTerminalExpression(
            AbstractExpression leftOperand,
            AbstractExpression rightOperand,
            Character operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    @Override
    public int interpret(Context context) {
        switch (operation) {
            case '+':
                return leftOperand.interpret(context) + rightOperand.interpret(context);
            case '*':
                return leftOperand.interpret(context) * rightOperand.interpret(context);
            default:
                return 0;
        }
    }
}
