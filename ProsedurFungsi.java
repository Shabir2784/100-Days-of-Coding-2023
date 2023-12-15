package prosedur.fungsi;

public class ProsedurFungsi {
    public static void mahasiswa(){
        String nama = "aku";
        int umur = 19;
        System.out.println(nama+" - "+umur+ " tahun ");
    }
    public static String mahasiswi(){
        String nama = "kamu";
        int umur = 18;
         
        return nama + " - "+ umur+" tahun " ;
    }

    public static void main(String[] args) {
       mahasiswa();
        System.out.println(mahasiswi());
    }
    
}
