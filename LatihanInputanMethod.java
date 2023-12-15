package latihaninputanmethod;
import java.util.Scanner;
public class LatihanInputanMethod {
    public static int luasPersegi(int s){
        int luas = s * s;
        return (luas);

    }
    public static int KelilingPersegi(int s){
        int Keliling = 4 * s;
        return (Keliling);

    }
    public static void TluasPersegi(int s){
        System.out.println("L = s x s");
        System.out.println("L = "+s+" x "+ s);
        System.out.println("L = "+luasPersegi(s));
        
    }
    public static void TKelilingPersegi(int s){
        System.out.println("K = 4 x s");
        System.out.println("K =  4 x"+s);
        System.out.println("K = "+KelilingPersegi(s));
        
    }
    public static void main(String[] args) {

        int s;
        Scanner input = new Scanner (System.in);
        
        
        System.out.println(" L dan K Persegi");
        System.out.println("=================");
        System.out.print(" sisi persegi : ");
        s = input.nextInt();
        System.out.println("=================");
        TluasPersegi(s);
        System.out.println("");
        TKelilingPersegi(s);
    }
        

    
    
}
