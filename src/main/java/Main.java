import domain.Cat;
import domain.Dog;
import domain.Pigeon;
import domain.TerrainType;
import domain.base.Animal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Tom");
        Pigeon pigeon = new Pigeon("Pidgeotto");

        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = pigeon;

        makeThemLay(animals);
        makeThemShout(animals);
        makeThemMoveOn(animals, TerrainType.AIR);
        makeThemMoveOn(animals, TerrainType.GROUND);
        makeThemMoveOn(animals, TerrainType.WATER);
        makeThemDoSpecificStuff(animals);


        // Getting all TerrainType(s) as an array with .values() method
        for (TerrainType terrainType : TerrainType.values()) {
            makeThemSmartMoveOn(animals, terrainType);
        }
    }

    private static void makeThemLay(Animal[] animals) {
        System.out.println("--------------------------");
        System.out.println("Making the animals lay...");
        for (Animal animal : animals) {
            System.out.println(String.format("%s:", animal.getName()));
            animal.lay();
            System.out.println();
        }
    }

    private static void makeThemShout(Animal[] animals) {
        System.out.println("--------------------------");
        System.out.println("Making the animals shout...");
        for (Animal animal : animals) {
            System.out.println(String.format("%s:", animal.getName()));
            animal.shout();
            System.out.println();
        }
    }

    private static void makeThemMoveOn(Animal[] animals, TerrainType terrainType) {
        System.out.println("--------------------------");
        System.out.println(String.format("Making the animals move on the %s...", terrainType.getType()));
        for (Animal animal : animals) {
            System.out.println(String.format("%s:", animal.getName()));
            animal.move(terrainType);
            System.out.println();
        }
    }

    private static void makeThemDoSpecificStuff(Animal[] animals) {
        // At this point we only have access to a reference of an animals array
        // Suppose we "know" the exact actual type of each animal we can use casting.
        // If we get something wrong though, we will get a ClassCastException
        // TODO  How could we know if an animal is a Dog, Cat or a Pigeon and then safely cast and call the respective specific methods?
        System.out.println("--------------------------");
        System.out.println("Making the animals do specific stuff...");
        System.out.println(String.format("%s:", animals[0].getName()));
        ((Dog) animals[0]).catchTheStick();
        System.out.println();
        System.out.println(String.format("%s:", animals[1].getName()));
        ((Cat) animals[1]).scratch();
        System.out.println();
        System.out.println(String.format("%s:", animals[2].getName()));
        ((Pigeon) animals[2]).deliverMessage("Hello World!");
        System.out.println();
        //The following line will cause a ClassCastException.
        try {
            ((Pigeon) animals[0]).deliverMessage("Told ya!");
        } catch (ClassCastException classCastException) {
            System.out.println("Told ya, printing stacktrace just for reference");
            classCastException.printStackTrace();
        }
    }

    private static void makeThemSmartMoveOn(Animal[] animals, TerrainType terrainType) {
        System.out.println("--------------------------");
        System.out.println(String.format("Making the animals (smart) move on the %s...", terrainType.getType()));
        for (Animal animal : animals) {
            System.out.println(String.format("%s:", animal.getName()));
            animal.smartMove(terrainType);
            System.out.println();
        }
    }
}
