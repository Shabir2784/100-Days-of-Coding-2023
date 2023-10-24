
package operatorlogika;

public class OperatorLogika {
 
    public static void main(String[] args) {
       //logika
       /*
       NOT (Tidak) !
       AND (Dan) &&
       OR (Atau) ||
       */
       
       boolean lulus = true;
       boolean a = true;
       boolean b = true;
       boolean c = false;
       
       System.out.println(lulus);
       
       System.out.println(!lulus);//!
       /* dan ( && )
       
       */
       boolean d = a && b;
       System.out.println(d);
       
       boolean e = b && c;
       System.out.println(e);
       /* atau ( || )
       
       */
       boolean f = a || b;
       System.out.println(f);
       
       boolean g = b || c;
       System.out.println(g);
       
    }
    
}
