package polapersegi;
import java.util.Scanner;
public class PolaPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        
        int jumlah = input.nextInt();
        for (int i = 0; i <= jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                System.out.print("O "); 
            }
            System.out.println("O ");
        }
       
    }
    
}
