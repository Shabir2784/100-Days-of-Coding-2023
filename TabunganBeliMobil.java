package tabunganbelimobil;

public class TabunganBeliMobil {

    public static void main(String[] args) {
        String nama_mahasiswa = "shobir";
        int harga_mobil = 340000000;
        int penghasilan = 5000000;
        int uang_kost = 450000;
        int tabungan_perbulan = 3000000;
        int lama_waktu = 0;
        
        while (harga_mobil > 0){
            harga_mobil -= tabungan_perbulan;
            lama_waktu++;
        }
        System.out.println("Nama mahasiswa: "+nama_mahasiswa);
        System.out.println("Harga mobil: "+harga_mobil);
        System.out.println("penghasilan perbulan: "+penghasilan);
        System.out.println("Uang kost perbulan: "+uang_kost);
        System.out.println("Uang tabungan perbulan: "+tabungan_perbulan);
        System.out.println("Lama waktu untuk membeli mobil: "+(lama_waktu)+" bulan");
      
    }
    
    
}
