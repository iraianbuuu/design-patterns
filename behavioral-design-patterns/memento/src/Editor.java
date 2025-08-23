import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        this.stateHistory = new ArrayList<>();
        this.textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapShot());
    }

    public void restore(int position) {
        textArea.restore(stateHistory.get(position));
    }

    public String display() {
        return textArea.getText();
    }
}
