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
public class Test_11_ConstructorChaining {
  public static void main(String[] args) {
    new Faculty();
    System.out.print("");
  }
}

class Faculty extends Employee {
  public Faculty() {
    System.out.println("(4) Faculty's no-arg constructor is invoked");
  }
}

class Employee extends Person {
  public Employee() {
    this("(2) Invoke Employee’s overloaded constructor");
    System.out.println("(3) Employee's no-arg constructor is invoked");
  }
  
  public Employee(String s) {
    System.out.println(s);
  }
}



class Person {
  public Person() {
    System.out.println("(1) Person's no-arg constructor is invoked");
  }
}
