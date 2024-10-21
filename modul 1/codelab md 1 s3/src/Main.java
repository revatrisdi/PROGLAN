public class Main {
    public static void main(String[] args) {
        int[] angka = {22, 67, 31, 11, 5};
        int hasil = hitungTotal(angka);
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static int hitungTotal(int[] array) {
        int hasil = 0;


        for (int i = 0; i < array.length; i++) {
            hasil += array[i];
        }

        /*
        for (int i = 1; i < array.length - 1; i++) {
            hasil += array[i];
        }*/

        return hasil;
    }
}
