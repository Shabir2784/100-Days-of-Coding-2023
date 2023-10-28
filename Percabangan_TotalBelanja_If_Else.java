package percabangan_totalbelanja_if_else;
import java.util.Scanner;
public class Percabangan_TotalBelanja_If_Else {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan total belanjaan anda : ");
        int total_belanja = input.nextInt();
        System.out.println("total belanjaan = Rp."+total_belanja);
        if(total_belanja >= 1000000){
           System.out.println("dapat diskon 20%");
           int diskon = 20 * total_belanja / 100;
           total_belanja -= diskon;
        }else if(total_belanja >=500000 ){
            System.out.println("dapat diskon 10%");
            int diskon = 10 * total_belanja / 100;
            total_belanja -= diskon;
        }else if(total_belanja >=100000){
            System.out.println("dapat diskon 5%");
            int diskon = 5 * total_belanja / 100;
            total_belanja -= diskon;
        }else {
            System.out.println("tidak dapat diskon");
        }
        System.out.println("total bayar = Rp"+total_belanja);
       
    }
    
}
