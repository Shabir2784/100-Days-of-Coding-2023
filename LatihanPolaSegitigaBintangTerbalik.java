package latihanpolasegitigabintangterbalik;
import java.util.Scanner;
public class LatihanPolaSegitigaBintangTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan nilai 1 : ");
        int angka1 = input.nextInt();
        for (int i = 0; i <=angka1 ; i++) {
            for (int j = 1; j <= angka1-i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
