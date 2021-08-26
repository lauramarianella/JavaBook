/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_03_Constructor;

/**
 *
 * @author laura
 */
public class Test_11_3_1_A {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    public A() {
        System.out.println( "A's no-arg constructor is invoked");
    }
}
class B extends A {
}
