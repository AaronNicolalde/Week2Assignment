package com.eduanico;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int calcTime(Vehicle v, int distance) {
        return distance/v.getSpeed();
    }

}
