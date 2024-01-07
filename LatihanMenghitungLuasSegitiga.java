package latihanmenghitungluassegitiga;
import java.util.Scanner;
public class LatihanMenghitungLuasSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double alas, tinggi, luas;
        System.out.print("masukkan alas segitiga : ");
        alas = input.nextDouble();
        System.out.print("masukkan tinggi segitiga : ");
        tinggi = input.nextDouble();
        luas = 0.5*alas * tinggi;
        System.out.println("luas segitiga : "+luas);
       
    }
    
}
