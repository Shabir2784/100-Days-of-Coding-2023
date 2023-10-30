package dealermotor;
import java.util.Scanner;
public class DealerMotor {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = null;
        int pilihan,harga=0,unit;
        System.out.println("*** daftar motor honda ***");
        System.out.println("1. Beat\n2. Scoopy\n3. Vario\n4. PCX ");
        System.out.print("masukkan pilihan anda : ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            nama = "Beat";
            harga = 18000000;
        }else if (pilihan == 2){
            nama = "Scoopy";
            harga = 22000000;
        }else if (pilihan == 3){
            nama = "Vario";
            harga = 23000000;
        }else if (pilihan == 4){
            nama = "PCX";
            harga = 32000000;
        }if (nama == null){
            System.out.println("maaf pilihan anda sudah habis");
        }else {
            System.out.println(nama+" \t\t: Rp."+harga);
            System.out.print("jumlah unit \t: ");
            unit = input.nextInt();
            harga = harga * unit;
            System.out.println("total dibayar \t: Rp."+harga);
        }
     
    }
    
}
