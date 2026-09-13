import java.util.Scanner;
public class Shopping_cart {
    public static void main(String[] args){
        String product;
        double price;
        int quntity;
        double total;

        Scanner scanner=new Scanner(System.in);

        System.out.print("ENTER THE PRODUCT:");
        product=scanner.nextLine();

        System.out.print("ENTER THE PRICE:");
        price=scanner.nextDouble();

        System.out.print("ENTER THE QUNTITY");
        quntity=scanner.nextInt();

        total=price*quntity;

        System.out.println("\nPURCHASE PRODUCT:"+product);
        System.out.println(product+" PRICE :"+price);
        System.out.println(("Total Amound:"+total));

        scanner.close();
    }    
}
