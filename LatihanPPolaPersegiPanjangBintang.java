package latihanppolapersegipanjangbintang;
import java.util.Scanner;
public class LatihanPPolaPersegiPanjangBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.print("nilai awal : ");
        awal = input.nextInt();
        System.out.print("nilai akhir : ");
        akhir = input.nextInt();
        for (int i = 1; i <= awal; i++) {
            System.out.print(" * ");
            for (int j = 1; j < akhir; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
            
        }
       
    }
    
}
