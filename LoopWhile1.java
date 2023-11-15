
package loopwhile1;

import java.util.Scanner;

public class LoopWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal, akhir;
        System.out.print("awal : ");
        awal = input.nextInt();
        System.out.print("akhir : ");
        akhir = input.nextInt();
        int b = awal;
        while (b <= akhir){
            b++;
            System.out.println(b+ " ");
            
        }
    }
    
}
