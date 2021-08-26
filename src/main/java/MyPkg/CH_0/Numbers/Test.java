/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_0.Numbers;

/**
 *
 * @author laura
 */
public class Test {
    int myAge;
    float myDiameter;
    double myPerimeter;
    
    void foo(int x){
        this.myAge = x;
    };
    void foo(float x){
        this.myDiameter = x;
    };
    void foo(double x){
        this.myPerimeter = x;
    };


  public static void main(String[] args) {
    Test test = new Test();
    test.foo(5);
    //test.foo(6f);
    //test.foo(5d);
    System.out.println(test.myAge);  
    System.out.println(test.myDiameter);
    System.out.println(test.myPerimeter);
  }
}
