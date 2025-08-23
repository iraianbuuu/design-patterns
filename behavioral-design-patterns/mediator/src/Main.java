public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User A = new UserImpl(mediator, "A");
        User B = new UserImpl(mediator, "B");
        User C = new UserImpl(mediator, "C");
        User D = new UserImpl(mediator, "D");
        User E = new UserImpl(mediator, "E");

        mediator.addUser(A);
        mediator.addUser(B);
        mediator.addUser(C);
        mediator.addUser(D);
        mediator.addUser(E);

        A.send("Welcome to the chat!!!");
    }
}