package mengitungluasdankelilinglingkaran;
import java.util.Scanner;
public class MengitungLuasDanKelilingLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double phi = 3.14;
        double r,luas, keliling;
        System.out.println("menghitung luas lingkaran\n");
        System.out.print("masukkan panjang jari-jari : ");
        r = input.nextDouble();
        luas = 0.5 * phi * r *r;
        keliling = 2 * phi * r;
        
        System.out.println("luas lingkaran : "+ luas );
        System.out.println("keliling lingkaran : "+ keliling);
    }   
}
