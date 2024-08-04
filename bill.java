import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Price of pen");
        float pen = sc.nextFloat();
        System.out.println("Price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Price of eraser");
        float eraser =sc.nextFloat();

        
        float Total = pen + pencil + eraser;

        float GrandTotal = Total + (0.18f * Total); // with GST
        System.out.println("Total with GST");
        System.out.println(GrandTotal);
    }
}
