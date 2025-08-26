public class NumberTerminalExpression implements AbstractExpression {
    private String number;

    NumberTerminalExpression(String number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return context.get(number);
    }

}
