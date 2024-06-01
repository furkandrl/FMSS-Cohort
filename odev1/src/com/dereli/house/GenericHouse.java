package com.dereli.house;

public class GenericHouse {
    String name;
    private double price;
    private double area;
    private int room;
    private int livingRoom;

    public GenericHouse(String name, double price, double area, int room, int livingRoom) {
        this.name = name;
        this.price = price;
        this.area = area;
        this.room = room;
        this.livingRoom = livingRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}