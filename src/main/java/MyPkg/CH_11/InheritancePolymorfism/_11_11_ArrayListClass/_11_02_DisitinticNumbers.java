/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_11_ArrayListClass;

/**
 *
 * @author laura
 */
import java.util.ArrayList;
import java.util.Scanner;

public class _11_02_DisitinticNumbers  {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);   
    System.out.println("Enter integers (input ends with 0): ");
    int value;
    
    do {
      value = input.nextInt(); // Read a value from the input
      
      if (!list.contains(value) && value != 0) 
        list.add(value); // Add the value if it is not in the list
    } while (value != 0);

    // Display the distinct numbers
    System.out.print("The distinct integers are: ");
    for (int i = 0; i < list.size(); i++) 
      System.out.print(list.get(i) + " ");
  }
}

