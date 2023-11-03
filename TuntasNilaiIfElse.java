package tuntasnilaiifelse;
import java.util.Scanner;
public class TuntasNilaiIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double DDP, PSTI, PAI,Jumlah, RATA, KKM;
        System.out.print("DDP \t: ");
        DDP = input.nextDouble();
        System.out.print("PSTI \t: ");
        PSTI = input.nextDouble();
        System.out.print("PAI \t: ");
        PAI = input.nextDouble();
        KKM = 75;
        Jumlah = DDP + PSTI + PAI;
        RATA = Jumlah / 3;
        System.out.println("Rata - Rata = "+ RATA);
        if (RATA >= KKM){
            System.out.println("Tuntas");
        }else {
            System.out.println("Tidak Tuntas");
        }     
    }
    
}
