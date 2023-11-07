package switchcasemenumakanan;
import java.util.Scanner;
public class SwitchCaseMenuMakanan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan,porsi, harga=0;
        System.out.println("-----menu makanan-----"); 
        System.out.println("1. mie ayam\n2. nasi kuning");
        System.out.print("masukkan pilihan anda \t: ");
        pilihan = input.nextInt();
        System.out.print("berapa porsi : ");
        porsi = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.println("1. mie ayam(10k/porsi)");
                harga = 10000 * porsi;
                break;
            case 2:
                System.out.println("nasi kuning (7k/porsi)");
                harga = 7000 * porsi;
                break;
            default :
                System.out.println("pilihan salah");
                break;
        }
        System.out.println( "total dibayar \t: Rp."+harga);
    }
    
}
