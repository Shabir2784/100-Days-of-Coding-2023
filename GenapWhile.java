package genapwhile;
import java.util.Scanner;
public class GenapWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.println("***bilangan genap***");
        System.out.print("nilai awal : ");
        awal = input.nextInt();
        System.out.print("nilai akhir : ");
        akhir = input.nextInt();
        
        int a = awal;
        while (a <= akhir){
            //a++;
            int hasil = a % 2;
            if (hasil == 0){
               
                System.out.print(a+" ");
                
            }
            a++;
        }
        System.out.println("");
       
    }
    
    
    
}
