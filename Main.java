package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myAge;
        int ageOfBrother;
        //Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        myAge = input.nextInt();
        System.out.println("Enter your brother's age: ");
        ageOfBrother = input.nextInt();

        boolean result = (myAge > 0 && myAge < 25) && (ageOfBrother > 0 && ageOfBrother < 25);

        System.out.println(result);
    }
}
