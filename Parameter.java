package parameter;
import java.util.Scanner;
public class Parameter {
    public static void mahasiswa(String nama, int umur){
        System.out.println(nama+" berumur "+umur+" thn");
    }

    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner input = new Scanner (System.in);
        System.out.print("nama : ");
        nama = input.nextLine();
        System.out.print("umur : ");
        umur = input.nextInt();
        System.out.println("output : ");
        mahasiswa(nama, umur);
        
    }
    
}
