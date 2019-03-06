package domain;

public enum TerrainType {

    GROUND("Ground"),
    WATER("Water"),
    AIR("Air");

    private String type;

    TerrainType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
