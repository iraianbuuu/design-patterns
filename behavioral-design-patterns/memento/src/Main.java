public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Welcome");
        editor.write("Welcome to");
        editor.write("Welcome to Mars");
        editor.write("Welcome to Mars and Jupiter");
        editor.restore(3);
        System.out.println(editor.display());
    }
}
