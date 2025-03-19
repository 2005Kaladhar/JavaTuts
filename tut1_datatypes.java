//This is my first Java program
//Public means this class can be accessed from anywhere.
//static means without creating an instance of the class we are using the function of the class
//
//anatomy of a java program
//1. Documentation section - Optional but suggested to add this
/*2. package statement - Optional
* 3. Import statement - Optional
* 4. Interface statement - Optional
* 5. Class definition - Optional
* 6. Main method class  - Essential
*
*--------------------------- Naming convention-------------
* PascalConvention , camelCaseConvention
*
* ---------------------------Datatypes in Java------------------------
* 1. Primitive - int, float, char, bool, long, double, byte, short
* 2. Non-primitive - Derived from primitive data types.
*-----------------------------------------------------------------------
 Syntax  - the set of rules needed to write a code is called Syntax
    
byte - takes 1 byte of storage, 8 bits, 2^(8n-1) to (2^(8n))-1 range, n = bytes
short - takes 2 bytes , 2x8 = 16 bits, 2^(16-1) to  (2^16)-1 range 
int - take 4 bytes
float - takes 4bytes 
long - 8bytes  
double - 8bytes
char - takes 2 bytes, not negative numbers therefore ranges from 0 to (2^16 - 1)
boolean - default value is false, size depends on JVM 
----------------------------------------------------------------------------

Difference between println and print :- println prints in new line, while print prints in the same line where cursor was last time.

--------------------------------------------------------------------------------
                            



*/

public class tut1_datatypes {
    public static void main(String[] args) {
        System.out.println("Hello World this is Kaladhar Gopal Learning Java");
        
        //Program to print sum of 3 numbers
        int num1 = 1;
        int num2 = 35;
        int num3 = 2;
        System.out.println(num1+num2+num3);
    }
}