/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_09_Casting;

/**
 *
 * @author laura
 */
public class _11_9_4 {
     public static void main(String[] args) {
         Object fruit = new Fruit4();//should be Object fruit = new Apple4();
         Object apple = (Apple4)fruit;//Fruit cannot be cast to class Apple 
     }
}

class Fruit4 {
    
}
class Apple4 extends Fruit4 {
    public void makeAppleCider(){}
}