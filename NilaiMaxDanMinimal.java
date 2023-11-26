package nilaimaxdanminimal;
import java.util.Scanner;
public class NilaiMaxDanMinimal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah,angka,hasil,maksimal = 0, minimal = 11111;
        System.out.print("masukkan jumlah angka : ");
        jumlah = input.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("angka ke-"+i+" : ");
            angka = input.nextInt();
            if (angka > maksimal ){
                maksimal =angka;
            }if (angka < minimal){
                minimal = angka;
            }
            
            
        }System.out.println("Nilai Maksimal \t: "+maksimal);
        System.out.println("Nilai minimal \t: "+minimal);
    }
    
}
