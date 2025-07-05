public class AttackUpgrade extends Upgrade {

    private int attack;

    public AttackUpgrade(Character character, int attack) {
        super(character);
        this.attack = attack;
    }

    @Override
    public void attack() {
        System.out.println("Attack upgrade");
    }

    @Override
    public void move() {
        System.out.println("Move upgrade");
    }

    @Override
    public int getAttack() {
        return character.getAttack() + attack;
    }
}
