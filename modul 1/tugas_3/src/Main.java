import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaRegulerDewasa = 75000;
        int hargaRegulerAnak = 60000;
        int hargaTerusanDewasa = 100000;
        int hargaTerusanAnak = 85000;

        double kenaikanWeekend = 0.20;

        String nama;
        while (true) {
            System.out.print("Masukan nama: ");
            nama = input.nextLine();
            if (!nama.isEmpty()) {
                break;
            } else {
                System.out.println("Data harus diisi!");
            }
        }

        String hari;
        while (true) {
            System.out.print("Masukan hari (contoh: senin, selase, sabtu, minggu): ");
            hari = input.nextLine().toLowerCase();
            if (hari.equals("senin") || hari.equals("selasa") || hari.equals("rabu") || hari.equals("kamis") || hari.equals("jum'at") || hari.equals("sabtu") || hari.equals("minggu")) {
                break;
            } else {
                System.out.println("Data harus diisi!");
            }
        }

        int tanggal;
        while (true) {
            System.out.print("Masukan tanggal (contoh: 1, 2, 3, dst): ");
            if (input.hasNextInt()) {
                tanggal = input.nextInt();
                if (tanggal < 0 || tanggal > 31) {
                    System.out.println("Tanggal harus lebih besar dari 0 dan kurang dari 32");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int jenisTiket;
        while (true) {
            System.out.print("Pilih jenis tiket (1=Reguler, 2=Terusan): ");
            if (input.hasNextInt()) {
                jenisTiket = input.nextInt();
                if (jenisTiket < 1 || jenisTiket > 2) {
                    System.out.println("Pilihan jenis tiket tidak valid!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka :v");
                input.next();
            }
        }

        int jumlahDewasa;
        while (true) {
            System.out.print("Jumlah tiket dewasa: ");
            if (input.hasNextInt()) {
                jumlahDewasa = input.nextInt();
                if (jumlahDewasa < 0) {
                    System.out.println("Jumlah tiket harus lebih besar dari 0!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int jumlahAnak;
        while (true) {
            System.out.print("Jumlah tiket anak-anak: ");
            if (input.hasNextInt()) {
                jumlahAnak = input.nextInt();
                if (jumlahAnak < 0) {
                    System.out.println("Jumlah tiket harus lebih besar dari 0!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int hargaTiket = 0;
        if (jenisTiket == 1) {
            hargaTiket = (hargaRegulerDewasa * jumlahDewasa) + (hargaRegulerAnak * jumlahAnak);
        } else if (jenisTiket == 2) {
            hargaTiket = (hargaTerusanDewasa * jumlahDewasa) + (hargaTerusanAnak * jumlahAnak);
        }

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            hargaTiket += (int) (hargaTiket * kenaikanWeekend);
        }

        System.out.println("\n===== Ringkasan Pembelian Tiket ======");
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jenis Tiket: " + (jenisTiket == 1 ? "Reguler" : "Terusan"));
        System.out.println("Jumlah Tiket Dewasa: " + jumlahDewasa);
        System.out.println("Jumlah Tiket Anak-anak: " + jumlahAnak);
        System.out.println("Total Harga Tiket: Rp" + hargaTiket);

    }
}