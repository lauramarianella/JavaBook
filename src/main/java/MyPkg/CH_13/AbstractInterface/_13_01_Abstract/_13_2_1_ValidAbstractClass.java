/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_13.AbstractInterface._13_01_Abstract;

/**
 *
 * @author laura
 */
public class _13_2_1_ValidAbstractClass {
    
}

/*Wrong cuz abstract methods don't have body + class is not abstract
class Aa {
    abstract void unfinished() {
    }
}*/
/* Wrong cuz public abstract class, it is the other way around
public class abstract Ab {
    abstract void unfinished();
}*/

/*Wrong cuz class in not abstract
class Ac {
    abstract void unfinished();
}*/

/*
Wrong: Missing body method
abstract class Ad {
    protected void unfinished();
}*/

abstract class Ae {
    abstract void unfinished();
}

abstract class Af {
    abstract int unfinished();
}