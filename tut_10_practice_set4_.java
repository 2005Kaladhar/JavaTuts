import java.util.Locale;
import java.util.Scanner;

public class tut_10_practice_set4_ {
    public static void main(String[] args){
        
    /*    
    write a program to find out whether a student is pass or fail is it requires 44% in total and atleast 33% in each subject. Assume there are 3 subjects.    
    
    System.out.println("Practice set 4 on conditional statements");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 : ");
        float sub1 = sc.nextFloat();

        System.out.print("Enter marks of subject 2 : ");
        float sub2 = sc.nextFloat();

        System.out.print("Enter marks of subject 3 : ");
        float sub3 = sc.nextFloat();

        float total = (sub1 + sub2 + sub3)/100;
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
            
            if(total >= 44 ){System.out.format("Pass!! Congratulations you have passed with %.2f percentage",total);}
            else{System.out.println("Fail!! You could not fulfil the agregate marks criterion");            }

        }
        else{System.out.println("You could not fulfil the individual subject minimum marks criterion ");}

        Q2. Calculating the income tax paid by an employee to the government of india as per the following table 

                INCOME SLAB                 TAX
                2.5L - 5.0L                 5%
                5.0L - 10.0L                20%
                Above 10.01L                30%
        
        Difference in using 0.5f and 0.5
        0.5 -> is treated as double in java, 64bit space. has higher precision, use it in case of very high precision requirement, takes more space
        0.5f -> this is float (32 bit) therefore has less precision than double, saves memory

        
    */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Enter Your annual income in Lakhs: ");
        float income = sc.nextFloat();

        if (income>=2.5 && income<=5.0){
            System.out.printf("Your tax is 5%% on the total income, tax to be paid :  %.2f Lakh",income*0.05f);
        }
        else if (income>5.0 && income<=10.0 ){
            System.out.printf("Your tax is 20%% on the total income, tax to be paid : %.2f Lakh",income*0.20f);
        }
        else if (income>10.0 ){
            System.out.printf("Your tax is 30%% on the total income, tax to be paid : %.2f Lakh ",income*0.30f);
        }
        else{
            System.out.printf("Your income is less than 2.5Lakhs you don't have to pay tax, caz!!");
        }

        
    }
}
