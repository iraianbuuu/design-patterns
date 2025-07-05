public class SpeedUpdgrade extends Upgrade {

    private int speed;

    public SpeedUpdgrade(Character character, int speed) {
        super(character);
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speed;
    }
}
