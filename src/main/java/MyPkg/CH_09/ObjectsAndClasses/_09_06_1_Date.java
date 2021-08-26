/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_09.ObjectsAndClasses;

import java.text.SimpleDateFormat;
import java.util.Date;


public class _09_06_1_Date {
    public static void main(String args[]) {
      Date dNow = new Date( );
      System.out.println("Current Date: " + dNow.toString());
      
      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
    
}
