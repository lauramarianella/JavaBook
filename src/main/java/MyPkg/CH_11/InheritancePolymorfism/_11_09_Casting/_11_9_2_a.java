/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_09_Casting;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.Circle;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.GeometricObject;

/**
 *
 * @author laura
 */
public class _11_9_2_a {
    public static void main(String[] args) {
        // Create and initialize two objects
        Circle circle = new Circle(1);
        GeometricObject object = new GeometricObject();

        System.err.println("circle is instanceof GeometricObject");  
        if(circle instanceof GeometricObject){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("object is instanceof GeometricObject");  
        if(object instanceof GeometricObject){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("circle is instanceof Circle"); 
        if(circle instanceof Circle){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("object is instanceof Circle");  
        if(object instanceof Circle){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }
    }
}
