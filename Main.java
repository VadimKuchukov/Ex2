public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Randomizer randomizer = new Randomizer();
        randomizer.random(character);
        System.out.println(character.name);
        System.out.println(character.gun);
        System.out.println(character.power);

    }


}
