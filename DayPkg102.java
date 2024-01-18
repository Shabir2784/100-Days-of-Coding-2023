package daypkg102;
import java.util.Scanner;
public class DayPkg102 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean angka_prima = true;
        int pembagi = 0;
        System.out.print("masukkan angka bulat : ");
        int angka_bulat = input.nextInt();
        // 0 dan 1 bukan bilangan prima
        if (angka_bulat == 0 || angka_bulat == 1) {
            angka_prima = false;
            
        }
        else{
            for (int i = 2; i <= angka_bulat / 2; i++) {
                if (angka_bulat % i == 0) {
                    pembagi = i;
                    angka_prima = false;
                    break;
                }
 
            }
        }
        if (angka_prima) {
            System.out.println(angka_bulat + " adalah angka prima ");
        }
        else{
            System.out.println(angka_bulat + " bukan bilangan prima karena bisa di bagi "+pembagi);
        }
    }
    
}
