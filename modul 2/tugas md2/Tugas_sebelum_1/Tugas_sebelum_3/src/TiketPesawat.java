 public class TiketPesawat extends Tugas.Pemesanan implements Tugas.Tiket {
            private String nama;
            private String asal;
            private String tujuan;
            private double Tiket;
            private double diskon;

            public TiketPesawat(String nama, String asal, String dst, double Tiket, double disk) {
                this.nama = nama;
                this.asal = asal;
                this.tujuan = dst;
                this.Tiket = Tiket;
                this.diskon = disk;
            }

            public double hitungbiayatiket() {
                return Tiket - (Tiket * (diskon / 100));
            }

            public double hitungdiskon() {
                return Tiket * (diskon / 100);
            }

            public void tampilkaninformasi() {
                System.out.println("Nama Penumpang: " + nama);
                System.out.println("Asal: " + asal);
                System.out.println("Tujuan: " + tujuan);
                System.out.println("Harga Tiket: " + Tiket);
                System.out.println("Diskon: " + diskon + "%");
                System.out.println("Biaya Tiket Setelah Diskon: " + hitungbiayatiket());
                System.out.println("Jumlah Diskon: " + hitungdiskon());
            }
        }

