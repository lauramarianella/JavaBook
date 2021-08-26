/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_13.AbstractInterface._13_09_ComparableInterfaceSort;

/**
 *
 * @author laura
 */
public class _13_6 {
    public static void main(String[] args) {
        //System.out.println(new Integer(3).compareTo(new Integer(5)));   
        System.out.println("ABC".compareTo("ABD"));  
        System.out.println("ABC".compareTo("ABE")); 
        java.util.Date date1 = new java.util.Date(2020, 12, 1);    
        java.util.Date date2 = new java.util.Date(2020, 1, 1);    
        System.out.println(date1.compareTo(date2)); 
    }
}
