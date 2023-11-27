package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.print("jumlah angka : ");
        int n = input.nextInt();
        
        int fn;
        System.out.println("Deret fibonacci");
        System.out.print(f1+", ");
        System.out.print(f2);
        for (int i = 1; i < n; i++) {
            fn = f1 + f2;
            System.out.print(" , "+ fn);
            f1=f2;
            f2=fn;
            
        }System.out.println("");
    }
    
}
