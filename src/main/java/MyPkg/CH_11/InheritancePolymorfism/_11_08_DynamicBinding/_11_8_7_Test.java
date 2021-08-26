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
public class _11_8_7_Test {
    public static void main(String[] args) {
        new Aa();//i from A is 40
        new Bb();//i from A is 60
                 //i from B is 60
    }
}

class Aa {
    int i = 7;
    public Aa() {
        setI(20);
        System.out.println("i from A is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}
class Bb extends Aa {
    public Bb() {
        System.out.println("i from B is " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}