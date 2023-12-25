package latihanuangbersihygdidptkndarihasilpenjualantanahsetelahdiotongpajak;
import java.util.Scanner;
public class LatihanUangBersihYgDidptknDariHasilPenjualanTanahSetelahDiotongPajak {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int luas_tanah;
        int harga_jual_permeter = 300000;
        int uang_bersih = 0;
        
        int pajak = 0;
       
        System.out.print("masukkan berapa meter tanah (m2): ");
        luas_tanah= input.nextInt();
        
        harga_jual_permeter = harga_jual_permeter * luas_tanah;

        
        if (harga_jual_permeter >= 100000000) {
            pajak = harga_jual_permeter * 10/100;
            System.out.println("pajak 10%");
            
        }else if (harga_jual_permeter >= 50000000) {
            pajak = harga_jual_permeter - 5/100;
         System.out.println("pajak 5%");
            
        }else if (harga_jual_permeter < 50000000) {
            pajak = harga_jual_permeter - 1/100;
           System.out.println("pajak 1%");
            
        }
        uang_bersih = harga_jual_permeter - pajak;
        System.out.println("total harga jual : "+harga_jual_permeter);
        System.out.println("pajak wajib di bayar : "+pajak);
        System.out.println("uang bersih di dapatkan setelah potong pajak : "+uang_bersih);
        
    }
    
}
