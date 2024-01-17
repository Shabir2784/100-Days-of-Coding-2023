package latihankonversibinerkedesimal;
import java.util.Scanner;
public class LatihanKonversiBinerKeDesimal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka_biner, angka_desimal=0, i=1, digit;
        System.out.print("masukkan angka biner : ");
        angka_biner = input.nextInt();
        
        System.out.println("angka desimal dari biner "+angka_biner);
        
        while(angka_biner !=0){
            digit = angka_biner % 10;
            angka_desimal = angka_desimal + (digit*i);
            i = i*2;
            angka_biner =angka_biner/10;
            
        }
        System.out.println(" adalah : "+angka_desimal);
        
    }
    
}
