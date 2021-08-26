/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_08_DynamicBinding;

/**
 *
 * @author laura
 */
public class _11_8_6_Test {
    public static void main(String[] args) {
      A a = new A(3);
    }
}

class A extends B {
    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}
