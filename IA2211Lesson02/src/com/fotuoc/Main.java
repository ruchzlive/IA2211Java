package com.fotuoc;


import java.util.Scanner;

public class Main {

    static String name = "MySampleName";
    public static final int serialNum = 10;
    boolean isActive = false;


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Name: " + name);

        int valA = 10;
        double valB = (double) valA;

        // Specific reason

        int valC = valA / (int) 2.5;
        System.out.println("valC = " + valC);

        // User param
        int age = 88;

        if (age < 18) {
            System.out.println("Not eligible for a driving license");
        }
        else if (age > 80) {
            System.out.println("Too old to drive. Please submit a health check results");
        }
        else {
            System.out.println("Allowed to apply");
        }

        int androidAPILevel = 3;

        Scanner scanner = new Scanner(System.in);

        switch (androidAPILevel){
            case 3:
                System.out.println("Android 1.5");
                System.out.println("Cupcake");
                break;
            case 21:
                System.out.println("Android 5.0");
                System.out.println("Lollipop");
                break;
            case 23:
                System.out.println("Android 6.0");
                System.out.println("Marshmallow");
                break;
            case 27:
                System.out.println("Android 8.1");
                System.out.println("Oreo");
                break;
            case 28:
                System.out.println("Android 9.0");
                System.out.println("Pie");
                break;
            case 29:
                System.out.println("Android 10.0");
                System.out.println("Queen Cake");
                break;
            case 30:
                System.out.println("Android 11.0");
                System.out.println("Red Velvet Cake");
            case 31:
                System.out.println("Android 12.0");
                System.out.println("Snow Cone");
                break;

            default:
                System.out.println("Other OS Version");

        }


        String myString = scanner.next(); // read String value
        int myInt = scanner.nextInt(); // read integer value
        scanner.close(); // close scanner

        System.out.println("myString is: " + myString); // print string value
        System.out.println("myInt is: " + myInt); // print integer value



    }
}
