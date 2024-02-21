import java.util.Calendar;

public class HitungUmur {
    public static void main(String[] args) {
        // Tahun lahir
        int tahunLahir = 2003;

        // Mendapatkan tahun sekarang
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);

        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan hasil
        System.out.println("Umur Anda adalah: " + umur + " tahun.");
    }
}
