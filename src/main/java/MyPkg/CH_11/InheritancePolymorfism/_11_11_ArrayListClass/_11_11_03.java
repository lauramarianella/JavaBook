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
public class _11_11_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        System.out.println("\n " + list);
        
        /*list.remove("Dallas");
        System.out.println("\n " + list);*/
        
        for(int i=0; i< list.size();i++){
            list.remove("Dallas");
            System.out.println("\n iteration " + (i+1) + list);
        }
        System.out.println("\n " + list);
        
    }
}
