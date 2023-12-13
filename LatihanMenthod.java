package latihanmenthod;
import java.util.Scanner;
public class LatihanMenthod {
    public static void operasi(int a, int b){
        int c;
        c = a + b;
        System.out.println(a+" + "+b+" = "+ c);
        c = a - b;
        System.out.println(a+" - "+b+" = "+ c);
        c = a / b;
        System.out.println(a+" : "+b+" = "+ c);
        c = a * b;
        System.out.println(a+" * "+b+" = "+ c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b;
        System.out.print("a : ");
        a = input.nextInt();
        System.out.print("b : ");
        b = input.nextInt();
        System.out.println("output : ");
        operasi (a, b);
        
       
    }
    
}
