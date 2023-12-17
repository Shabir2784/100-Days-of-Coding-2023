package latihaninputanprogram;

import java.util.Scanner;

public class LatihanINputanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        do {
            System.out.print("Masukkan angka: ");
            nilai = input.nextInt();

            if (nilai % 2 == 0) {
                System.out.println("angka genap, program berhenti.");
                break;
            } else {
                System.out.println("angka ganjil, masukkan angka lagi.");
            }
        } while (true);

        
    }
    
}
