public class DefaultCharacter implements Character {

    private int health = 100;
    private int speed = 10;
    private int attack = 10;

    @Override
    public void attack() {
        System.out.println("Default character attacks");
    }

    @Override
    public void move() {
        System.out.println("Default character moves");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getAttack() {
        return attack;
    }

}
