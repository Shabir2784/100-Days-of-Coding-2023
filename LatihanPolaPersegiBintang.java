package latihanpolapersegibintang;
import java.util.Scanner;
public class LatihanPolaPersegiBintang {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.print("masukkan besar persegi : ");
        int besar = input.nextInt();
        System.out.println("");
        for (int i = 1; i <= besar; i++) {
            System.out.print(" * ");
            for (int j = 1; j < besar; j++) {
                System.out.print(" * ");
                
            }
            System.out.println("");
        }
    }
    
}
