public class Archer extends GameCharacter {
    public Archer(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots an arrow with " + getAttackPower() + " precision!");
    }

    @Override
    public void describeClass() {
        System.out.println(getName() + " is a skilled Archer with deadly ranged attacks.");
    }

    public void useBowSkill() {
        System.out.println(getName() + " uses a special bow skill for extra damage!");
    }
}
