package pkg100_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai batas : ");
        int batas = input.nextInt();
        for (int i = batas; i >= 1; i--) {
            int hasil = i % 2;
            if (hasil == 1 ) {
            System.out.println(i + " ---> ganjil ");
            } else {
                System.out.print(i + " ---> genap | ");
            }  
        }
    }
    
}
