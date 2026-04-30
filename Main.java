import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GameCharacter> party = new ArrayList<>();

        party.add(new Warrior("Aiza", 100, 20));
        party.add(new Mage("Ian", 80, 25));
        party.add(new Archer("Ashley", 90, 18));

        for (GameCharacter character : party) {
            character.describeClass();
            character.attack();
            character.rest();

            if (character instanceof Warrior) {
                ((Warrior) character).defend();
            } else if (character instanceof Mage) {
                ((Mage) character).castSpell();
            } else if (character instanceof Archer) {
                ((Archer) character).useBowSkill();
            }

            System.out.println();
        }
    }
}
