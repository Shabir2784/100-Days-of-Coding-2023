package latihanprgm;

public class LatihanPrgm {
    public static int luasPersegi(int s){
        int luas = s * s;
        return (luas);
        
    }
    public static int KelilingPersegi(int s){
        int Keliling = 4 * s;
        return (Keliling);
        
    }
    public static void main(String[] args) {
        
        int s;
        s = 10;
        System.out.println("L = "+ luasPersegi(s));
        System.out.println("K = "+ KelilingPersegi(s));
        
      
    }
    
}

