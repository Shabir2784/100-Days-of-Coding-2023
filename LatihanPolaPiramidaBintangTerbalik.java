package latihanpolapiramidabintangterbalik;
import java.util.Scanner;
public class LatihanPolaPiramidaBintangTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 0; i <= angka; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }for (int k = 1; k <=angka-i; k++) {
                System.out.print(" *");
            }
            System.out.println( );
        }
        
    }
    
}
