package MyPkg.CH_10.OOThinking;


import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class _10_09_LargeFactorial {
    public static void main(String[] args) {
        boolean isUsingScanner = false;
        if(isUsingScanner){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int n = input.nextInt();
            System.out.println(n + "! is \n" + factorial(n));
        }else{
            int n = 50;
            System.out.println(n + "! is \n" + factorial(n));
        }
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE; // Assign 1 to result
        for (int i = 1; i <= n; i++) // Multiply each i
          result = result.multiply(new BigInteger(i+""));

        return result;
    }
}