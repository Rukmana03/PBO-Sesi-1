public class HitungSegitiga {
    public static void main(String[] args) {
        // Panjang sisi-sisi segitiga
        double sisiA = 5.0;
        double sisiB = 6.0;
        double sisiC = 5.0;

        // Menghitung keliling segitiga
        double keliling = sisiA + sisiB + sisiC;

        // Menghitung setengah keliling
        double setengahKeliling = keliling / 2;

        // Menghitung luas segitiga menggunakan rumus Heron
        double luas = Math.sqrt(setengahKeliling * (setengahKeliling - sisiA) * (setengahKeliling - sisiB) * (setengahKeliling - sisiC));

        // Menampilkan hasil
        System.out.println("Keliling segitiga: " + keliling);
        System.out.println("Luas segitiga: " + luas);
    }
}
