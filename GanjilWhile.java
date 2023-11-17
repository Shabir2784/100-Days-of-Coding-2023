package ganjilwhile;
import java.util.Scanner;
public class GanjilWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int awal, akhir;
        System.out.println("***bilangan ganjil***");
        System.out.print("awal : ");
        awal = input.nextInt();
        System.out.print("akhir : ");
        akhir = input.nextInt();
        int a = awal;
        while (a <= akhir ){
            int hasil = a % 2;
            if (hasil == 1){
                System.out.print(a + " ");
            }
            a++;
            
        }
        System.out.println("");
       
    }
    
}
