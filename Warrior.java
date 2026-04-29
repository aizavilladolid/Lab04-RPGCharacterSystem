public class Warrior extends GameCharacter implements Defendable {
    public Warrior(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings a sword with " + getAttackPower() + " attack power!");
    }

    @Override
    public void describeClass() {
        System.out.println(getName() + " is a brave Warrior with strong melee skills.");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " raises a shield to block incoming damage!");
    }
}
