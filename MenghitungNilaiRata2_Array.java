package menghitungnilairata2_array;

public class MenghitungNilaiRata2_Array {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 9, 10, 11};
        int total = 0;
        double rata;
        int jumlah_index = a.length;
        System.out.print("deret angka : ");
        for (int i = 0; i < jumlah_index; i++) {
            System.out.print(a[i]+", ");
            total += a[i];
        }
        System.out.println("");
        System.out.println("total : "+total);
        rata = total/jumlah_index;
        System.out.println("rata-rata : "+rata);
    }
    
}
