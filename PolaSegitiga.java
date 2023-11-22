package polasegitiga;
import java.util.Scanner;
public class PolaSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah;
        System.out.print("masukkan angka : ");
        jumlah = input.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("o ");
                
            }System.out.println("o ");
            
        }
    }
    
}
