package hargahpsamsung;
import java.util.Scanner;
public class HargaHpSamsung {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = null;
        double harga = 0, diskon = 0;
        int pilihan,unit;
        System.out.println("***daftar HP samsung***");
        System.out.println("1. samsung j1 primer\n2. samsung j2 primer\n3. samsung j3 primer");
        System.out.print("masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.print("masukkan jumlah unit : ");
        unit = input.nextInt();
        if (pilihan == 1){
            nama = "samsung j1 primer";
            harga = 1700000;
            if (unit >=10){
                diskon = 10 * (harga * unit)/100;
                System.out.println("diskon 15% - Rp."+diskon);
            }
        }else if(pilihan == 2){
            nama = "samsung j2 primer";
            harga = 1500000;
            if (unit >=10){
                diskon = 10 * (harga * unit)/100;
                System.out.println("diskon 10% - Rp."+diskon);
            }
        }else if (pilihan == 3){
            nama = "samsung j3 primer";
            harga = 1300000;
            if (unit >=10){
                diskon = 10 * (harga * unit)/100;
                System.out.println("diskon 5% - Rp."+diskon);
            }
        }if (nama == null){
            System.out.println("maaf pilihan anda tidak ada di daftar");
        }else {                  
        System.out.println("***********************");        
        System.out.println("nama HP terpilih : ");
        System.out.println(nama+" : Rp."+harga);
        harga = (harga * unit)-diskon;
        System.out.println("total dibayar : Rp."+harga+"/unit");
        }
    }
    
}
