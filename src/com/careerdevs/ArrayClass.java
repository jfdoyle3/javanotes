package com.careerdevs;

import java.util.Arrays;

public class ArrayClass {

    public  void arrays(){

        int[] numbers= new int[5];
        numbers[0]=1;
        numbers[1]=2;
        int [] ver2Numbers={2,3,6,5,1};
        Arrays.sort(ver2Numbers);
        System.out.println(ver2Numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ver2Numbers));
        System.out.println("------------------------------------");

        int [][] twoDeeArray=new int[2][3];
        int [][] setTwoDArray={{1,2,3},{6,4,7}};
        twoDeeArray[0][0]=10;
        System.out.println(Arrays.deepToString(twoDeeArray));
        System.out.println(Arrays.deepToString(setTwoDArray));
    }
}
