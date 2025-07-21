public class OpenTextFileOperation implements TextFileOperation {
    TextFile textfile;

    OpenTextFileOperation(TextFile textFile) {
        this.textfile = textFile;
    }

    @Override
    public String execute() {
        return textfile.open();
    }
}
