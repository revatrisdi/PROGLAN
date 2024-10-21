// Kelas untuk menghitung gaji karyawan tanpa refactor
public class Karyawan {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;

    public Karyawan(String nama, double gajiPokok, double tunjangan, double potongan) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
    }

    public double hitungGajiBersih() {
        return gajiPokok + tunjangan - potongan;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + hitungGajiBersih());
    }
}

// Main program untuk menghitung gaji karyawan
public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("Budi", 5000000, 1000000, 500000);
        karyawan.tampilkanInformasi();
    }
}
