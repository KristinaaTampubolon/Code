import java.util.Scanner;

public class SegitigaPascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kedalaman level: ");
        int kedalaman = input.nextInt();

        for (int i = 0; i < kedalaman; i++) {
            // Membuat jarak spasi untuk penataan segitiga
            for (int j = 0; j < kedalaman - i - 1; j++) {
                System.out.print(" ");
            }
            
            int nilai = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(nilai + " ");
                nilai = nilai * (i - j) / (j + 1);
            }
            System.out.println();
        }

        input.close();
    }
}
