/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.Midterm.review;

public class Employee extends Person {
    private static final double HOURLY_RATE = 11;
    private static double allPayment = 0;
    private static int numEmployees=0;
    
    private double[] hours = new double[5];
    
    public Employee(String name){
        super(name);
        numEmployees++;
    }

    public void setHours(double[] hours) {
        this.hours = hours;
    }
    
    public double getGrossPay(){
        double grossPay=0;
        for (double hour : hours) {
            grossPay+=hour * Employee.HOURLY_RATE;
        }
        return grossPay;
    }
    
    public static double getTotalGrossPay(Employee[] employees){
        double grossPay=0;
        for (Employee employee : employees) {
            for (double hours : employee.hours) 
                grossPay+=hours * Employee.HOURLY_RATE;
        }
        return grossPay;
    }
    
    public static double getAverageGrossPay(Employee[] employees) throws Exception{
        double grossPay=0;
        double avgGrossPay=0;
        for (Employee employee : employees) {
            for (double hours : employee.hours) 
                grossPay+=hours * Employee.HOURLY_RATE;
        }
        //try{
          avgGrossPay = grossPay/Employee.numEmployees;  
        //}catch(Exception e){
         //   System.out.println("Zero division");
        //}
        return avgGrossPay;
    }
    
}
