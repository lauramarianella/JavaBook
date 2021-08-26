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

public class _11_8_5_b_TestStudentPerson_Private {
    public static void main(String[] args) {
        new PersonPriv().printPerson();//Person
        new StudentPriv().printPerson();//Person
    }
}
class StudentPriv extends PersonPriv {
    private String getInfo() {
        return "Student";
    }
}
class PersonPriv {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}