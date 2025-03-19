import java.util.Scanner;

public class tut9_if_else_conditional_switch_case {
    public static void main(String[] args){
    
    /*
    If else condition in Java

    Logical operatos in java - && AND , || OR , ! NOT operator
    
        int age =9;
        if (age>10){
            System.out.println("Heyyy!! you are above 10 years old");
        }
        else if (age == 10){
            System.out.println("You are exactly 10 years old");
        }
        else{
            System.out.println("Cazz!! chill bro! watch pogo TV ");
        }

        =================================== Switch case statement =================================

        switch case statement is used when there is values based comparison of the variable.
        
        if else statement is sequentially executed while switch case statemetn is excuted in table form which makes is faster to get the values compared, it is used where there is less computation for comparision 

        If break is not used then if one case is matched then all the cases will be executed without checking the condition, so break is necessary.

        default case is executed when 
        Example : 
            Scanner sc = new Scanner(System.in);    
            System.out.print("Enter your name : ");
            String name = sc.nextLine();

            switch (name) {
                case "Kaladhar":
                    System.out.println("Welcome back bosss!!!");
                    break;
                
                default:
                    System.out.println("Have a good day!!");
            }

        
        there is also a version of switch case called enhanced switch where there is no need to add break statement.

    */
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name = sc.nextLine();

    switch (name){
        // {} is not necessary when there is only one statement, if there are multiple statements then need to add {} them.
        case "Kaladhar" -> { System.out.println("Welcome boss!!"); }
        case "Gopal" ->System.out.println("Have a nice day sir");
        default -> System.err.println("We are glad that you ran the code!!");

    }

    }
}
