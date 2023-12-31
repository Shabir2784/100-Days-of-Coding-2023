package latihanpolabintangpiramida;
import java.util.Scanner;
public class LatihanPolaBintangPiramida {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka-i; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    
}
