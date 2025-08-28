public class Main {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println();
        game = new Tennis();
        game.play();
    }
}
