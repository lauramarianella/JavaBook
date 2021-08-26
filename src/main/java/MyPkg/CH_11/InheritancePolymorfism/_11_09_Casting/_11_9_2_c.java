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
public class _11_9_2_c {
    public static void main(String[] args) {
        GeometricObject objectC = new GeometricObject();
        Circle circleC = (Circle) objectC;
    }
}