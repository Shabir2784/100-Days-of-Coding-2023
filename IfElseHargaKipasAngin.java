package ifelsehargakipasangin;
import java.util.Scanner;
public class IfElseHargaKipasAngin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan, unit;
        String nama_merk = null;
        double harga = 0, diskon = 0;
        System.out.println("kipas angin");
        System.out.println("1. kipas angin Kosmos\n2. kipas angin Tornado\n3. kipas angin Panasonic");
        System.out.print("pilih : ");
        pilihan = input.nextInt();
        System.out.print("jumlah unit : ");
        unit = input.nextInt();
       // unit = input.nextInt();
        if (pilihan == 1) {
            nama_merk = "kipas angin Kosmos";
            harga = 1000;
            if (unit>=5) {
                diskon =( 10 * harga * unit)/100;
                System.out.println("diskon 10 % - Rp."+diskon);
                
            }
        }else if (pilihan == 2) {
            nama_merk = "kipas angin Tornado";
            harga = 2000;
            if (unit >= 5) {
                diskon = 10 * (harga * unit) / 100;
                System.out.println("diskon 10 % - Rp." + diskon);

            }
            
        }else if (pilihan == 3) {
            nama_merk = "kipas angin Panasonic";
            harga = 3000;
            if (unit >= 3) {
                diskon = (10 * harga * unit) / 100;
                System.out.println("diskon 10 % - Rp." + diskon);

            }
            
        }if (nama_merk == null) {
            System.out.println("maaf merk yang anda pilih tidak ada!");
            
        }else{
           
            System.out.println(nama_merk+" Rp. "+harga+"/unit");
            harga = (harga * unit)- diskon;
           
            System.out.println("total dibayar : "+harga);
        }
    }
    
}
