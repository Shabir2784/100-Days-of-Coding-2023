package daypkg104;
import java.util.Scanner;
public class DayPkg104 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        char golongan;
        int jam_kerja =0 , upah_per_jam = 0, total_upah;
        System.out.print("nama karyawan : ");
        nama = input.nextLine();
        System.out.print("golongan : ");
        golongan = input.next().charAt(0);
        System.out.print("jam kerja : ");
        jam_kerja = input.nextInt();
        if (golongan == 'A') {
            upah_per_jam = 5000;
            
        }else if (golongan == 'B') {
            upah_per_jam = 7000;
            
        }else if (golongan == 'C') {
            upah_per_jam = 9000;
            
        }else if (golongan == 'D') {
            upah_per_jam = 1000;
            
        }
        total_upah = jam_kerja * upah_per_jam;
        if ((jam_kerja - 48 )> 0 ) {
            total_upah = total_upah +((jam_kerja - 48)*4000);
            
        }System.out.println(nama +" menerimah upah Rp. "+total_upah+" per minggu");
    }
    
}
