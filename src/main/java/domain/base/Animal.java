package domain.base;

import ability.Movable;
import domain.TerrainType;

public abstract class Animal implements Movable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void shout();

    public abstract void lay();

    public abstract void move(TerrainType terrainType);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
