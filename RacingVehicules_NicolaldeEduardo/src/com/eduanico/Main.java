package com.eduanico;

public class Main {

//    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle moto = new Motorcycle();
        Bike bike = new Bike();

        System.out.println(bike.calcTime(bike,60) +"h");
        System.out.println(car.calcTime(car,180)+"h");
        System.out.println(moto.calcTime(moto,160)+"h");

    }
}
