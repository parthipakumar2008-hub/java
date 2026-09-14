import java.util.Scanner;

public class Travel_cost_calc {
    public static void main(String[] args){
        int distance;
        int PP;
        int millage;
        int TPC;
        int petrol;
        
        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER THE DISTANCE:");
        distance=sc.nextInt();

        System.out.print("ENTER THE PETROL PRIZE:");
        PP=sc.nextInt();

        System.out.print("ENTER THE MILLAGE:");
        millage=sc.nextInt();

       
        
        petrol=distance/millage;
        TPC=petrol*PP;

        System.out.println("\nTOTAL DIATNCE:"+distance+"Km");
        System.out.println("PETROL:"+petrol+"l");
        System.out.println("PETROL COST::"+TPC+"$");

        sc.close();
    }
    
}
