package biodata;

import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Nama, Alamat, Universitas, Fakultas, Jurusan, Kelas;
        Nama = "Shabir";
        Alamat = "Polewali";
        Universitas = "Universitas sulawesi barat";
        Fakultas = "Teknik";
        Jurusan = "Informatika";
        Kelas = "Kelas";
        int Umur = 19;
        short Tinggi_badan = 170; 
        float Berat_badan = 60.6f;

        System.out.println("\nNama \t\t: " + Nama);
        System.out.println("\nAlamat \t\t: " + Alamat);
        System.out.println("\nUniveritas \t: " + Universitas);
        System.out.println("\nFakultas \t: " + Fakultas);
        System.out.println("\nJurusan \t: " + Jurusan);
        System.out.println("\nKelas \t\t: " + Kelas + " A ");
        System.out.println("\nUmur \t\t: " + Umur + " Tahun ");
        System.out.println("\nTinggi badan \t: " + Tinggi_badan + " Cm ");
        System.out.println("\nBerat badan \t: " + Berat_badan + " Kg ");
         
    
    }
    
}
