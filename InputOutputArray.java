package inputoutputarray;
import java.util.Scanner;
public class InputOutputArray {

    public static void main(String[] args) {
        int jumlah_index = 5;
        int a [] = new int[jumlah_index];
        Scanner input = new Scanner (System.in);
        System.out.println("input : ");
        System.out.println("=============");
        for (int i = 0; i < jumlah_index; i++) {
            System.out.print("index-"+i+" : ");
            a[i]=input.nextInt();
            
        }
        System.out.println("=============");
        System.out.println("output : ");
        for (int i = 0; i < jumlah_index; i++) {
            System.out.print(a[i]+" ");
            
            
        }
        System.out.println("");
    }
    
}
