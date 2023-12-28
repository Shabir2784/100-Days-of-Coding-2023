package lengtharraymultidmensi;

public class LengthArrayMultidmensi {

    public static void main(String[] args) {
        String [][] kontak = {
            {"Khalil", "\t0812"},
            {"Sanjadi", "\t0834"},
            {"Asrul", "\t0856"},
            {"Shobir", "\t0878"}
        };
        for (int i = 0; i < kontak.length; i++) {
            for (int j = 0; j < kontak[i].length; j++) {
                System.out.print(kontak[i][j]);
                
            }
            System.out.println(" ");
        }
    }
    
}
