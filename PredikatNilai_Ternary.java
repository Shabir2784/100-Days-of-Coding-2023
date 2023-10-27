package predikatnilai_ternary;
import java.util.Scanner;
public class PredikatNilai_Ternary {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("****************");
        System.out.print("masukkan nilai : ");
        int nilai = input.nextInt();
        String predikat = nilai >= 9? "sangat baik" : nilai >= 7? "baik" : nilai >= 5? "cukup" : "kurang";
        System.out.println(predikat);
       
    }
    
}
