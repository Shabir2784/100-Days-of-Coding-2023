package latihanderetangka;
import java.util.Scanner;
public class LatihanDeretAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int deret = input.nextInt();
        for (int i = 1; i <= deret; i++) {
            System.out.print(i+" ");
            
        }System.out.println(" ");
        // deret angka kelipatan 5
        System.out.print("masukkan angka : ");
        int derett = input.nextInt();
        for (int i = 1; i <= derett; i++) {
            System.out.print(i*5+" ");
            
        }System.out.println(" ");
      
       
    }
    
}
