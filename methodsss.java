import java.util.Scanner;
public class methodsss {

    void add(Scanner sc){
        int a,b,c;

        System.out.print("Enter The A :");
        a=sc.nextInt();

        System.out.print("Enter The B :");
        b=sc.nextInt();
        
        c=a+b;
        System.out.println("The A and B is add the number"+c);

    }
    void sub(int a ,int b){
        int c=a-b;
        System.out.println("The  A and B is Subtract the"+c);
    }

    public static void main(String[] args){
        methodsss ms=new methodsss();

        Scanner sc=new Scanner(System.in);
        
        ms.add(sc);
        
        System.out.print("Enter The A :");
        int a=sc.nextInt();

        System.out.print("Enter The B :");
        int b=sc.nextInt();

        ms.sub(a, b);

        sc.close();

    }


}



