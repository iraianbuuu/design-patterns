public class Main {
    public static void main(String... args) {
        Directory root = new Directory("/root");
        root.add(new File("file1.txt"), new File("file2.txt"));

        Directory home = new Directory("/home");
        home.add(new File("file3.txt"), new File("file4.txt"));

        root.add(home);
        root.display();
    }
}
