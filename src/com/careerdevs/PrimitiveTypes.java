package com.careerdevs;

public class PrimitiveTypes {

    public void primitives(){

        // Primitives

        // Various ways of declaring multiple types.
        int cars=1130,
                trees=652111265,
                treeCount=trees,
                houseNumber=2023;
        System.out.println("Option 1: "+cars+" | "+trees+" | "+houseNumber+" | "+treeCount);
        // -------------------------------------------------
        int doorPartNumber, roofPartNumber, trunkPartNumber;

        doorPartNumber=1234;
        roofPartNumber=8746;
        trunkPartNumber=7643;

        System.out.println("Option 2: "+doorPartNumber+" | "+roofPartNumber+" | "+trunkPartNumber);
        // -------------------------------------------------
        byte age=40;    // Use byte if the variable isn't ever going beyond -/+ 127.
        long viewsCount=3_123_456_789L;  //Use 'L' with long. int is always assumed.
        float price=10.99F; // Use 'F' with float. double is assumed.
        double deciNumber=1.05;
        char letter='A'; // Use '' for single characters. "" for Strings / multiple characters.
        boolean ofAge=true;


        System.out.println("\n------------------------------------"+
                "\nbyte: "+age+
                "\nlong: "+viewsCount+
                "\nfloat: "+price+
                "\ndouble: "+deciNumber+
                "\nchar: "+letter+
                "\nboolean: "+ofAge);

    }
}
