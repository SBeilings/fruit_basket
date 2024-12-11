package com.example.data;

public class Fruits {
    protected String name;
    protected String color;
    protected boolean isRipe;

    public Fruits(String name, String color, boolean isRipe) {
        this.name = name;
        this.color = color;
        this.isRipe = isRipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    public String outputFormatter(String name, String color, boolean isRipe){
        return ("Name: " + name+
                "\nColor: " + color+
                "\nIs it Ripe: " + isRipe);
    }

    public int returnCountOfLastItem(boolean isRipe){
        return ("Is it Ripe: " + isRipe).length();
    }

}
