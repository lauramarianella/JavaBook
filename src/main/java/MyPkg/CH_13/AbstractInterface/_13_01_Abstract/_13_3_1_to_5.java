package MyPkg.CH_13.AbstractInterface._13_01_Abstract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class _13_3_1_to_5 {
    public static void main(String[] args) {
        /*//13.3.1 Why do the following two lines of code compile but cause a runtime error?
        Number numberRef = new Integer(0);
        Double doubleRef = (Double)numberRef; 
        class java.lang.Integer cannot be cast to class java.lang.Double*/
        
        /*//13.3.2 Why do the following two lines of code compile but cause a runtime error?
        Number[] numberArray = new Integer[2];
        numberArray[0] = new Double(1.5);*/
        
        new Test3().main();
        new Test4().main();
        new Test5().main();
    }             
}


//13.3.3 Show the output of the following code:
class Test3 {
    public void main() {
        Number x = 3;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());
    }
}
//13.3.4 What is wrong in the following code? (Note the compareTo method for the
//Integer and Double classes was introduced in Section 10.7.)
class Test4 {
    public void main() {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(((Integer)x).compareTo(new Integer(4)));//System.out.println(x.compareTo(new Integer(4)));
    }
}
//13.3.5 What is wrong in the following code?
class Test5 {
    public void main() {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(((Integer)x).compareTo(new Integer(4)));//System.out.println((Integer)x.compareTo(new Integer(4)));
    }
}