import java.util.Scanner;
public class Rectangle{

    public  static void main(String[] args){
        double width=0;
        double length=0;
        double area=0;

        Scanner cr = new Scanner(System.in);

        System.out.print("ENTER THE WIDTH:");
        width=cr.nextDouble();

        System.out.print("ENTER THE LENGTH");
        length=cr.nextDouble();

        area=width*length;
        System.out.println("AREA :"+area);

        cr.close();
    }
}
