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
public class _09_06_2_RandomInt {
    public static void main(String args[]) {
        Random generator = new Random(1);
        int loop = 5;
        System.out.print("From generator int: ");
        for (int i = 0; i < loop; i++){
            System.out.print(generator.nextInt(10) + " ");
        }

        Random generator2 = new Random(500);
        System.out.print("\nFrom generator int: ");
        for (int i = 0; i < loop; i++)
        System.out.print(generator2.nextInt(10) + " ");
    }    
}