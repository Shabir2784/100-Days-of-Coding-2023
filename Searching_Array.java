package searching_array;
import java.util.Scanner;

public class Searching_Array {
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        int [] a = {1,2,3,4,5,5};
        int cari, _count = 0;
        Scanner input = new Scanner (System.in);
        System.out.print("data : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
        System.out.print("cari : ");
        cari = input.nextInt();
        System.out.println("===============");
        System.out.println("hasil cari : ");
        for (int i = 0; i < a.length; i++) {
            if (cari==a[i]){
                System.out.println("index-"+i);
               _count++; 
            }
            //if (_count == 0){
            //    System.out.println("hasil tidak ada");
           // }
            
            
        }
        if (_count == 0){
                System.out.println("hasil tidak ada");
        
        }
       
    }
    
}
