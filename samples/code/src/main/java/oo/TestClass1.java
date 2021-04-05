package oo;

/* Access Levels
Modifier        Class    Package    Subclass    World
-----------------------------------------------------
public           Y        Y          Y           Y
protected        Y        Y          Y           N
(Default)        Y        Y          N           N
private          Y        N          N           N
 */

 /* 
 A switch works with the byte, short, char, and int primitive data types.
 It also works with enumerated types (discussed in Classes and Inheritance) 
 and a few special classes that "wrap" certain primitive types: Character, Byte, Short, and 
 Integer (discussed in Simple Data Objects).
 */

public class TestClass1 {

    static class StaticNestedClass {

        private String s = "";
        
    }
    class InnerClass {
        
    }

   public static void main(String[] args) {
       
    int t = 8;

    switch (t) {
      
    }
   }
    
}
