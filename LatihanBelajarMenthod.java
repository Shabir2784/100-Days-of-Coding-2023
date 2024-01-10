package latihanbelajarmenthod;
import java.util.ArrayList;
public class LatihanBelajarMenthod {
    String nama;
    int umur;
    String nim;
    String jurusan;
    void nama() {
        System.out.println("nama :" + nama);
    }
    void umur() {
        System.out.println("umur : " + umur + " tahun");
    }
    void nim() {
        System.out.println("nim : " + nim);
    }
    void jurusan() {
        System.out.println("jurusan : " + jurusan);
    }
    public static void main(String[] args) {
        LatihanBelajarMenthod shobir = new LatihanBelajarMenthod();
        shobir.nama = "shobir";
        shobir.nama();
        shobir.umur = 19;
        shobir.umur();
        shobir.nim = "DD223344";
        shobir.nim();
        shobir.jurusan = "Teknik Informatika";
        shobir.jurusan();

    }
    
}
