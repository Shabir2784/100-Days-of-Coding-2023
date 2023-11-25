package menghitungratarata;
import java.util.Scanner;
public class MenghitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int nilai_N;
        double nilai, total=0,rata;
        System.out.print("\nmasukkan nilai N : ");
        nilai_N = input.nextInt();
        for (int i = 1; i <= nilai_N; i++) {
            System.out.print("nilai ke-"+i+" : ");
            nilai = input.nextInt();
            total +=nilai;
           
        }
        rata = total / nilai_N;
        
        System.out.println("total : "+total);
        System.out.println("rata-rata : "+rata);
       
    }
    
}
