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
public class _13_5_WithPI {

    public static void main(String[] args) {
        double pi = Math.PI;//3.14..
        
        Number numberAsType = pi;

        System.out.println("doubleValue: " + numberAsType.doubleValue());
        System.out.println("floatValue: " + numberAsType.floatValue());
        System.out.println("longValue: " + numberAsType.longValue());
        System.out.println("intValue: " + numberAsType.intValue());
        
    }

}
