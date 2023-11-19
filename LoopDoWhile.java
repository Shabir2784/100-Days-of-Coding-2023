package loopdowhile;
import java.util.Scanner;
public class LoopDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.print("masukkan angka awal : ");
        awal = input.nextInt();
        System.out.print("masukkan angka akhir : ");
        akhir = input.nextInt();
        
        int a = awal;
        
        do{
           // a++;
            int hasil = a % 2;
            if (hasil == 0) {
                System.out.println(a + " genap  " );
            }else {  
                System.out.print(a + " ganjil\t");
            }
            a++;
        }
        while ( a <= akhir);
        System.out.println("");
        
    }
    
}
