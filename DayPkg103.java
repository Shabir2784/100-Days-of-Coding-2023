package daypkg103;
import java.util.Scanner;
public class DayPkg103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        double x1, x2;
        System.out.print("masukkan nilai A : ");
        a = input.nextInt();
        System.out.print("masukkan nilai b : ");
        b = input.nextInt();
        System.out.print("masukkan nilai c : ");
        c = input.nextInt();
        
        d = (b*b)-(4*a*c);
        System.out.print("Diskriminan = "+d);
        if (d > 0) {
            System.out.println(" (akar real dan berbeda)");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (d == 0) {
            System.out.println(" (akar real dan sama)");
            x1 = x2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } 
        else {
            System.out.println(" (akar tidak real / imajiner)");
        }
        
    }
    
}
