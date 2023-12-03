package minmaxpadaarray;
import java.util.Arrays;
import java.util.Collections;
public class MinMaxPadaArray {

    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5};
        int min = Collections.min(Arrays.asList(a));
        int max = Collections.max(Arrays.asList(a));
        System.out.print("Deret angka : ");
        for (int i = 0; i < a.length; i++) {
           // System.out.print("seret angka : ");
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        
    
    }
  
}
