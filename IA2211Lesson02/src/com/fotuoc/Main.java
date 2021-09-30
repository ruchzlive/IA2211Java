package com.fotuoc;


public class Main {

    static String name = "Ruchira";
    public static final int serialNum = 10;
    boolean isActive = false;


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Name: " + name);

        String myName = "Ruchira" + " " + "Thilanka";
        System.out.println(myName);

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

        switch (age){
            case 80:


        }
    }
}
