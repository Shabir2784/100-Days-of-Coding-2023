package latihansaja1;
import java.util.Scanner;
public class Latihansaja1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int inputAngka = scanner.nextInt();
        int batas = 5; 
        tampilkanAngka(batas, inputAngka);
    }
    static void tampilkanAngka(int batas, int inputAngka) {
        int[] angkaGanjil = new int[batas];
        int[] angkaGenap = new int[batas];

        if (inputAngka % 2 == 0) {
            for (int i = 0; i < batas; i++) {
                angkaGenap[i] = inputAngka + i * 2;
                angkaGanjil[i] = inputAngka + 1 + i * 2;
                
            }
            
        } else {
            for (int i = 0; i < batas; i++) {
                angkaGanjil[i] = inputAngka + i * 2;
                angkaGenap[i] = inputAngka + 1 + i * 2;
                
            }
            
        }

        System.out.print(batas + " angka ganjil pertama: ");
        for (int angka : angkaGanjil) {
            System.out.print(angka + " ");
            
        }
        System.out.println();
        System.out.print(batas + " angka genap pertama: ");
        for (int angka : angkaGenap) {
            System.out.print(angka + " ");
            
        }
        
    }
    
    
}
