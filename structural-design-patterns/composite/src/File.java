public class File implements FileSystem {
    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File name: " + name);
    }
}
