package latihanmenghitungluaslingkaranmnggnkninputan;
import java.util.Scanner;
public class LatihanMenghitungLuasLingkaranMnggnknInputan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double r, luas;
        System.out.print("masukkan jari-jari lingkaran : ");
        r = input.nextDouble();
        luas = 3.14 * r * r;
        System.out.println("luas lingkaran : "+luas);
    }
    
}
