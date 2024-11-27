package com.binary.day1;

public class DataTypes {

    public static void main(String[] args) {


        // DataTypes are divided into two groups:
        //  1. Primitive Data Types --> Data only
        //  2. Non - Primitive Data Types --> Data and Actions

        //Primitive Data Types
        //   name                 memory                range
        //  1. Byte                 1 Byte               range -128 to 127
        //  2. Short                2 Bytes              range -32,768 to 32, 767
        //  3. Int                  4 Bytes              range is 2,147,483,648 to 2,147,483,647
        //  4. Long                 8 Bytes              range is -922233728365477588 to 9223372036854775887
        //  5. Float                4 Bytes             it ia used to store the fractional numbers, it can store up to 6 or 7 decimal digits
                                                         //   ex. ex: 12.4567893

        //  6. double               8 Bytes             it is used to store thr fractional numbers, it can store up to 15 decimal digits
                                                        //    ex: ex: 12.4567891234567

        //  7. boolean              1 Bit               0 or 1 =>   0 => false      1 => true
        //  8. char                 2 Bytes             a-z, A-Z, 0-9, other symbols, for char we use '' (single quotes)
                                               //         ex: 'a', 'A', '$', '8'

        // 8 BITS = 1 BYTE
    //  All the variable names must start with lower case, alternate word first letter should be capital.

//  How to create a variable inside Java ?

//      variableDataType    variableName    =   variableValue;
          byte               a            =    10;

        System.out.println(a);


        short b = 100;
        System.out.println(b);

        int c = 1000000;

        float d = 1.158678f;
        System.out.println(d);

        float e = 245f;
        System.out.println(e);

        int f = 245;
        System.out.println(f);

        double g = 1.15678;
        System.out.println(g);

        boolean h = true;
        System.out.println(h);

        char i = 'A';
        System.out.println(i);

        long accountNumber = 234555646789L;


        // 2. Non - Primitive Data Types   =>  Data and Actions
        //  String => series of characters  =>  "" (Double quotes)

        // All the non - primitive data types start with a capital letter because it is also a Class in Java.


        String name = "Tavion";






    }
}
