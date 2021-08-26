/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _12_05_InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
      try {
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
  
        // Display the result
        System.out.println("The number entered is " + number);
        continueInput = false;
      } catch (InputMismatchException ex) {
        System.out.println("Try again. (" + "Incorrect input: an integer is required)");
        input.nextLine(); // discard input 
      }
    } while (continueInput);
  }
}


