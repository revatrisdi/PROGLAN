import java.util.*;
//Syntax error kurang titik koma
public class Main {
    public static void main(String[] args) {
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka");
// {string} sysntax error harusnya <String>
        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
// syntax error kurang titik koma
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }
    // Menghitung jumlah huruf
    public static int calculateTotalLength(List<String> words) {
        int totalLength = 0;
        for (int i = 0; i < words.size(); i++) {
//  logic error operator logika seharusnya < untuk kurang dari
            totalLength += words.get(i).length();
        }
        return totalLength;
    }
    // Menemukan kata terpanjang
    public static String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong atau null");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            }   /*else if (word != null && word.length() <= longestWord.length()){
                longestWord = word;
            }*/
//  Kesalahan logika karena mencari kata terpanjang menggunakan logika ( > ) lebih dari dan bukan kurang dari atau sama dengan
        }
        return longestWord;
    }
    // Mengubah Setiap huruf huruf menjadi kapital
    public static List<String> capitalizeWords(List<String> words) {
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            capitalized.add(word.substring(0).toUpperCase());
// Syntax error dikarenakan logika array harus dari 0 bukan diawali dengan 1
        }
        return capitalized;
    }
    // Menghitung panjang kata
    public static List<Integer> wordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            if (word != null) {
// Operator logika salah harus karena ( == ) merupakan logikan untuk sama dengan dan bukan untuk tidak sama dengan
                lengths.add(word.length());
            }
        }
        return lengths;
    }
}