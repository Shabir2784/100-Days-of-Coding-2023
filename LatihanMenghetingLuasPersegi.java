package latihanmenghetingluaspersegi;
import java.util.Scanner;
public class LatihanMenghetingLuasPersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan panjang sisi persegi : ");
        int sisi = input.nextInt();
        int luas;
        luas = (sisi * sisi);
        luas = Math.round(luas*100)/100;
        System.out.print("luas persegi : "+luas);
        
        System.out.println(" ");
 
    }
    
}
