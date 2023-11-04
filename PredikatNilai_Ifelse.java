package predikatnilai_ifelse;
import java.util.Scanner;
public class PredikatNilai_Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int nilai;
        nilai = input.nextInt();
        String predikat = null;
        
        if (nilai >100){
            predikat = "nilai overload";
        }else if (nilai >=90){
            predikat = "sangat baik";
        }else if (nilai >=80) {
            predikat = "baik";
        }else if (nilai >=70){
            predikat = "cukup";
        }else if (nilai <70){
            predikat = "kurang";
        }
        System.out.println("****************");
        System.out.println("-----output-----");
        System.out.println("****************");
        System.out.println("nilai \t\t: "+nilai);
        System.out.println("predikat \t: "+predikat);
    
    }
    
}
