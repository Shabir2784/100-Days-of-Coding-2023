package latihanpolapersegiangka;
import java.util.Scanner;
public class LatihanPolaPersegiAngka {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            //System.out.print(i+" ");
            for (int j = 1; j <= angka; j++) {
                System.out.print(i+"  ");
            }System.out.println(" ");
            
        }System.out.println("================");
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(j+"  ");
        }System.out.println(" ");
        
        }System.out.println("=================");
        int k = 0;
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {             
                k++;                                  
                System.out.print(k+"  ");               
            }System.out.println(" ");
            
        }
    }
    
}
