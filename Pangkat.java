package pangkat;
import java.util.Scanner;
public class Pangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bilangan, pangkat, hasil;
        System.out.print("\nmasukkan bilangan \t: ");
        bilangan = input.nextInt();
        System.out.print("masukkan pangkat \t: ");
        pangkat = input.nextInt();
        System.out.println("***************");
        System.out.print("hasil : ");
        hasil= bilangan;
        
        for (int i = 1; i < pangkat; i++) {
            hasil *= bilangan;
            System.out.println(hasil);
          
            
        }
    }
    
}
