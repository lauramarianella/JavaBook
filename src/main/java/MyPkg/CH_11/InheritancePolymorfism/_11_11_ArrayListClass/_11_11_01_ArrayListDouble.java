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
//import java.util.Scanner;
        
public class _11_11_01_ArrayListDouble {
   public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();//a)
    
    /*Scanner input = new Scanner(System.in);   
    System.out.println("Enter doubles (input ends with 0): ");
    Double value;
    
    do {
      value = input.nextDouble(); // Read a value from the input
      
      if (!list.contains(value) && value != 0) 
        list.add(value); // Add the value if it is not in the list
    } while (value != 0);
    */
    // Display the distinct numbers
    list.add(5d);
    list.add(3.0);
    list.add(55d);
    list.add(66d);
    System.out.print("\n b) The distinct appened integers are: ");
    for (int i = 0; i < list.size(); i++) 
      System.out.print(list.get(i) + " ");
    
    
    System.out.print("\n c) Insert at the beginning... ");
    list.add(0, 90d);
    System.out.print(list);
    
    System.out.print("\n d) Number of objects... ");
    System.out.print(list.size());
    
    System.out.print("\n e) Removing 3,0... ");
    //list.remove(3);
    list.remove(Double.valueOf(3));
    System.out.print(list);
    
    System.out.print("\n f) Removing the last... ");
    list.remove(list.size()-1);
    System.out.print(list);
    
    System.out.print("\n g) Contains 40,00 ... ");
    //System.out.print(list.contains(Double.valueOf(90)));
    System.out.print(list.contains(90d));
    
    System.out.print("\n h) Retrieves at index 1... ");
    //System.out.print(list.contains(Double.valueOf(90)));
    System.out.print(list.get(1));
  }
}