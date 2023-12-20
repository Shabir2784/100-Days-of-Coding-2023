package latihaninputgajipokokdangajilembur;
import java.util.Scanner;
public class LatihaninputGajiPokokDanGajiLembur {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int gaji_pokok = 0, lembur = 0, gaji_bersih;
        System.out.print("masukkan gaji : ");
        gaji_pokok = input.nextInt();
        System.out.print("masukkan lembur/jam : ");
        
        lembur = input.nextInt();
        gaji_bersih = lembur * 55000;
        gaji_pokok = gaji_bersih * gaji_pokok;
        System.out.println("gaji pokok : "+ gaji_pokok);
            
        
            
            
        
        
    }
    
}
