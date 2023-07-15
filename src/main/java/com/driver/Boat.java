package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public Boat(){

    }
    public Boat(String name,int capacity){
        this.capacity = capacity;
        this.name = name;
    }
    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}
