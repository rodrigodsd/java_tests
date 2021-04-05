package datatypes;

public class TestClass2 {

    String s = this.toString();
    String t;
   // var value = 0; //1

    public static void main(String[] args) {

        //var secondArg = Integer.parseInt(args[2]); //3

        if( true == 2 > 10 )
            System.out.println("não vai entrar aqui");


        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

        /*  Resulting type of arithmetic operations on 
            types smaller that int is an int; otherwise,
            the result is of a type of a largest participant */

        // s = b * b;  Type mismatch: cannot convert from int to short
                        
        i = b + b; // the result of b + b will be an int type 
        
        s *= b; // it is the same that s = (short)(s * b);  so the result of s * b will be explicitly cast to short type

       // s = s * b;  Type mismatch: cannot convert from int to short

        c += b;

        //c = c + b;  Type mismatch: cannot convert from int to char

        s += i;

        /* The compiler makes some assumptions when it sees an operator with assignment. For instance, 
        in the following sequence of statements, the compiler does not object to the fact that line 2
         adds an int value to a byte because it performs an explicit cast, the equivalent of line 4;
          however, in line 3, which is the logical equivalent of line 2, it raises an objection: 
            1. byte b = 0 ;
            2. b += 27 ; 
            3. b = b + 27 ;
            4. b = (byte)(b + 27) ;
          */

    }
    
}
