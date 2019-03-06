package domain;

import ability.Swimmable;
import ability.Walkable;
import domain.base.Mammal;

public class Dog extends Mammal implements Walkable, Swimmable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("Woof woof!");
    }

    @Override
    public void move(TerrainType terrainType) {
        if (terrainType == TerrainType.GROUND) {
            walk();
        } else if (terrainType == TerrainType.WATER) {
            swim();
        } else {
            System.out.println(String.format("Not able to move on terrain type: %s.", terrainType.getType()));
        }
    }

    @Override
    public void walk() {
        System.out.println("Running around for no reason.");
    }

    @Override
    public void swim() {
        System.out.println("Love swimming!");
    }

    public void catchTheStick() {
        System.out.println("Yay! I will chase the stick!!");
    }

}
