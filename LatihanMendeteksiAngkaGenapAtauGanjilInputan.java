package latihanmendeteksiangkagenapatauganjilinputan;
import java.util.Scanner;
public class LatihanMendeteksiAngkaGenapAtauGanjilInputan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("angka genap");
            
        }else {
            System.out.println("angka ganjil");
        }
        
    }
    
}
