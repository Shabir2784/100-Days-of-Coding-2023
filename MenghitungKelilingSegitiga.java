package menghitungkelilingsegitiga;

import java.util.Scanner;

public class MenghitungKelilingSegitiga {
    public static void main(String[] args) {
        System.out.println("menghitung keliling segitiga");
        Scanner input = new Scanner (System.in);
        System.out.print("panjang sisi AB : ");
        int sisi_AB = input.nextInt();
        System.out.print("panjang sisi BC : ");
        int sisi_BC = input.nextInt();
        System.out.print("panjang sisi CA : ");
        int sisi_CA = input.nextInt();
        int keliling = sisi_AB + sisi_BC + sisi_CA;
        
        System.out.println("keliling segitiga : " + keliling );

    }
    
}
