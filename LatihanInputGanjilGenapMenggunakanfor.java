package latihaninputganjilgenapmenggunakanfor;
import java.util.Scanner;
public class LatihanInputGanjilGenapMenggunakanfor {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.print ("masukkan nilai awal :");
        awal = input.nextInt();
        System.out.print("masukkan nilai akhir :");
        akhir = input.nextInt();
        
        for (int a = awal; a <= akhir; a++) {
            int hasil = a % 2;
            if (hasil == 1) {
                System.out.println(a + " ganjil");
            }else {
                System.out.println(a+ " genap");
            }
                  

            
        }
        
    }
    
}
