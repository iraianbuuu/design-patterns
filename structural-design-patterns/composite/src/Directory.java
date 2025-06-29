import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> files;

    Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystem file : files) {
            file.display();
        }
        System.out.println();
    }

    public void add(FileSystem... fileSystems) {
        files.addAll(Arrays.asList(fileSystems));
    }
}
