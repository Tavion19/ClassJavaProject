package com.binary.day1;

public class ConditionalStatements {

    public static void main(String[] args) {

        //conditional statements
        //   if
        //  else
        //  else if
        //  switch

        boolean condition = true;

        if (condition) {
            System.out.println("This block of code will only print if this condition is true");
        } else {
            System.out.println("This block of code will not print only if condition is false");
        }


        // write a logic to check if given person is a senior citizen or not
        // persons age is greater than 50 => senior citizen


        byte age = 55;

        if (age <= 50) {
            System.out.println("This person is not a senior citizen");
        } else {
            System.out.println("This person is a senior citizen");
        }
        // write a logic to check if given person is a senior citizen or not
        // persons age is greater than 50 => senior citizen
        // persons age is less than 20 => teenagers
        // persons age is greater than 20 and less than 50 => youngsters
        byte age2 = 48;
        if (age2 >= 50) {
            System.out.println("This person is a senior citizen");
        } else if (age2 < 20) {
            System.out.println("Teenagers");
        } else if ((age2 >= 20) && (age2 <= 50)) {
            System.out.println("Youngsters");
        }

        short personAge = 15;

        //  switch

    //      switch(expression) {
        //          case 1:
        //              code
    //              break;

        //          case 2:
        //              code
//                  break;

    //              case 3:
    //                  code
        //          break;

    //              default:
        //              code
        //          break;
        //      }

//      write a code to print the menu in a restaurant based on timing using the switch statement.

        String timing = "lunch";

        switch(timing){
            case "breakfast":
                System.out.println("10:00 am");
                break;
            case "lunch":
                System.out.println("2:00 pm");
                break;
            case "dinner":
                System.out.println("6:00 pm");
                break;

            default:
                System.out.println("invalid");
                break;

        }


    }
}
