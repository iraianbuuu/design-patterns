public class TextFile {
    private String name;

    TextFile(String name) {
        this.name = name;
    }

    public String save() {
        return "Saving the file " + name;
    }

    public String open() {
        return "Opening a file " + name;
    }
}
