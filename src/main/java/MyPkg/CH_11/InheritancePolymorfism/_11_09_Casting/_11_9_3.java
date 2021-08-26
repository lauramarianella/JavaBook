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
public class _11_9_3 {
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.err.println("fruit is instanceof Fruit");  //a)
        if(fruit instanceof Fruit){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("fruit instanceof Orange");  //b)
        if(fruit instanceof Orange){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("fruit is instanceof Apple"); //c)
        if(fruit instanceof Apple){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }

        System.err.println("fruit is instanceof GoldenDelicious");  //d)
        if(fruit instanceof GoldenDelicious){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }
        
        System.err.println("fruit is instanceof McIntosh");  //e)
        if(fruit instanceof McIntosh){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }
        
        System.err.println("orange is instanceof Orange");  //f)
        if(orange instanceof Orange){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }
        
        System.err.println("orange is instanceof Fruit");  //g)
        if(orange instanceof Fruit){
            System.err.println("True");  
        }else{
            System.err.println("False");  
        }
        
        System.err.println("orange is instanceof Apple");  //h)
//        if(orange instanceof Apple){
//            System.err.println("True");  
//        }else{
//            System.err.println("False");  
//        }

        //i)
        Fruit fruitApple = new Apple();
        //fruitApple.makeAppleCider();
        
        //j)
        orange.makeOrangeJuice();
        Fruit fruitOrange = orange;
        //fruitOrange.makeOrangeJuice();
        
        //k)
        //Orange p = new Apple();
        
        //l)
        //McIntosh mc = new Apple();
                
        //m)
        Apple p = new McIntosh();
    }
}

class Fruit {
    
}
///////////////////////////
class Apple extends Fruit {
    public void makeAppleCider(){}
}
class Orange extends Fruit {
    public void makeOrangeJuice(){}
}
///////////////////////////
class GoldenDelicious extends Apple {
    
}
class McIntosh extends Apple {
    
}

