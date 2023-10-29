package hargamenumakanan;
import java.util.Scanner;

public class HargaMenuMakanan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String menu = null;      
        int pilihan, harga=0, porsi;
        System.out.println("-----menu makanan-----"); 
        System.out.println("1. bakso\n2. mie ayam\n3. nasi kuning");
        System.out.print("masukkan pilihan anda \t: ");
        pilihan = input.nextInt();
        if( pilihan == 1){
            menu = "bakso urat";
            harga = 10000;
        }else if(pilihan == 2){
            menu = "mie ayam";
            harga = 12000;
        }else if(pilihan == 3){
            menu = "nasi kuning";
            harga = 7000;
        }if(menu == null){
            System.out.println("pilihan anda salah");
        }else{
            System.out.print("jumlah porsi \t\t: ");
            porsi = input.nextInt();
            System.out.println("=========================");
            System.out.println("menu dipesan \t: ");
            System.out.println(menu+" \t: Rp."+harga+"/porsi");
            harga = harga * porsi;
            System.out.println( "total dibayar \t: Rp."+harga);
        }
            
    }
    
}
