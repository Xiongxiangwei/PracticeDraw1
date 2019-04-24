package com.hencoder.hencoderpracticedraw1.practice;

public class DataBean {

    /**
     * name : fro
     * height : 20
     * color : yellow
     */

    private String name;
    private String height;
    private String color;

    public DataBean(String name, String height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getHeight() { return height;}

    public void setHeight(String height) { this.height = height;}

    public String getColor() { return color;}

    public void setColor(String color) { this.color = color;}
}
