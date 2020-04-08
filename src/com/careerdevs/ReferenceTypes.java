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
        point1.x= 2;
        System.out.println(point2);

    }
}
