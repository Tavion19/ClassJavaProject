package com.binary.day1;

public class LoopStatements {

    public static void main(String[] args) {


        //  for
        //  while
        //  do while

        // for (start; condition; update){
        //      repeating code
        //      }

        for (int i = 1; i < 10; i++) {
            System.out.println(i);


        }

        for (int i = 39; i < 150; i = i + 2) {

            if (i % 5 == 0) {
                System.out.println(i + " this is divisible by 5 ");
            } else {
                System.out.println(i);
            }


        }


        //      start;
        //      while(condition){
        //          repeating code

        //          update
        //              }

        //for( let v = 10; v <50; v+=10){
        //    let l =v;
        //    while(l < v+10){
        //        console.log(l);
        //        l++;

        int a = 39; // start;

//              condition (a < 150)
        while (a < 150) { // condition = (a < 150)

            if (a % 5 == 0) { // repeating code
                System.out.println(a + " This is divisible by 5");

            } else { // repeating code
                System.out.println(a);
            } // repeating code

            a += 2; // update
        }

        //      Do while example

        // let c = 20;
        //do{
        //    console.log(c);
        //    b++;
        //
        //}while(c < 10);

        int c = 39;

        do {
            System.out.println(c);
            c += 2;
        } while (c < 150);


        // Pattern Programming

//            0 1 2 3 4
        //    0 * * * * *
        //    1 * * * *
        //    2 * * *
        //    3 * *
        //    4 *


        for (int row = 0; row <= 4; row++) {

            for (int j = 0; j <= (4 - row); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int roww = 0; roww <= 4; roww++) {

            for (int col = 0; col <= roww; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //    0 1 2 3 4
        // 0 * * * * *
        // 1 * * * *
        // 2 * * *
        // 3 * *
        //      //    4 *

        for (int row = 0; row <= 4; row++) {

            for (int col = 0; col <= 4; col++) {
                if (col <= 4 - row - 1) {
                    System.out.println("  ");
                } else {
                    System.out.println("* ");
                }
            }
            System.out.println();
        }

        byte number1 = 24;
        if (number1 > 0) {
            System.out.println(number1 + " is a positive number.");
        } else if (number1 < 0) {
            System.out.println(number1 + " is a negative number.");
        } else {
            System.out.println(number1 + " is zero.");
        }
        System.out.println("-----------");


        byte number2 = 8;
        if(number2 % 2 ==0) {

        System.out.println(number2 + " is even.");
    } else {
        System.out.println(number2 + " is odd.");
    }


        byte score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


        byte side1 = 15;
        byte side2 = 20;
        byte side3 = 50;
        if (side1 == side2 && side2 == side3 ) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1 ) {
            System.out.println("Isoceles Triangle");


        } else if (side1 != side2 || side2!= side3 || side3 != side1) {
            System.out.println("Scalene Triangle");
            {

            }


            byte m = -19;

            if((m > 0) && (m % 2 == 0)){
                System.out.println("Positive and Even");
            }else if((m < 0) && (m % 2 != 0)){
                System.out.println("Negative and Odd");
            }else if((m > 0) && (m % 2 != 0)){
                System.out.println("Positive and Odd");
            }else if((m < 0) && (m % 2 == 0)){
                System.out.println("Negative and Even");
            }

            int sum = 0;
            int t = 1;
            int j = 5;

            while(t <= j){
                sum = sum + t;
                t++;
            }
            System.out.println(sum);


        }

        int k = 5;

        for( int d = 1; d <= 10; d++){
            System.out.println(k + " * " + d + " = " + k * d );
        }

    }
}
