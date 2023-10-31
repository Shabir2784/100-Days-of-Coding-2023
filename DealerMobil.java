package dealermobil;
import java.util.Scanner;
public class DealerMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = null;
        int pilihan, harga = 0,unit;
        System.out.println("***Daftar Mobil Toyota***");
        System.out.println("1. ALPHARD 2.5 X A/T\n2. FORTUNER 2.4 G 4X2 M/T DSL\n3. INNOVA ZENIX 2.0 G CVT\n3. YARIS 1.5 G CVT\n5. AVANZA 1.3 E M/T");
        System.out.println("=======================================");
        System.out.print("masukkan pilihan mobil anda yang suka : ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            nama = "ALPHARD 2.5 X A/T";
            harga = 1222000000;
        }else if (pilihan == 2){
            nama = "FORTUNER 2.4 G 4X2 M/T DSL";
            harga = 560000000;
        }else if (pilihan == 3){
            nama = " INNOVA ZENIX 2.0 G CVT";
            harga = 450000000;
        }else if (pilihan == 4){
            nama = "YARIS 1.5 G CVT";
            harga = 297000000;
        }else if (pilihan == 5){
            nama = "AVANZA 1.3 E M/T";
            harga = 235000000;
        }if (nama == null){
            System.out.println("maaf pilihan anda tidak ada di daftar");
        }else {
            System.out.println(nama+" : Rp."+harga+"/unit");
            System.out.print("jumlah unit \t: ");
            unit = input.nextInt();            
            System.out.println("total dibayar \t: Rp."+harga*unit);
        }
      
      
    }
    
}
