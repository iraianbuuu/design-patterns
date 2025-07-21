public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file1.txt");
        System.out.println(textFileOperationExecutor.executeOperation(textFile::open));
        System.out.println(textFileOperationExecutor.executeOperation(textFile::save));
    }
}
