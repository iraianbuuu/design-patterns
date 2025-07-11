public class Main {
    public static void main(String... args) {

        // Without Flyweight
        Character_ character1 = new Character_('A', "Arial", 12, 0, 0);
        Character_ character2 = new Character_('B', "Arial", 12, 0, 1);
        character1.display();
        character2.display();

        // With Flyweight
        Letter letter1 = LetterFactory.createLetter('A');
        Letter letter2 = LetterFactory.createLetter('B');
        Letter letter3 = LetterFactory.createLetter('A');
        letter1.display(0, 0);
        letter2.display(0, 1);
        letter3.display(0, 6);
    }
}
