import java.util.Scanner;

public class Salary_calculator {
    public static void main(String[] args){
        int BS;
        int HRA;
        int DA;
        int GS;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("ENTER THE BASIC SALARY:");
        BS=sc.nextInt();

        System.out.print("ENTER THE HOUSE RENT ALLOWANCE:");
        HRA=sc.nextInt();

        System.out.print("ENTER THE DEARNESS ALLOWNACE:");
        DA=sc.nextInt();

        GS=BS+HRA+DA;

        System.out.println("\nBASIC SALARY:"+"$"+BS);
        System.out.println("HOUSE RENT ALLOWANC:"+"$"+HRA);
        System.out.println("DEARNESS ALLOWNACE: "+"$"+DA);
        System.out.println("GROSS SALARY:"+"$"+GS);

        sc.close();


    }
    
}
