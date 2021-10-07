package com.fotuoc;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static String name = "MySampleName";
    public static final int serialNum = 10;
    boolean isActive = false;

    private static boolean isOddNumber(int input) {
        return (input % 2) == 1;
    }

    public static void main(String[] args) {
        /*
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



        boolean isOld = true;
        boolean isDark = true;

        if (!isOld && isDark){
            System.out.println("A dark young person");
        }

        char a = 'a';
        char b = 'b';

        if (a != 'a') {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }

        int x = 0;
        int y = 0;

        System.out.println("X = " + x++);
        System.out.println("Y = " + ++y);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int xx = scanner.nextInt(); // read integer value
        //String ss = scanner.next();

        scanner.close(); // close scanner

        System.out.println("myInt is: " + x); // print integer value

        // This is to check the odd number
        /*if (xx % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        */
        /*
        if (isOddNumber(xx))
            System.out.println("Odd number");
        else
            System.out.println("Even number");


        ArrayList<String> names = new ArrayList<String>();
        names.add("Ruchira");
        names.add("Sachintha");
        names.add("Dilhan");
        names.add("Amal");

        int c = 0;
        boolean isTrue = false;

        for (int cc = 0; cc < names.size(); cc++) {
            System.out.println(names.get(cc));
            if ( cc == 2)
                break;
        }


        /*while (c < names.size()) {
            System.out.println( names.get(c) );

            System.out.println("c = " + c);
            if ( c == 1)
                break;

            c++;
        }*/


        Vehicle vehicle = new Vehicle("EP CAE 4455");
        vehicle.setLicenseNumber("SP CAA 1122");

        System.out.println("License Number: " + vehicle.getLicenseNumber());


        Car car = new Car();
        car.setWindScreenColor("Transparent");
        car.setLicenseNumber("WP CAD 7788");
        car.engineSize = 1000.0;

        System.out.println("Car License Number: " + car.getLicenseNumber());
        car.run();

        Bike bike = new Bike();
        bike.run();

        Vehicle myCar = new Car();
        myCar.run();





    }


}
