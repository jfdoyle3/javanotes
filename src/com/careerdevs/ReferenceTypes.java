package com.careerdevs;

import java.awt.*;
import java.util.Date;

public class ReferenceTypes {

    public void references(){

        // Reference Types
        // Simple example of Reference use.
        Date today=new Date();
        System.out.println(today);

        //Primitive vs Reference Type
        //----------------------------------
        // Primitive Method
        // both x & y are taking up 2 memory addresses
        // changing x won't affect y
        byte x=1;
        byte y=x;
        x=2;
        System.out.println(y);

        // Reference Method
        // Point puts num , num into one memory address
        // and uses point1 as a reference to that memory address
        // point 1 and point 2 are referencing to same memory address
        Point point1=new Point(1,1);
        Point point2= point1;
        System.out.println("Point1 & 2 values"+point1+ " | "+point2);
        point1.x= 2;
        System.out.println("Changed point1 x value "+point2);
        System.out.println("---------------------------------");


        // Strings
        // Java String is reference and not a Primitive
        String message="  Helllllloooooo Careerdevs"+"!!!";
        System.out.println("message: "+message);
        System.out.println("Ends with !!!? "+message.endsWith("!!!"));
        System.out.println("Starts with !!!? "+message.startsWith("!!!"));
        System.out.println("Length of String "+message.length());
        System.out.println("indexOf e "+message.indexOf("e"));   // returns 1st idx # occurrence of char , returns -1 not found char
        System.out.println("Replace: "+message.replace("!", "."));
        System.out.printf("toLower "+message.toLowerCase());
        System.out.println("\ntoUpper "+message.toUpperCase());
        System.out.println("trim "+message.trim());

        System.out.println("\n---------------------------------");
        String escapeChar="Working with \\\"escape\"\\ tab\t characters";
        System.out.println(escapeChar);
    }
}
