public class Character_ {
    char character;
    String font;
    int size;
    int row;
    int column;

    public Character_(char character, String font, int size, int row, int column) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.row = row;
        this.column = column;
    }

    public void display() {
        System.out.println("Character: " + character + " Font: " + font + " Size: " + size + " Row: " + row
                + " Column: " + column);
    }
}
