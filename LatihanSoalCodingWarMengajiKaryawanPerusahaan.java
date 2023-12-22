package latihansoalcodingwarmengajikaryawanperusahaan;
import java.util.Scanner;
public class LatihanSoalCodingWarMengajiKaryawanPerusahaan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int karyawan_1, karyawan_2, karyawan_3, karyawan_4, karyawan_5;
        double gaji_kotor_perhari , uang_makan_perhari ;
        double gaji_bersih_karyawan_1 = 0, gaji_bersih_karyawan_2 = 0,
                gaji_bersih_karyawan_3 = 0,gaji_bersih_karyawan_4 = 0,
                gaji_bersih_karyawan_5 = 0;
        double total = 0;
        uang_makan_perhari =  15000; 
        gaji_kotor_perhari =  120000;
        System.out.print("masukkan jumlah hari kerja karyawan 1 : ");
        karyawan_1 = input.nextInt();
        System.out.print("masukkan jumlah hari kerja karyawan 2 : ");
        karyawan_2 = input.nextInt();
        System.out.print("masukkan jumlah hari kerja karyawan 3 : ");
        karyawan_3 = input.nextInt();
        System.out.print("masukkan jumlah hari kerja karyawan 4 : ");
        karyawan_4 = input.nextInt();
        System.out.print("masukkan jumlah hari kerja karyawan 5 : ");
        karyawan_5 = input.nextInt();
                
        gaji_bersih_karyawan_1 = (gaji_kotor_perhari - uang_makan_perhari) * karyawan_1;
        gaji_bersih_karyawan_2 = (gaji_kotor_perhari - uang_makan_perhari) * karyawan_2;
        gaji_bersih_karyawan_3 = (gaji_kotor_perhari - uang_makan_perhari) * karyawan_3;
        gaji_bersih_karyawan_4 = (gaji_kotor_perhari - uang_makan_perhari) * karyawan_4;
        gaji_bersih_karyawan_5 = (gaji_kotor_perhari - uang_makan_perhari) * karyawan_5;
   
        System.out.println("gaji bersih karyawan 1 = " + gaji_bersih_karyawan_1);
        System.out.println("gaji bersih karyawan 2 = " + gaji_bersih_karyawan_2);
        System.out.println("gaji bersih karyawan 3 = " + gaji_bersih_karyawan_3);
        System.out.println("gaji bersih karyawan 4 = " + gaji_bersih_karyawan_4);
        System.out.println("gaji bersih karyawan 5 = " + gaji_bersih_karyawan_5);
        System.out.println("=================================");
        total = gaji_bersih_karyawan_1 + gaji_bersih_karyawan_2 + gaji_bersih_karyawan_3 + 
                gaji_bersih_karyawan_4 + gaji_bersih_karyawan_5;
        System.out.println("jumlah uang yang disiapkan perusahaan untuk menggaji karyawan : "+total);
        
    }
    
}
