package operatorkondisional_ternay;

import java.util.Scanner;

public class OperatorKondisional_Ternay {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int nilai = input.nextInt();
        int kkm = 75;
        String hasil = nilai >= kkm?"tuntas":"tidak tuntas";
        System.out.println("nilai shobir : "+ nilai);
        System.out.println("shobir dinyatakan "+ hasil);
       
    }
    
}
