package com.binary.day1;

public class Car {

    //  1. Attributes => model, color, mileage, doors, mfgYear, price


    String model;
    String color;
    int mileage;
    int doors;
    int mfgYear;
    double price;

    public void drive(){
        System.out.println("This car is in drive mode");
    }

    public void stop(){
        System.out.println("This car is stopped");
    }

    public void accelerate(){
        System.out.println("This car is accelerating");

    }
    public void reverse(){
        System.out.println("This car is in reverse");
    }
    public void driveBy(int miles){
        mileage = mileage + miles;
    }
    public void updateColor (String inputColor){
        color = inputColor;

    }
    public void updateDoors(int inputDoors){
        doors = inputDoors;
    }
    public void updateMileage(int inputMileage){
        mileage = inputMileage;
    }
    public void updatePrice(int inputPrice){
        price = inputPrice;
    }
    public void updateYear(int inputYear){
        mfgYear = inputYear;
    }

    public int accelerateBy(){
        System.out.println("current speed is 50 miles/h");
        return 50;
    }

    public int accelerateByCertainSpeed(int inputSpeed){

        return inputSpeed;

    }
    // write a method which will return a car price.
    public int updatedCarPrice(int price){
        return price;
    }

    public int updatedDoors(int doors){
        return doors;


    }



}
