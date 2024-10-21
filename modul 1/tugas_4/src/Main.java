import java.util.Scanner;

public class Main {
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }


    public static void main(String[] args) {

        int result = findMax(1, 2, 3);
        System.out.println("Nilai maksimum adalah: " + result);


        result = findMax(-1, -2, -3);
        System.out.println("Nilai maksimum adalah: " + result);

        result = findMax(0, 0, 1);
        System.out.println("Nilai maksimum adalah: " + result);


    }
}