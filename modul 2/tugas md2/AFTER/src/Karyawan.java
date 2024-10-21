

// Kelas untuk menghitung gaji karyawan setelah refactor
public class Karyawan implements Gaji {
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

    @Override
    public double hitungGajiBersih() {
        return gajiPokok + tunjangan - potongan;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + hitungGajiBersih());
    }
}
