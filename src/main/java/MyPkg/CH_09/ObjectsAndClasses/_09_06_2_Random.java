/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_09.ObjectsAndClasses;

import java.util.Random;

/**
 *
 * @author laura
 */
public class _09_06_2_Random {
    public static void main(String args[]) {
        Random generator = new Random(1);
        int loop = 3;
        System.out.print("From generator int: ");
        for (int i = 0; i < loop; i++){
            System.out.print(generator.nextInt(9) + " ");
        }
        int min=-2;
        int max=5;
        System.out.print("\nFrom int in range(" + min +","+ max + "): ");
        for (int i = 0; i < loop; i++){
            System.out.print( generator.nextInt((max-min)+1) +min + " ");
        }
        
        System.out.print("\nFrom generator float: ");
        for (int i = 0; i < loop; i++){
            System.out.print(generator.nextFloat()+ " ");
        }
        System.out.print("\nFrom generator boolean: ");
        for (int i = 0; i < loop; i++){
            System.out.print(generator.nextBoolean()+ " ");
        }
        Random generator2 = new Random(2);
        System.out.print("\nFrom generator2: ");
        for (int i = 0; i < loop; i++)
        System.out.print(generator2.nextInt(100) + " ");
    }    

}
