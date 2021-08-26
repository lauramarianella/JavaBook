/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_11_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
/**
 *
 * @author laura
 */
public class _11_12 {
    public static void main(String[] args) {
        //Array to ArrayList
        String[] arrayStr = {"red", "green", "blue"};
        ArrayList<String> listFromArray = new ArrayList<>(Arrays.asList(arrayStr));
        System.out.println(listFromArray);
        
        Integer[] array2 ={5, 9, 8};
        ArrayList<Integer> listFromInteger = new ArrayList<>(Arrays.asList(array2));
        System.out.println(listFromInteger);
        
        //ArrayList to Array
        String[] toArrayStr = new String[listFromArray.size()];
        listFromArray.toArray(toArrayStr);
        for(int i=0; i< toArrayStr.length; i++){
            System.out.println(toArrayStr[i]);
        }
        
        //Sort
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        
        ArrayList<Integer> listForSort = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(listForSort);
        System.out.println(listForSort);
        
        //Shuffle
        ArrayList<Integer> listForShuffle = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.shuffle(listForShuffle);
        System.out.println(listForShuffle);
        
        //max & min
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(java.util.Collections.max(list));
        System.out.println(java.util.Collections.min(list));
        
        ArrayList<String> arrayListOfStr = new ArrayList<>(Arrays.asList(arrayStr));
        System.out.println(java.util.Collections.max(arrayListOfStr));
        System.out.println(java.util.Collections.min(arrayListOfStr));
    }
}
