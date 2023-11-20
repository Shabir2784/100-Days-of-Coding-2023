package inputnama.alamatdowhile;
import java.util.Scanner;
public class InputNamaAlamatDoWhile {

    public static void main(String[] args) {
        ///Scanner input = new Scanner (System.in);
        String nama,alamat, loop;
        do{
            Scanner input = new Scanner (System.in);
            System.out.print("nama \t: ");
            nama = input.nextLine();
            System.out.print("alamat \t: ");
            alamat = input.nextLine();
            System.out.print(nama + " tinggal di "+alamat);
            System.out.print("\nulang(Y/N) : ");
            loop = input.next();
            
        }while(loop.equalsIgnoreCase("Y"));
        System.out.println("program selesai");
      
    }
    
}
