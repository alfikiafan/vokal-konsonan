package vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {

    public static void main(String[] args) {
        // deklarasu variabel
        String word;
        int vokal;
        int konsonan;

        // masukan kalimat
        System.out.print("Masukan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        // memanggil prosedur yang mengembalikan nilai int
        vokal = hitung_vokal(word);
        konsonan = hitung_konsonan(word);

        System.out.println("Jumlah huruf vokal: " + vokal);
        System.out.println("Jumlah huruf konsonan: " + konsonan);
    }

    private static int hitung_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'I' || word.charAt(i) == 'U' || word.charAt(i) == 'E' || word.charAt(i) == 'O' ||
                word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int hitung_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'B' || word.charAt(i) == 'C' || word.charAt(i) == 'D' || word.charAt(i) == 'F' || word.charAt(i) == 'G' ||
                word.charAt(i) == 'H' || word.charAt(i) == 'J' || word.charAt(i) == 'K' || word.charAt(i) == 'L' || word.charAt(i) == 'M' ||
                word.charAt(i) == 'N' || word.charAt(i) == 'P' || word.charAt(i) == 'Q' || word.charAt(i) == 'R' || word.charAt(i) == 'S' ||
                word.charAt(i) == 'T' || word.charAt(i) == 'V' || word.charAt(i) == 'W' || word.charAt(i) == 'X' || word.charAt(i) == 'Y' ||
                word.charAt(i) == 'Z' || word.charAt(i) == 'b' || word.charAt(i) == 'c' || word.charAt(i) == 'd' || word.charAt(i) == 'f' ||
                word.charAt(i) == 'g' || word.charAt(i) == 'h' || word.charAt(i) == 'j' || word.charAt(i) == 'k' || word.charAt(i) == 'l' ||
                word.charAt(i) == 'm' || word.charAt(i) == 'n' || word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'r' ||
                word.charAt(i) == 's' || word.charAt(i) == 't' || word.charAt(i) == 'v' || word.charAt(i) == 'w' || word.charAt(i) == 'x' ||
                word.charAt(i) == 'y' || word.charAt(i) == 'z') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}