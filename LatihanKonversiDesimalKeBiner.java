package latihankonversidesimalkebiner;
import java.util.Scanner;
public class LatihanKonversiDesimalKeBiner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] arr = new int[32];
        int desimal, i;
        System.out.print("masukkan angka desimal : ");
        desimal = input.nextInt();
        
        for ( i = 0; desimal>0; i++) {
            arr[i] = desimal%2;
            desimal = desimal/2;
            
        }
        
        System.out.print("angka biner adalah : ");
        for ( i = i - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        System.out.println("");
        
    }
    
}
