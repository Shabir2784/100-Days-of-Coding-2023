package menghitungnilaimakulumumifelse;
import java.util.Scanner;
public class MenghitungNilaiMakulUmumIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double Fisika, Mtmtk,PKN,PAI,P_Pancasila,Jumlah, RATA, KKM;
        System.out.print("Fisika \t: ");
        Fisika = input.nextDouble();
        System.out.print("Mtmtk \t: ");
        Mtmtk = input.nextDouble();
        System.out.print("PKN \t: ");
        PKN = input.nextDouble();
        System.out.print("PAI \t: ");
        PAI = input.nextDouble();
        System.out.print("P.Pncsl : ");
        P_Pancasila = input.nextDouble();
        KKM = 75;
        Jumlah = Fisika + Mtmtk + PKN + PAI+ P_Pancasila;
        RATA = Jumlah / 5;
        System.out.println("Rata - Rata = "+ RATA);
        if (RATA >= KKM){
            System.out.println("Tuntas");
        }else {
            System.out.println("Tidak Tuntas");
        }     
        
    }
    
}
