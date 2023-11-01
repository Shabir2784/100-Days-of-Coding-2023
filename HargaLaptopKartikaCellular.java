package hargalaptopkartikacellular;
import java.util.Scanner;
public class HargaLaptopKartikaCellular {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = null;
        int pilihan,harga=0,unit;
        System.out.println("***daftar laptop Asus***");
        System.out.println("  1.  TUF F15FX50DL i5 10300H\n  2.  Asus A402Z i5 12500H\n  3.  Asus a142ZA-IPS752 i7 1260P   ");
        System.out.print("masukkan pilihan laptop yang anda suka : ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            nama = "TUF F15FX50DL i5 10300H";
            harga = 13200000;
        }else if (pilihan == 2){
            nama = "Asus A402Z i5 12500H";
            harga = 12999000;
        }else if (pilihan == 3){
            nama = "Asus a142ZA-IPS752 i7 1260P";
            harga = 13799000;
        }if (nama == null){
            System.out.println("maaf pilihan anda tidak ada di daftar");
             
        }else {
            System.out.print("jumlah unit \t\t: ");
            unit = input.nextInt();
            System.out.println("******************");
            System.out.println("laptop dipesan \t\t: "+nama);
            System.out.println(nama + " : Rp."+ harga+"/unit");
            harga = harga * unit;
            System.out.println("total dibayar \t\t: Rp."+harga);
        }
        
    }
    
}
