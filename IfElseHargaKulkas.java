package ifelsehargakulkas;
import java.util.Scanner;
public class IfElseHargaKulkas {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;
        System.out.println("menu");
        System.out.println( "1. kulkas Sharp\n2. kulkas Aqua\n3. kulkas LG");
        System.out.print("pilih : ");
        String menu = null;
        double  harga = 0,diskon, merk;
        pilihan = input.nextInt();
       
        if (pilihan == 1) {
            menu = "kulkas Sharp";
            harga = 1000000;
            
            
        }else if (pilihan == 2) {
            menu = "kulkas Aqua";
            harga = 2000000;
            
        }else if (pilihan == 3) {
            menu = "kulkas LG";
            harga = 3000000;
        }if(menu == null){
            System.out.println("maaf menu yang anda pilih tidak ada");
        }else
        System.out.print("jumlah merk yang dipesan : ");
        merk = input.nextInt();
        harga = harga * merk;
        System.out.println("menu : "+ menu);
        System.out.println("total yang di bayar :Rp."+harga);
       
    }
    
}
