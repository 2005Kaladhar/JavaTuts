/*
 *------------------- Literals in Java------------------- 
 * Literal is any constant value that is stored in a variable.
 * 
 * Basically there are 4types of literals in Java
 * 1. Integral - int,long,byte,short 
 * 2. Floats (Decimals) - float, double
 * 3. Boolean
 * 4. Char
 * 
 * float flt = 5.6;
 * By default float stores values as double in it
 * To specify float there use f 
 * 
 * float flt = 5.6f; -> Specifies that it is a floating point number.
 * double dbl = 5.6; -> not necessary to write 5.6d or 5.6D 
 * 
 *for creating long int we need to specify it even after declaring long 
 * long lng = 43435434; --> Will show error that int size very large
 * long lng = 46543544L; -> This will specify that it is long type of integer
 * 
 * Declaring string in Java
 * String str = "kaladhar"; -> in this way we decalre a string in java
 * 
 * Keywords - words which are already reserved by the language itself.
 * Java has 53 Keywords.
 * 
 * 
 * 
 */




public class tut2_literals {
    public static void main(String[] args) {
        System.out.println("This is second tutorial");
    
        String name = "Kaladhar";
        System.out.println(name);

    }
    
}
