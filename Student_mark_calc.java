import java.util.Scanner;
public class Student_mark_calc {
    public static void main(String[] args){

        int tamil;
        int english;
        int maths;
        int science;
        int cs;
        int avg;
        int tot;

        Scanner scanner =new Scanner(System.in);

        System.out.print("ENTER THE TAMIL MARK");
        tamil=scanner.nextInt();

        System.out.print("ENTER THE ENGLISH MARK");
        english=scanner.nextInt();
        
        System.out.print("ENTER THE MATHS MARK");
        maths=scanner.nextInt();

        System.out.print("ENTER THE SCIENCE MARK");
        science=scanner.nextInt();

        System.out.print("ENTER THE COMPUTER SCIENCE MARK");
        cs=scanner.nextInt();

        tot=tamil+english+maths+science+cs;

        avg=tot/5;

        System.out.println("\nThe Total Subject Mark:"+tot+"/500");
        System.out.println("The Average In Total Subject:"+avg);
        scanner.close();
    }
}

    
    

