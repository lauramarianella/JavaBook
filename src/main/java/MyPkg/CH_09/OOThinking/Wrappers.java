/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_09.OOThinking;

/**
 *
 * @author laura
 */
public class Wrappers {
    public static void main(String[] args){
        {
            //declaring and instantiating
           // Integer     objInteger1 = new Integer(5000);
            Integer     objInteger2 = 5000;
            //Integer     objInteger3 = new Integer("5000");
            Integer     objInteger4 = Integer.valueOf(5000);
            Integer     objInteger5 = Integer.valueOf("5000");

            //Long        objLong1    = new Long(565555);
            Long        objLong2    = 565555L;
            //Long        objLong3    = new Long("565555");
            Long        objLong4    = Long.valueOf(565555);
            Long        objLong5    = Long.valueOf("565555");

            //Double      objDouble1  = new Double(12.4);
            Double      objDouble2  = 12.4;
            //Double      objDouble3  = new Double("12.4");
            Double      objDouble4  = Double.valueOf(12.4);
            Double      objDouble5  = Double.valueOf("12.4");

            //Float       objFloat1   = new Float(5000.5F);
            Float       objFloat2   = 5000.5F;
            //Float       objFloat3   = new Float("5000.5F");
            Float       objFloat4   = Float.valueOf(5000.5F);
            Float       objFloat5   = Float.valueOf("5000.5F");

            //Character   objChar1    = new Character('q');
            Character   objChar2    = 'q';
            Character   objChar3    = Character.valueOf('q');
        }
        
        
        {
            //constants
            System.out.println("Integer.MAX_VALUE: "  + Integer.MAX_VALUE);
            System.out.println("Double.MAX_VALUE: "  + Double.MAX_VALUE);
            System.out.println("Double.MAX_VALUE: "  + Float.MAX_VALUE);
        }
        
        
        {
            //Static to String
            String str_int_value = Integer.toString(123);
            String str_double_value = Double.toString(3.1416);
            String str_char_value = Character.toString('a');
        }
        
        
        {
            //Object ==> String
            Integer objInteger = 5000;
            String str_int_value = objInteger.toString();
        }
        
        
        {
            //Static parsing from String
            int intValue = Integer.parseInt("123");
            double doubleValue = Double.parseDouble("3.1416");
        }
        
        {
            //Wrapper ==> any other primitive
            Double objDouble = 1234.56;
            short short_value = objDouble.shortValue();
            int int_value = objDouble.intValue();
            long long_value = objDouble.longValue();
            float float_value = objDouble.floatValue();

            System.out.println("From Double Object: short primitive: " + short_value);
            System.out.println("From Double Object: int primitive: " + int_value);
            System.out.println("From Double Object: long primitive: " + long_value);
            System.out.println("From Double Object: float primitive: " + float_value);
        }
        
        {
            /*
            int double_val = 1234.56;
            short short_value = double_val.shortValue();
            int int_value = double_val.intValue();
            long long_value = double_val.longValue();
            float float_value = double_val.floatValue();
            */
        }
        
        {
            //primitive ==> any other primitive
            Number double_val = 1234.56;
            short short_value = double_val.shortValue();
            int int_value = double_val.intValue();
            long long_value = double_val.longValue();
            float float_value = double_val.floatValue();

            System.out.println("From double primitive: short primitive: " + short_value);
            System.out.println("From double primitive: int primitive: " + int_value);
            System.out.println("From double primitive: long primitive: " + long_value);
            System.out.println("From double primitive: float primitive: " + float_value);
        }
        
        {
            //Integer i1 = new Integer("23");
            //Integer i2 = new Integer(23);
            Integer i3 = Integer.valueOf("23");
            Integer i4 = Integer.parseInt("23", 8);
            //Double d1 = new Double();
            Double d2 = Double.valueOf("23.45");
            //int i5 = (Integer.valueOf("23")).intValue();
            //double d3 = (Double.valueOf("23.4")).doubleValue();
            int i6 = (Double.valueOf("23.4")).intValue();
            String s1 = (Double.valueOf("23.4")).toString();
            
        }
    }
    
    
}