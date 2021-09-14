/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exBACcalculator {
    public static void main (String[] args) {
        final double constBAC = 0.08;
        final double maleR = 0.73;
        final double femaleR = 0.66;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = sc.nextInt();

        double bac = 0;

        if(gender == 1 || gender == 2)
        {
            System.out.println("How many ounces of alcohol did you have?");
            double intake = sc.nextDouble();
            System.out.println("What is your weight, in pounds?");
            double weight = sc.nextDouble();
            System.out.println("How many hours has it been since your last drink? ");
            double hrs = sc.nextDouble();

            if(gender == 1)
            {
                bac = (intake * (5.14/weight) * maleR) - (.015 * hrs);
            }
            else if(gender == 2)
            {
                bac = (intake * (5.14/weight) * femaleR)-(.015*hrs);
            }
            System.out.printf("Your BAC is %.6f \n", bac);
            String str = bac > constBAC ? "It is not legal for you to drive." : "It is legal for you to drive.";
            System.out.println(str);
        }
        else
        {
            System.out.println("Invalid choice");
        }

    }
}
