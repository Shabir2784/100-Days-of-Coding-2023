package latihansegitigaangka;
import java.util.Scanner;
public class LatihanSegitigaAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan batas : ");
        int batas = input.nextInt();
       
        for (int i = 1; i <= batas; i++) {            
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
                
            }System.out.println(" ");
          
        }System.out.println("==============");
        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            
       
            }
            System.out.println(" ");
          
        }System.out.println("=============");
        int k = 0;
        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= i; j++) {
                
                 k++;
                System.out.print(k+" ");
            
        }System.out.println(" ");
        }
    }
    
}
