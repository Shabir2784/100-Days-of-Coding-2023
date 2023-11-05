package switchcase;
import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("input (L/P) : ");
        String pilihan = input.nextLine();
        switch (pilihan){
            case "L":
                System.out.println("laki-laki");
                break;
            case "P":
                System.out.println("perempuan");
                break;
            default :
                System.out.println("pilihan salah");
                break;
                
        }
     
    }
       
}
