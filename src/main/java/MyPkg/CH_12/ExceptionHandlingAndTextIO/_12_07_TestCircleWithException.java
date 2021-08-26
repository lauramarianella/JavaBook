/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

public class _12_07_TestCircleWithException {
  public static void main(String[] args) {
    try {
      _12_07_CircleWithException c1 = new _12_07_CircleWithException(5);
      _12_07_CircleWithException c2 = new _12_07_CircleWithException(-5);
      _12_07_CircleWithException c3 = new _12_07_CircleWithException(0);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " +
      _12_07_CircleWithException.getNumberOfObjects());
  }
}