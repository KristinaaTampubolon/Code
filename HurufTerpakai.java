import java.util.Scanner;

public class HurufTerpakai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int[] frekuensi = new int[26]; // Array untuk menghitung frekuensi huruf (a sampai z)
        int totalJumlahHuruf = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = Character.toLowerCase(kalimat.charAt(i));
            if (Character.isLetter(huruf)) {
                int indeks = huruf - 'a';
                frekuensi[indeks]++;
                totalJumlahHuruf++;
            }
        }

        System.out.println("Hasil:");
        System.out.println("Huruf\tJumlah");
        for (char huruf = 'a'; huruf <= 'z'; huruf++) {
            int indeks = huruf - 'a';
            int jumlah = frekuensi[indeks];

            if (jumlah > 0) {
                System.out.println(huruf + "\t" + jumlah);
            }
        }

        System.out.println("\nJumlah huruf yang terpakai: " + totalJumlahHuruf);

        input.close();
    }
}
