import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        if (isPalindrome(kata)) {
            System.out.println("Kata " + kata + " merupakan palindrome");
        } else {
            System.out.println("Kata " + kata + " bukan merupakan palindrome");
        }

        input.close();
    }

    public static boolean isPalindrome(String kata) {
        kata = kata.toLowerCase().replaceAll("\\s+", ""); // Konversi ke huruf kecil dan hapus spasi

        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

