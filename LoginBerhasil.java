package loginberhasil;

import java.util.Scanner;

public class LoginBerhasil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan username : ");
        String username = input.nextLine();
        System.out.print("masukkan password : ");
        int password = input.nextInt();
        
        if (username.equals("shobir")&& password == 27) {
            System.out.println("login berhasil");    
        }else{
            System.out.println("login gagal");
        }

    }
    
}
