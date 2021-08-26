/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class _12_04_QuotientWithException { 
  public static int quotient(int number1, int number2){
    if (number2 == 0)
        throw new ArithmeticException("Divisor cannot be zero");
    
    if (number2 >number1)
        throw new RuntimeException("Not good to divide for a big number because you get decimals");
    
    return number1 / number2;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.println("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    try {
        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }catch (ArithmeticException ex) {
        System.out.println("Exception: a number cannot be divided by zero ");
    }catch (Exception e2) {
        System.out.println(e2.toString());
    }

    System.out.println("Execution continues ...");
  }
}