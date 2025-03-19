public class tut7_intro_strings {
    public static void main(String[] args) {
        
    /* Strings are not primitive datatype in Java but can be used using String class of java
        NOTE - String are immutable but when we try to change the string then it creates a different copy of it in the memory.

        String name = new String("Kaladhar");
        System.out.println(name);
        name = "Gopal";
        System.out.println(name);

        Different ways of printing in java:
        System.out.println() - cursor is thrown to new line  
        System.out.print() - cursor remains in the same line
        System.out.format() - 
        System.out.printf() -
        
        There are two ways of creating string in java
        1. String st = new String("Kaladhar") - this will create a new memory block even if "kaladhar" alraedy exists in the memory
        2. String st  = "Kaladhar" - this will first check if "kaladhar" exists or not, if not then creates a new
        two same strings created using new keyword won't give true in == relational operators
        but two strings having same value NOT created with new keyword will give true value when checked with == operator

   -------------Difference between printf and format-----------------

        System.out.format("Kaladhar Gopal is %d years old",19)
        System.out.printf("Kaladhar Gopal is %d years old",19)

        The above code will give the same output
        Difference : use printf when the goal is to just print the formatted string
                    use format for printing as well as for generating formatted string 

        Note - u cannot generate a formatted string using printf


        -------------------------Methods of String-------------------------

        String name = "Kaladhar";

        1 name.length() 
        2 name.toLowerCase() 
        3 name.toUpperCase()
        4 name.trim() - returns sting after removing all the leading and trailing spaces from the string.
        5 name.substring(start,end) - start is included and end is excluded, if only one integer is given then it will return string from that index to the end of the string.

        6 name.replace(what to replace, what it should be replaced with )
        NOTE - we can replace character and substring both using this method but 
        what happens when the length of target and replacement string different???

        example name.replace('k',"Leel") - this will replace the first character k with leel 
        output - Leeladhar - This will increase the length of the original string

        7 name.startsWith() - will return true or false if the string stars with the given character or substring
        8 name.endsWith() - opposite of startsWith()
        9 name.charAt() - returns character at the index (indexing starts with zero)
        
        10 name.indexof() - returns index of first occurrence of the character or substring, it return -1 if the given character or substring is not found

        11 name.indexof("substring",start_searching_from_here) - we can specify where to start searching form 
        NOTE - using this we can create a function to get the no. of occurrence of a character or string using loop
        
        12 name.lastIndexOf("") - gives the last index of the character of the character or substring, for single occurrence it won't be difference from indexOf but in case of multiple occurrence it will be diffrence.\

        13 name.lastIndexOf(",2") - gives the last index of the substring or character before index 2(including it)
        14 name.equals(str1, str2) - compares the contents of two strings if they are equal or not
        
        NOTE : =========== Difference between == and .equals()===============
         
        == will compare the reference addresses of the two strings while .equals() compares the content of the two strings.
        ex. 
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.print(s1 == s2) : Returns true because they are referring to the same address.
        
        String s3 = new String("Hello"); // Creates a new memory location
        System.out.print(s1 == s3) : Returns false because they are referring to the different address.

        15 name.equalsIgnoreCase("string") : this will compare content irrespective of the case
     * 
     */    
        String name = "Kaladhar";
        String name2 = "Kaladhar";


        System.out.println(name.lastIndexOf("a",3));
        System.out.println(name == name2);
        
        


    }
}
