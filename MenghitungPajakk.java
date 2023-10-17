package menghitungpajakk;

import java.util.Scanner;

public class MenghitungPajakk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gaji_bersih;
        System.out.print("silahkan input penghasilan : " );
        double penghasilan = input.nextDouble();

        if (penghasilan >= 5000000 ){
            gaji_bersih = penghasilan - (penghasilan * 10/100);
            System.out.println("pajak 10%");
        }else if (penghasilan >= 3000000 && penghasilan <= 5000000){
            gaji_bersih = penghasilan- (penghasilan * 5/100);
            System.out.println("pajak 5%");
        }else if (penghasilan <= 3000000) {
            gaji_bersih = penghasilan;
            System.out.println("pajak 0%");
        }    
    }
    
}
