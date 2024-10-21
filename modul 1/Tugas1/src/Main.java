import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> buah = new ArrayList<>();
        buah.add("apel");
        buah.add("pisang");
        buah.add("kiwi");
        buah.add("anggur");
        buah.add("semangka");

        System.out.println("Total karakter: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }

    public static int calculateTotalLength(List<String> words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }

    public static String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }

        String longestWord = words.get(0);
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) {
        List<String> capitalizedWords = new ArrayList<>();
        for (String word : words) {
            capitalizedWords.add(word.toUpperCase());
        }
        return capitalizedWords;
    }

    public static List<Integer> wordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        return lengths;
    }
}