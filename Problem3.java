// Author: Keidy Lopez
// Filename: Problem3.java
// Description: prints an integer in the console

import java.util.Random;

public class Problem3 {
    public static void main(String[] args){
        Random num = new Random();
        int max = 10;
        int RandNum1 = num.nextInt(max);
        int RandNum2 = num.nextInt(max);

        System.out.print(RandNum1 + "+"+ RandNum2 + " = " + (RandNum1 + RandNum2) );
    }
}
