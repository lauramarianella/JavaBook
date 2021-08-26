/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_11_ArrayListClass;


public class _11_10_MyStackDemo {
    public static void main(String[] args){
        _11_10_MyStack myStack = new _11_10_MyStack();
        myStack.push("1st");
        myStack.push(2);
        myStack.push("3rd");
        myStack.push(4);
        
        while(!myStack.isEmpty())System.out.println(myStack.pop());
    }
}
