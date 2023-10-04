import java.util.Scanner;

public class KonversiJamMenitDetik {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih opsi konversi:");
        System.out.println("1. Jam, Menit, Detik ke Detik");
        System.out.println("2. Detik ke Jam, Menit, Detik");
        int opsi = input.nextInt();

        if (opsi == 1) {
            // Konversi dari Jam, Menit, Detik ke Detik
            System.out.print("Masukkan jumlah jam: ");
            int jam = input.nextInt();
            System.out.print("Masukkan jumlah menit: ");
            int menit = input.nextInt();
            System.out.print("Masukkan jumlah detik: ");
            int detik = input.nextInt();

            int totalDetik = (jam * 3600) + (menit * 60) + detik;
            System.out.println("Jumlah detik: " + totalDetik);
        } else if (opsi == 2) {
            // Konversi dari Detik ke Jam, Menit, Detik
            System.out.print("Masukkan jumlah detik: ");
            int detik = input.nextInt();

            int jam = detik / 3600;
            int sisaDetik = detik % 3600;
            int menit = sisaDetik / 60;
            int sisaDetikTerakhir = sisaDetik % 60;

            System.out.println("Jumlah jam: " + jam);
            System.out.println("Jumlah menit: " + menit);
            System.out.println("Jumlah detik: " + sisaDetikTerakhir);
        } else {
            System.out.println("Opsi tidak valid.");
        }

        input.close();
    }
}

