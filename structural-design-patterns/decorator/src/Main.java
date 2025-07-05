public class Main {
    public static void main(String[] args) {
        Character character = new DefaultCharacter();
        character = new AttackUpgrade(character, 10);
        character = new SpeedUpdgrade(new AttackUpgrade(character, 30), 20);
        System.out.println(character.getAttack());
        System.out.println(character.getSpeed());
    }
}
