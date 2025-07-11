import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, Letter> lettersCache = new HashMap<>();

    public static Letter createLetter(char character) {
        if (!lettersCache.containsKey(character)) {
            lettersCache.put(character, new DocumentCharacter(character, "Arial", 12));
        }
        return lettersCache.get(character);
    }
}
