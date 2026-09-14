import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[] args){
        int a;
        int b;
        int add;
        int sub;
        int mul;
        int div;

        Scanner scanner=new Scanner(System.in);

        System.out.print(("ENTER THE A:"));
        a=scanner.nextInt();

        System.out.print(("ENTER THE B:"));
        b=scanner.nextInt();
        
        add=a+b;
        System.out.println(("THE A AND B ADD THE NUMBER IS:"+add));
        
        
        sub=a-b;
        System.out.println(("THE A AND B SUB THE NUMBER IS:"+sub));

        mul=a*b;
        System.out.println(("THE A AND B MUL THE NUMBER IS:"+mul));
        
        div=a/b;
        System.out.println(("THE A AND B DIV THE NUMBER IS:"+div));
        

        scanner.close();     
    }
    
}
