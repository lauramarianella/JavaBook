/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_09_Casting;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.Rectangle;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.Circle;
/**
 *
 * @author laura
 */
public class _11_7_CastingDemo {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object */
  public static void displayObject(Object object) {
    if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle)object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle)object).getDiameter());
    }
    else if (object instanceof 
                  Rectangle) {
      System.out.println("\nThe rectangle area is " +
        ((Rectangle)object).getArea());
    }
  }
}