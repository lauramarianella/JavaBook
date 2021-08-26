/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_07_Polymorphism;

import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.Rectangle;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.Circle;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.GeometricObject;
/**
 *
 * @author laura
 */


public class Polymorphism {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
    displayObject(new Circle(1, "red", false));
    displayObject(new Rectangle(1, 1, "black", true));
  }

  /** Display geometric object properties */
  public static void displayObject(GeometricObject object) {
    System.out.println("Created on " + object.getDateCreated() +
      ". Color is " + object.getColor());
    //object.getRadius();
  }
}
