// Author: Keidy Lopez
// Filename: Problem4.java
// Description: prints a string and an integers in the console

import java.util.Random;

public class Problem4 {
    public static void main(String[] args){
        Random num = new Random();
        int max = 10;
        int RandNum1 = num.nextInt(max);
        int RandNum2 = num.nextInt(max);

        System.out.println("first num: "+ RandNum1);
        System.out.println("second num: "+ RandNum2);
        System.out.print("Sum: " + (RandNum1 + RandNum2) );

    }
}
