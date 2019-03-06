package domain;

import ability.Flyable;
import ability.Swimmable;
import ability.Walkable;
import domain.base.Oviparous;

public class Pigeon extends Oviparous implements Walkable, Swimmable, Flyable {

    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("Pppprrrrrrr ppprrrrr!");
    }

    @Override
    public void move(TerrainType terrainType) {
        if (terrainType == TerrainType.AIR) {
            fly();
        } else if (terrainType == TerrainType.GROUND) {
            walk();
        } else if (terrainType == TerrainType.WATER) {
            swim();
        } else {
            System.out.println(String.format("Not able to move on terrain type: %s.", terrainType.getType()));
        }
    }

    @Override
    public void fly() {
        System.out.println("Flying around.");
    }

    @Override
    public void swim() {
        System.out.println("More like floating in the water.");
    }

    @Override
    public void walk() {
        System.out.println("Walking only in front of cars.");
    }

    public void deliverMessage(String message) {
        System.out.println(String.format("Delivering message \"%s\"", message));
    }


}
