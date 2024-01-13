package latihanpenjumlahanderetangka;
import java.util.Scanner;
public class LatihanPenjumlahanDeretAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        int total;
        total = 1;
        System.out.print(1);
        for (int i = 2; i <= angka; i++) {
            System.out.print(" + "+ i);
            total = total + i;
            
        }
        System.out.println(" = "+ total);
        
    }
    
}
