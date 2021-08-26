/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_05_1_Overriding;

/**
 *
 * @author laura
 */
class Cat {
    public void whoAmI(){
        System.out.println("I am a cat");
    }
}
class Lion extends Cat{
    @Override
    public void whoAmI(){
        System.out.println("I am a lion");
    }
    
    public void superWhoAmI(){
        super.whoAmI();
    }
    
    public static void main(String[] args) {
        Cat c = new Cat();
        Lion l = new Lion();
        c.whoAmI();
        l.whoAmI();
        l.superWhoAmI();
    }
}
