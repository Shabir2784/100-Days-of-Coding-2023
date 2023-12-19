package latihanpenjumlahaninput;
import java.util.Scanner;
public class Latihanpenjumlahaninput {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        int hasil = jumlah(angka);
        System.out.println("jumlah ; 1 + 2 + 3 + .... + "+angka+ " = "+ hasil);
        
    }
    public static int jumlah (int angka){
        int hasil = 0;
        for (int i = 1; i <= angka; i++) {
            hasil +=i;
        }
        return hasil;
    }
}
