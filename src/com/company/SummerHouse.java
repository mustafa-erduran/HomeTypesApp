package com.company;

public class SummerHouse {

    public SummerHouse(){};
    public SummerHouse(Double price, Double area, int room, int livingRoom) {
        this.price = price;
        this.area = area;
        this.room = room;
        this.livingRoom = livingRoom;
    }

    private Double price;
    private Double area;
    private int room;
    private int livingRoom;

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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
