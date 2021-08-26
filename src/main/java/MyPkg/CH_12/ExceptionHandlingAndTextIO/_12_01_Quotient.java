/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.util.Scanner;


public class _12_01_Quotient {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.println("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    System.out.println(number1 + " / " + number2 + " is " +
      (number1 / number2));
  }
}
