/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;


public class _12_11_TestCircleWithCustomException {
/** Main method */
  public static void main(String[] args) {
    try {
      _12_11_CircleWithRadiusException c1 = new _12_11_CircleWithRadiusException(5);
      c1.setRadius(-5);
      _12_11_CircleWithRadiusException c3 = new _12_11_CircleWithRadiusException(0);
    }
    catch (_12_10_InvalidRadiusException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " +
      _12_11_CircleWithRadiusException.getNumberOfObjects());
  }
}
