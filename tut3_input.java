/*
        
            ----------------Taking User Input in Java-----------

for this we need to import a class of java called Scanner class                                         
import java.util.Scanner 
                                        



                 
*/

import java.util.Scanner;


public class tut3_input {
    public static void main(String[] args) {
        System.out.println("This is the tutorial for taking user input");
        Scanner sc = new Scanner(System.in); //Creating an object of Scanner class, System.in specifies that the input will be taken from keyboard itself.
        
        // In this way, This will as for the input just after the first print statement and then print the boolean value 
        // System.out.print("Enter a number : ");
        // System.out.println("input is string : " + sc.hasNextInt());

        // float time = sc.nextFloat();// This will take floating point number as input
        // System.out.println("The entered time is : "+time);

        // int age = sc.nextInt(); // This will take the integer input
        // System.out.println("Age is : "+age);

        
        
        // String name = sc.nextLine(); // This will read the whole line as string.
        // System.out.println("The name is : "+name);

    }
}
