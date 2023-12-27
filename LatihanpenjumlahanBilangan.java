package latihanpenjumlahanbilangan;
import java.util.Scanner;
public class LatihanpenjumlahanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah = 0, batas;
        System.out.print("masukkan batas angka : ");
        batas = input.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            System.out.print(i);
            
            if (i < batas) {
                System.out.print(" + ");
                
                
            }jumlah +=i;
            //System.out.println(" = " +jumlah);
        }
        System.out.println(" = " +jumlah);
    }
    
}
