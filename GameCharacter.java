/**
 * Abstract base class for all RPG characters.
 * Provides common fields, encapsulation, and shared behavior.
 */
public abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;

  
    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = (hp > 0) ? hp : 1; // ensure positive HP
        this.attackPower = (attackPower > 0) ? attackPower : 1; // ensure positive attack power
    }

    
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getAttackPower() { return attackPower; }

    
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.hp = (hp > 0) ? hp : this.hp; }
    public void setAttackPower(int attackPower) { 
        this.attackPower = (attackPower > 0) ? attackPower : this.attackPower; 
    }


    public void rest() {
        hp += 10;
        System.out.println(name + " rests and recovers 10 HP. Current HP: " + hp);
    }

   
    public abstract void attack();
    public abstract void describeClass();
}
