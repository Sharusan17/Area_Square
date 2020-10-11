package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the shape(cm)");
        double width = scanner.nextInt();
        System.out.println("Enter the height of the shape(cm)");
        double height = scanner.nextInt();
        //This will ask the user to enter the height and width
        double area = width * height;
        System.out.println("The area of the shape is " + area + "cm\u00B2");
        //it will calculate the area of the shape and display the area with the unit
        for (int row = 0; row<width; row++){
            for (int col=0; col<height; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        //this will display an actual image of the square by using for loops
    }
}
