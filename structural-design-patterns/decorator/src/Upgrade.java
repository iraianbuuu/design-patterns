public abstract class Upgrade implements Character {

    protected Character character;

    public Upgrade(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public void move() {
        character.move();
    }

    @Override
    public int getHealth() {
        return character.getHealth();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed();
    }

    @Override
    public int getAttack() {
        return character.getAttack();
    }
}
