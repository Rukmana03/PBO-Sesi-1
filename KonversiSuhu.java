public class KonversiSuhu {
    public static void main(String[] args) {
        // Suhu dalam Reamur yang sudah ditentukan
        double suhuReamur = 30.0;

        // Menghitung suhu dalam Celcius
        double suhuCelcius = (5.0 / 4.0) * suhuReamur;

        // Menghitung suhu dalam Fahrenheit
        double suhuFahrenheit = (9.0 / 4.0) * suhuReamur + 32;

        // Menghitung suhu dalam Kelvin
        double suhuKelvin = (5.0 / 4.0) * suhuReamur + 273.15;

        // Menampilkan hasil konversi
        System.out.println("Konversi Suhu:");
        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);
    }
}
