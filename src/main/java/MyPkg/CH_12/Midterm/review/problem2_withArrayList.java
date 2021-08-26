/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.Midterm.review;

import java.util.ArrayList;
import java.util.Arrays;

public class problem2_withArrayList {
    
    
    public static void main(String[] args){
        Double[][] salary = new Double[25][12];
        //initialize all cells with zero
        for(int i=0; i<salary.length; i++)
            Arrays.fill(salary[i], 0D);
        
        //setting the 3 first months with a value (e.g., 1)
        salary[2][1]=10.0;
        salary[2][2]=7.0;
        
        salary[3][1]=5.0;
        salary[3][2]=10.0;
        
        //question a)
        System.out.println("The maximun salary is: " + getMaximum(salary) + "\n\n");
        
        //question b)
        for (int i=0; i<salary.length; i++){
            System.out.println("The employee (" +i+ ") salary is: " + getSalaryPerEmployee(salary,i));
        }
    }
    
    public static double getMaximum(Double[][] salary){
        ArrayList<Double> onlyMaximums = new ArrayList<>(); 
        
        for (int i=0; i<salary.length; i++){
            ArrayList<Double> list = new ArrayList<>(Arrays.asList(salary[i]));
            onlyMaximums.add(java.util.Collections.max(list));
        }
        Double max = java.util.Collections.max(onlyMaximums);
        return max;
    }
    
    public static double getSalaryPerEmployee(Double[][] salary, int row){
        double acc = 0;//accumulator;
        for(int j=0; j<salary[row].length; j++){
            acc = acc + salary[row][j];
        }

        return acc;// return accumulator;
    }
}
