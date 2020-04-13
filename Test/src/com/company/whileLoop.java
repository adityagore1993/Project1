package com.company;

public class whileLoop {
    public static void main(String[] args) {

        boolean keepDriving = false;
        int currentFuel = 50;

        while (currentFuel > 0){
            keepDriving = true;
            System.out.println("Keep on driving!");
            currentFuel -= 1;
        }
        keepDriving = false;
        System.out.println("Need to refuel!");
    }
}