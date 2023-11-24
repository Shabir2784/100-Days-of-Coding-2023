package faktorial;
import java.util.Scanner;
public class Faktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka;
        //int hasil;
       // hasil = input.nextInt();
        angka = input.nextInt();
        int hasil = angka;
        System.out.print(angka + "! \t= ");
        for (int i = angka; i > 0 ; i--) {
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
               // hasil = input.nextInt();
               // hasil *= i;
                //System.out.println("hasil \t="+hasil);
            }
            if (angka != i){
               hasil *= i; 
            }
           
          //  hasil *= i;
            
            
        }
        System.out.println("");
        System.out.println("hasil \t= "+hasil);
        
    }
    
}
