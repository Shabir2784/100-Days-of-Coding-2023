package search_string;
import java.util.Scanner;
public class Search_String {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [] a = {
            "Nasi",
            "Bakso",
            "Ayam"
        };
        int detect = 0;
        String cari ;
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+". "+a[i]);
            
        }
        System.out.println("============");
        System.out.print("cari : ");
        cari = input.nextLine();
        for (int i = 0; i < a.length; i++) {
            if(cari.equalsIgnoreCase(a[i])){
                System.out.println("nomor : "+(i+1));
                detect++;
            }
            
        }
        if(detect == 0){
            System.out.println("data tidak ada !");
        }
    }
    
}
