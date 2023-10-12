package perulangan;
import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nama mahasiswa \t: ");
        String nama = input.nextLine();
        System.out.print("masukkan nim mahasiswa \t\t: ");
        String nim = input.nextLine();
        System.out.print("masukkan nilai mahasiswa \t: ");
        int nilai = input.nextInt();
        System.out.println("Data mahasiswa yang ditampilkan ");
        System.out.println("nama mahasiswa \t: "+nama);
        System.out.println("nim mahasiswa \t: "+nim);
        
        if (nilai >=90){
            System.out.println("Grade : A");
        }else if (nilai>=80){
            System.out.println("Grade : B");
        }else if (nilai>=70){
            System.out.println("Grade : C");
        }else if (nilai>=60){
            System.out.println("Grade : D");
        }else if (nilai>=50){
            System.out.println("Grade : E");
        }else if (nilai>=40){
            System.out.println("Grade : santui");
        }else if (nilai>=30){
            System.out.println("Grade : masih santui");    
        }else if (nilai>=20){
            System.out.println("Grade : tambah santui");
        }else if (nilai>=10){
            System.out.println("Grade : agak pusing");
        }else if (nilai>=0){
            System.out.println("Grade : pasrah");
        }        
        
        
        
        
    }
    
}
