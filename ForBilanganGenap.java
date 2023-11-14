package forbilangangenap;
import java.util.Scanner;
public class ForBilanganGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.println("***bilagan genap***");
        System.out.print("masukkan nilai awal : ");
        awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        akhir = input.nextInt();
        if (awal < akhir){
            for (int a = awal; a <= akhir; a++) {
                int hasil = a % 2;
                if(hasil == 0){
                    System.out.print(a + " ");
                }               
            }
            System.out.println("");
        }
        else {
            System.out.println("awal > akhir");
        } 
    }
}
