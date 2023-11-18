package ganjil_genap;
import java.util.Scanner;
public class Ganjil_Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir,a;
        System.out.print("masukkan nilai awal : ");
        awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        akhir = input.nextInt();
        a = awal;
        while (a <= akhir){
            //a++;
            int hasil = a%2;
            if (hasil == 0){
                System.out.println(a + " : genap");
            }
            else {
                System.out.println(a + " : ganjil");
            }
            a++;
        }
       
    }
    
}
