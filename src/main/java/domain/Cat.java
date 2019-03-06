package domain;

import ability.Swimmable;
import ability.Walkable;
import domain.base.Mammal;

public class Cat extends Mammal implements Walkable, Swimmable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("Meowwwwwww!");
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
        System.out.println("Jumping around like a ninja.");
    }

    @Override
    public void swim() {
        System.out.println("GET ME OUT OF HERE!");
    }

    public void scratch(){
        System.out.println("Scratching my owner for no reason...");
    }
}
