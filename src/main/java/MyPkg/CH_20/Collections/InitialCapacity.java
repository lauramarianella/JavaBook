/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_20.Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class InitialCapacity {
    public static void main(String[] args) {
        if(false){
            ArrayList<Integer> listOfIntegers = new ArrayList<>(2);
            listOfIntegers.add(1);
            listOfIntegers.add(2);
            System.out.println(listOfIntegers.add(3));
            System.out.println(listOfIntegers.add(4)); 
   System.out.println(listOfIntegers.set(2,20));

            for (int i : listOfIntegers) {
              System.out.print(i + " ");
            }
        }else{
            System.out.println("\n");
        
            Set<Integer> setOfIntegers = new HashSet<Integer>(2);
            setOfIntegers.add(1);
            setOfIntegers.add(2);

            System.out.println(setOfIntegers.add(1));
            System.out.println(setOfIntegers.add(2));

            for (int i : setOfIntegers) {
              System.out.print(i + " ");
            }
        }
  }
}
