/* Nama File  : Pegawai.java */
/* Deskripsi  : berisi atribut dan method dalam class Pegawai */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class Pegawai {
    /*************** ATRIBUT *******************/
    protected String nip;
    protected String nama;
    protected Tanggal tglLahir;
    protected Tanggal tmt;
    protected int gajiPokok;
    private static int counterPegawai = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek pegawai tanpa parameter
    public Pegawai() {
        counterPegawai++;
    }

    // konstruktor untuk membuat objek pegawai dengan parameter
    public Pegawai(String nip, String nama, Tanggal tglLahir, Tanggal tmt, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nip pegawai
    public String getNIP() {
        return nip;
    }

    // mengembalikan nama pegawai
    public String getNama() {
        return nama;
    }

    // mengembalikan tanggal lahir pegawai
    public Tanggal getTglLahir() {
        return tglLahir;
    }

    // mengembalikan tmt pegawai
    public Tanggal getTMT() {
        return tmt;
    }
    
    // mengembalikan gaji pokok pegawai
    public int getGajiPokok() {
        return gajiPokok;
    }

    /*************** MUTATOR *******************/
    // mengeset nip pegawai dengan nilai baru
    public void setNIP(String nip) {
        this.nip = nip;
    }

    // mengeset nama pegawai dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset tanggal lahir pegawai dengan nilai baru
    public void setTglLahir(Tanggal tglLahir) {
        this.tglLahir = tglLahir;
    }

    // mengeset tmt pegawai dengan nilai baru
    public void setTMT(Tanggal tmt) {
        this.tmt = tmt;
    }
    
    // mengeset gaji pokok pegawai dengan nilai baru
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /*************** METHOD LAIN ***************/
    // mengembalikan masa kerja pegawai
    public Tanggal getMasaKerja() {
        Tanggal T = new Tanggal(12, 3, 2026);
        int d = T.getHari() - tmt.getHari();
        int m = T.getBulan() - tmt.getBulan();
        int y = T.getTahun() - tmt.getTahun();
        if (d < 0) {
            d += 30;
            m--;
        }
        if (m < 0) {
            m += 12;
            y--;
        }
        return new Tanggal(d, m, y);
    }

    // mencetak counter pegawai
    public void printCounterPegawai() {
        System.out.println("Jumlah Objek Pegawai: " + counterPegawai);
    }

    // mencetak info pegawai
    public void printInfo() {
        System.out.println("NIP                   : " + nip);
        System.out.println("Nama                  : " + nama);
        System.out.print("Tanggal Lahir         : ");
        tglLahir.printTanggal();
        System.out.print("TMT                   : ");
        tmt.printTanggal();
        Tanggal T = getMasaKerja();
        System.out.println("Masa Kerja            : " + T.getTahun() + " tahun " + T.getBulan() + " bulan " + T.getHari() + " hari");
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00");
    }
}