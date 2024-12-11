package com.example.data;

public enum FruitHelper {
    APPLE("Apple", "Red", false),
    PINEAPPLE("Pineapple", "Yellow", true),
    WATERMELON("Watermelon", "Red and Green", true);

    public String name;
    public String color;
    public boolean isRipe;

    FruitHelper(String name, String color, boolean isRipe){
        this.name = name;
        this.color = color;
        this.isRipe = isRipe;
    }

    @Override
    public String toString() {
        return ("[" + name + ", " + color + ", " + isRipe + " ]" );
    }
}
