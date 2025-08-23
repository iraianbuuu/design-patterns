public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text.toString();
    }

    public Memento takeSnapShot() {
        return new Memento(this.text.toString());
    }

    public void restore(Memento memento) {
        text = memento.getCurrentState();
    }

    public static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getCurrentState() {
            return text;
        }
    }
}