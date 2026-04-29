public class Mage extends GameCharacter implements CasterAbility {
    public Mage(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts a fireball with " + getAttackPower() + " magic power!");
    }

    @Override
    public void describeClass() {
        System.out.println(getName() + " is a wise Mage with powerful spellcasting abilities.");
    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " channels arcane energy to unleash a spell!");
    }
}
