package latihanmenghitungluasbelaketupatmnggnkninputan;
import java.util.Scanner;
public class LatihanMenghitungLuasBelaKetupatMnggnknInputan {

    public static void main(String[] args) {
        
 
        Scanner input = new Scanner (System.in);
        Double diagonal_1, diagonal_2,luas;
        System.out.print("masukkan panjang diagonal 1 : ");
        diagonal_1 = input.nextDouble();
        System.out.print("masukkan panjang diagonal 2 : ");
        diagonal_2 = input.nextDouble();
        luas =0.5 * diagonal_1 * diagonal_2;
        System.out.println("luas bela Ketupat : "+luas);
    }
    
}
