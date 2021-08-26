/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.Midterm.review;

import MyPkg.CH_12.Midterm.review.Employee;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author laura
 */
public class Main {
    static DecimalFormat df = new DecimalFormat("0.00");
        
    public static void main(String[] args){
        Employee john = new Employee("John");
        double[] johnHours= {5.0,3,8,7,8};
        john.setHours(johnHours);
        
        System.out.println("John's salary is $" +john.getGrossPay());
        
        //
        Employee sally = new Employee("Sally");
        double[] sallyHours= {2,1,5,6,8};
        sally.setHours(sallyHours);
        
        System.out.println("Sally's salary is $" +sally.getGrossPay());
        
        //
        Employee harold = new Employee("Harold");
        double[] haroldHours= {8,5,3,8,8};
        harold.setHours(haroldHours);
        
        System.out.println("Harod's salary is $" + harold.getGrossPay());
        
        Employee[] employees = {john, sally, harold};
        System.out.println("Total in salaries is $" + Employee.getTotalGrossPay(employees));
        
        
        df.setRoundingMode(RoundingMode.UP);
        try{
            System.out.println("Total salary average is $" + df.format(Employee.getAverageGrossPay(employees)));
        }catch(Exception e){
            System.out.println("Zero division");
        }
    }
}
