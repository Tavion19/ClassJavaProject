package com.binary.day1;

public class TypeCasting {

    public static void main(String[] args) {


    //      2 Types of casting : widening casting (make bigger)
    //                             narrowing casting (make smaller)

    //      its assigning a value from one datatype to another data type.

    //      widening casting
    //      byte => short => char => int => long => float => double
    //      HAPPENS AUTOMATICALLY BY JAVA

    //      narrowing casting
    //      double => float => long => int => char => short => byte
    //


    //          Widening Casting

        byte a = 120;

        int b = a;
        System.out.println(b);
        short c = a;
        short d = 1000;

        int e = 12345678;
        double f = e;


    //      narrowing casting

        int number1 = 150;

        System.out.println(number1);

        short number2 = (short) number1;

        System.out.println(number2);

        byte number3 = (byte) number2;

        System.out.println(number3);

        float floatValue = 12.34567f;
        System.out.println(floatValue);

        int intValue = (int) floatValue;
        System.out.println(intValue);


    }
}
