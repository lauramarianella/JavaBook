/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

public class TestCircleWithRadiusException {
  /** Main method */
  public static void main(String[] args) {
    try {
      CircleWithRadiusException c1 = new CircleWithRadiusException(5);
      c1.setRadius(-5);
      CircleWithRadiusException c3 = new CircleWithRadiusException(0);
    }catch (_12_10_InvalidRadiusException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " +
      CircleWithRadiusException.getNumberOfObjects());
  }
}