public class SaveTextFileOperation implements TextFileOperation {
    TextFile textfile;

    SaveTextFileOperation(TextFile textFile) {
        this.textfile = textFile;
    }

    @Override
    public String execute() {
        return textfile.save();
    }
}
