package latihainputtipedatadanvariabel;
import java.util.Scanner;

public class LatihaInputTipeDataDanVariabel {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        System.out.print("nama : ");
        nama = input.nextLine();
        
        int umur;
        System.out.print("umur : ");
        umur = input.nextInt();
        
        char nilai;
        System.out.print("nilai : ");
        nilai = input.next().charAt(0);
        
        float tinggi ;
        System.out.print("tinggi : ");
        tinggi = input.nextFloat();
        
        byte nomor_urut;
        System.out.print("nomor urut : ");
        nomor_urut = input.nextByte();
        
        short Anak_ke;
        System.out.print("anak ke : ");
        Anak_ke = input.nextShort();
        
        double berat_badan;
        System.out.print("berat_badan : ");
        berat_badan = input.nextDouble();
        
        long angka;
        System.out.print("angka : ");
        angka = input.nextLong();
        
        
    }
    
}
