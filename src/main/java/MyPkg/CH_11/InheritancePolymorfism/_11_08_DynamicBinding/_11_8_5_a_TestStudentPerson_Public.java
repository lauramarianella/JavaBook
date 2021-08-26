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

public class _11_8_5_a_TestStudentPerson_Public {
    public static void main(String[] args) {
        new Person().printPerson();//Person
        new Student().printPerson();//Student
    }
}
class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}
class Person {
    public String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}