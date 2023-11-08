package tabungan;
public class Tabungan {

    public static void main(String[] args) {
        String nama_mahasiswa = "shobir";
        int harga_komputer = 55000000;
        int gaji_pokok = 5000000;
        int uang_kost = 750000;
        int tabungan_perbulan = 1500000;
        int lama_waktu = 0;
        
        while (harga_komputer > 0){
            harga_komputer -= tabungan_perbulan;
            lama_waktu++;
        }
        System.out.println("Nama mahasiswa: "+nama_mahasiswa);
        System.out.println("Harga komputer sultan: "+harga_komputer);
        System.out.println("Gaji pokok perbulan: "+gaji_pokok);
        System.out.println("Uang kost perbulan: "+uang_kost);
        System.out.println("Uang tabungan perbulan: "+tabungan_perbulan);
        System.out.println("Lama waktu untuk membeli komputer sultan: "+(lama_waktu)+" bulan");
    } 
}
