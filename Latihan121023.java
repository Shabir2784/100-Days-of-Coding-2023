package latihan121023;
import java.util.Scanner;

public class Latihan121023 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nama mahasiswa \t: ");
        String nama = input.nextLine();
        System.out.print("masukkan nim mahasiswa \t\t: ");
        String nim = input.nextLine();
        System.out.print("masukkan mata kuliah mahasiswa \t: ");
        String mata_kuliah = input.nextLine();
        System.out.print("masukkan nilai mahasiswa \t: ");
        int nilai = input.nextInt();
        System.out.println("data mahasiswa yang ditampilkan");
        System.out.println("nama mahasiswa : "+nama);
        System.out.println("nim mahasiswa : "+ nim);
        System.out.println("mata kuliah mahasiswa : "+ mata_kuliah);
        
        if (nilai>=80){
            System.out.println("dapat makan gartis");
        }else if (nilai<=80){
            System.out.println("tidak dapat makan gratis");
        }
        
    
        
            
        

    }
    
}
