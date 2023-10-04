import java.util.Scanner;

public class HilangkanTandaBaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan kalimat
        System.out.println("Masukkan kalimat:");
        String kalimat = input.nextLine();

        // Menghilangkan tanda baca dan spasi dengan menggunakan regular expression
        String kalimatTanpaTandaBacaDanSpasi = kalimat.replaceAll("[\\p{Punct}\\s]", "");

        // Tampilkan hasil
        System.out.println("Kalimat tanpa tanda baca dan spasi:");
        System.out.println(kalimatTanpaTandaBacaDanSpasi);

        input.close();
    }
}

