package latihanmenghitungluaspersegipanjangmenggnkninputan;
import java.util.Scanner;
public class LatihanMenghitungLuasPersegiPanjangMenggnknInputan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang, lebar, luas;
        System.out.print("masukkan panjang persegi : ");
        panjang = input.nextInt();
        System.out.print("masukkan lebar persegi : ");
        lebar = input.nextInt();
        luas = panjang * lebar;
//        luas = Math.round(luas*100)/100;
        System.out.println("luas persegi panjang : "+luas);
        
    }
    
}
