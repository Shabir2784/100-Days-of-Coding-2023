package zodiak;
import java.util.Scanner;

public class Zodiak {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan tanggal lahir \t: ");
        int tanggal = input.nextInt();
        
        System.out.print("masukkan bulan lahir \t: ");
        int bulan = input.nextInt();
        
        if (tanggal > 31 || bulan > 12){
            System.out.println("tanggal & bulan tidak diketahui >>>selamat dapat bakso bonusnya mie ayam<<<");
        }else {
            if (tanggal > 21 && bulan == 12 || tanggal < 20 && bulan == 1){
                System.out.println("Cspricorn");
            }else if (tanggal > 19 && bulan == 1 || tanggal < 19 && bulan == 2){
                System.out.println("Aquarius");
            }else if (tanggal > 20 && bulan == 2 || tanggal < 21 && bulan == 3){
                System.out.println("Pisces");
            }else if (tanggal > 20 && bulan == 3 || tanggal < 20 && bulan == 4){
                System.out.println("Aries");
            }else if (tanggal > 19 && bulan == 4 || tanggal < 21 && bulan == 5){
                System.out.println("Taurus");
            }else if (tanggal > 22 && bulan == 5 || tanggal < 21 && bulan == 6){
                System.out.println("Gemini");
            }else if (tanggal > 20 && bulan == 6 || tanggal < 23 && bulan == 7){
                System.out.println("Cancer");
            }else if (tanggal > 21 && bulan == 7 || tanggal < 23 && bulan == 8){
                System.out.println("Leo");
            }else if (tanggal > 22 && bulan == 8 || tanggal < 23 && bulan == 9){
                System.out.println("Virgo");
            }else if (tanggal > 22 && bulan == 9 || tanggal < 23 && bulan == 10){
                System.out.println("Libra");
            }else if (tanggal > 23 && bulan == 10 || tanggal < 22 && bulan == 11){
                System.out.println("Scorpio");
            }else if (tanggal > 21 && bulan == 11 || tanggal < 22 && bulan == 12){
                System.out.println("Sagitarus");
            }  
        }
      
    }
    
}
