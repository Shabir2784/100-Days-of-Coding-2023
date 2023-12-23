package pertukurangnilai;
public class PertukurangNilai {
    public static void main(String[] args) {
        int awal, nilai_1, nilai_2, nilai_3;
        nilai_1 = 1;
        nilai_2 = 5;
        nilai_3 = 10;
        System.out.println("***sebelum pertukrang nilai***");
        System.out.println("nilai 1 : "+nilai_1);
        System.out.println("nilai 2 : "+nilai_2);
        System.out.println("nilai 3 : "+nilai_3);
        
        awal = nilai_1;
        nilai_1 = nilai_2;
        nilai_2 = nilai_3;
        nilai_3 = awal;
       
        System.out.println("===============================");
        System.out.println("***setelah pertukarang nilai***");
        System.out.println("nilai 1 : "+nilai_1);
        System.out.println("nilai 2 : "+nilai_2);
        System.out.println("nilai 3 : "+nilai_3);
    }
    
}
