package ifelsehargatv;
import java.util.Scanner;
public class IfElseHargaTv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, Merk;
        String nama = null;
        double harga = 0, diskon = 0;
        
        
        System.out.println("Merk TV");
        System.out.println("1. TV Sony\n2. TV Panasonic\n3. TV Samasung");
        System.out.print("pilih : ");
        pilihan = input.nextInt();
       
        System.out.print("jumlah merk yang di pilih : ");
        Merk = input.nextInt();
        if (pilihan == 1) {
            nama = "TV Sony";
            harga = 1000000;
            if (Merk >= 4){
                diskon = 10 * (harga * Merk)/100;
                System.out.println("diskon 10% - Rp."+diskon);
            }
        }else if (pilihan == 2) {
            nama = "TV Panasonic";
            harga = 2000000;
            if (Merk>=3) {
                diskon = 10 * (harga * Merk)/100;
                System.out.println("diskon 10% - Rp."+diskon);
            }
                    
                
            
            
        }else if (pilihan == 3) {
            nama = "TV Samsung";
            harga = 3000000;
            if(Merk >= 3){
                diskon = 10 * (harga * Merk )/100;
                System.out.println("diskon 10% - Rp."+diskon);
            }
            
        }if(nama == null){
            System.out.println("maaf merk yang anda pilih tidak ada di daftar!");
        }else{
          
            System.out.println("nama TV terpilih : ");
            System.out.println(nama + " : Rp." + harga+"/Merk");
            harga = (harga * Merk) - diskon;
            System.out.println("total dibayar : Rp." + harga );
        }
        
    
    }
    
    
}
