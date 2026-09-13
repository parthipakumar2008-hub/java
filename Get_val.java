import java.util.Scanner;

public class Get_val {

    public static void main(String[] args){ // Main Methods
        int a;
        int b;
        int c;

        Scanner gv =new Scanner(System.in); // Object Create , System.int = Input the code 

        System.out.println("ENTER THE A :");
        a=gv.nextInt();
        
        System.out.println("ENTER THE B:");
        b=gv.nextInt();

        c=a+b;

        System.out.println("TOTAL"+c);
    }
}

