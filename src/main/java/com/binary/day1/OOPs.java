package com.binary.day1;

public class OOPs {
    public static void main(String[] args) {

        // OOP => Object Oriented Programming

        // Main components -
        //  1. Class
        //    2. Object

        // Class => WHat is Class?
        // Class is a template or a blueprint for creating objects.

        // Class =>
            // 1. Attributes  =>  it will hold the data
            // 2. Methods  =>  Modify the data or perform certain tasks/actions

    // Class(only template; doesnt have values ----    Object (Physically represented)
        // Car               =>         Toyota Camry, Mazda6, Volvo xC60, Lexus Rx350

    // 1. Attributes -> model, color, mileage, doors, price, etc
    // 2. Methods -> drive(). stop(), accelerate(), reverse(), driveBy(), accelerateBy();

        // Fruit        ->                  Orange, Bananas, Apple, Grapes
        // Candy        ->                  Twix, Hersey, Snickers
        // Animals      ->                  Lions, Tiger, Bear

        // how to create a class ?

        // public class ClassName{
                //Attributes
                //Methods

        // }

        //  HOW TO CREATE AN OBJECT USING CLASS

        // we will use a keyword called "new" to create an object using class.


        //  ClassName  objectName = new ClassName();

            Car toyotaCamry = new Car();
            Car mercedesBenz = new Car();


            toyotaCamry.color = "blue";
            toyotaCamry.doors = 4;
            toyotaCamry.mfgYear = 2024;
            toyotaCamry.mileage = 10000;
            toyotaCamry.model = "Camry XLE";
            toyotaCamry.price = 40000.00;
            toyotaCamry.drive();
            toyotaCamry.driveBy(120);

        System.out.println(toyotaCamry.color);

            mercedesBenz.color = "Purple";
            mercedesBenz.doors = 4;
            mercedesBenz.mfgYear = 2000;
            mercedesBenz.model = "E430";
            mercedesBenz.price = 50000.00;


        System.out.println(mercedesBenz.model);


            Game xbox = new Game();

            xbox.color = "black";
            xbox.price = 599;
            xbox.model = "Series X";
            xbox.year = 2020;

        System.out.println(xbox.model);
        System.out.println(xbox.price);
        System.out.println(xbox.color);



        // Methods
        // how to create a simple method

        // public void methodName(){
            // Coding
        //  }

        // how to call a method
        // objectRef.methodName();


        // how to create a method that accepts the input
        //public void methodName(datetype inputName){
            //coding
        // }

        System.out.println("before :"+ toyotaCamry.mileage);
        toyotaCamry.driveBy(120);
        System.out.println("after :"+ toyotaCamry.mileage);


        System.out.println("befor :" +toyotaCamry.color);
        toyotaCamry.updateColor("green");
        System.out.println("after :"+toyotaCamry.color);

        // how to create a method that returns a value

        // public dataTypeOfReturnValue methodName()
        //      Coding
        //  return value
        // }

        int currentSpeed = toyotaCamry.accelerateBy();
        System.out.println(currentSpeed);

        currentSpeed = toyotaCamry.accelerateByCertainSpeed(65);
        System.out.println(currentSpeed);

        int currentPrice = toyotaCamry.updatedCarPrice(50000);
        System.out.println(currentPrice);

        int newDoors = toyotaCamry.updatedDoors(2);
        System.out.println(newDoors);





    }
}
