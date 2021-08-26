/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_08_DynamicBinding;

/**
 *
 * @author laura
 */
public class _11_8_4_DynamicBinding {
    public static void main(String[] args){
        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        int[] list3 = {1, 2, 3};
        String[] list4 = {"1","2"};
        boolean[] list5 = {true,false};
        printArray(list1);
        printArray(list2);
        //printArray(list3);
        printArray(list4);
        //printArray(list5);
        
        Object[] o = new Integer[50];
        
        //Object[] oint = new int[10];
        Object oint = new int[10];
    }
    
    public static void printArray(Object[] list) {
        for (Object o: list)
        System.out.print(o + " ");
        System.out.println();
    }
}
