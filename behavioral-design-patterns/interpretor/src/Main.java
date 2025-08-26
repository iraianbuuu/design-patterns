public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 3);
        context.put("c", 4);
        context.put("d", 5);

        AbstractExpression expression = new AddNonTerminalExpression(
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(
                        new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));

        AbstractExpression result = new ArithmeticNonTerminalExpression(
                new ArithmeticNonTerminalExpression(
                        new NumberTerminalExpression("a"),
                        new NumberTerminalExpression("b"),
                        '*'),
                new ArithmeticNonTerminalExpression(
                        new NumberTerminalExpression("c"),
                        new NumberTerminalExpression("d"),
                        '*'),
                '+');

        System.out.println(expression.interpret(context));
        System.out.println(result.interpret(context));
    }
}