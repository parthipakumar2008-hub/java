import java.util.Scanner;

public class Electricity_bill_calc {
    public static void main(String[] args){
        int unit;
        int rate;
        int total_bill;

        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER THE UNIT:");
        unit=sc.nextInt();

        System.out.print("ENTER THE ONE UNIT RATE");
        rate=sc.nextInt();

        total_bill=unit*rate;

        System.out.println("\nUNITS:"+unit);
        System.out.println("TOTAL BILL:"+total_bill);

        sc.close();
    }
}

