public class Randomizer {

    static String[] arrayName = new String[] {"Alex", "Bob", "Carl", "David"};
    static String[] arrayGun = new String[] {"Revolver", "Shotgun", "Bazooka", "Machete"};

    public Character random(Character character) {
        character.name = arrayName[(int) (Math.random() * (arrayName.length-1))];
        character.gun = arrayGun[(int) (Math.random() * (arrayGun.length-1))];
        character.power = (int) (Math.random() * 10);
        return character;
    }
}
