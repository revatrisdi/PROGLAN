import InfoTiketPesawat.Info;

public class TiketPesawat extends Pemesanan {


    public TiketPesawat(Info info) {
        super(info.nama(), info.asal(), info.tujuan(), info.hargaTiket(), info.diskon());

    }
}

