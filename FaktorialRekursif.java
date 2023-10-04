import java.util.Scanner;

public class FaktorialRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai faktorial: ");
        int nilai = input.nextInt();

        int faktorial = hitungFaktorial(nilai);

        System.out.println("Nilai desimalnya adalah " + faktorial);

        input.close();
    }

    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
