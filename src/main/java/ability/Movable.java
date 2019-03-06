package ability;

import domain.TerrainType;

public interface Movable {

    default void smartMove(TerrainType terrainType) {
        if (terrainType == TerrainType.GROUND && this instanceof Walkable) {
            ((Walkable) this).walk();
        } else if (terrainType == TerrainType.WATER && this instanceof Swimmable) {
            ((Swimmable) this).swim();
        } else if (terrainType == TerrainType.AIR && this instanceof Flyable) {
            ((Flyable) this).fly();
        } else {
            System.out.println(String.format("Not able to move on terrain type: %s.", terrainType.getType()));
        }
    }

}
