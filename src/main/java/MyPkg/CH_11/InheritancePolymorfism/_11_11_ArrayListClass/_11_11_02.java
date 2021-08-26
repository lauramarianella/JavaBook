/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_11_ArrayListClass;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class _11_11_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        //list.add(new java.util.Date());
        String city = list.get(0);
        /*list.set(3, "Dallas");
        System.out.println(list.get(3));*/
    }
}
