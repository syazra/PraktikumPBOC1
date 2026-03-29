/* Nama File  : DosenTamu.java */
/* Deskripsi  : berisi atribut dan method dalam class DosenTamu */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class DosenTamu extends Dosen {
    /*************** ATRIBUT *******************/
    private String nidk;
    private Tanggal tglAkhirKontrak;
    private static int counterDosenTamu = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek dosen tamu tanpa parameter
    public DosenTamu() {
        counterDosenTamu++;
    }

    // konstruktor untuk membuat objek dosen tamu dengan parameter
    public DosenTamu(String nip, String nidk, String nama, Tanggal tglLahir, Tanggal tmt, String fakultas, Tanggal tglAkhirKontrak, int gajiPokok) {
        super(nip, nama, tglLahir, tmt, fakultas, gajiPokok);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
        counterDosenTamu++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nidk dosen tamu
    public String getNIDK() {
        return nidk;
    }

    // mengembalikan tanggal akhir kontrak dosen tamu
    public Tanggal getTanggalAkhirKontrak() {
        return tglAkhirKontrak;
    }

    /*************** MUTATOR *******************/
    // mengeset nidn dosen tamu dengan nilai baru
    public void setNIDK(String nidk) {
        this.nidk = nidk;
    }

    // mengeset tanggal akhir kontrak dosen tamu dengan nilai baru
    public void setTanggalAkhirKontrak(Tanggal tglAkhirKontrak) {
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    /*************** METHOD LAIN ***************/
    // mengembalikan masa kerja dosen tamu
    @Override
    public Tanggal getMasaKerja() {
        int d = tglAkhirKontrak.getHari() - tmt.getHari();
        int m = tglAkhirKontrak.getBulan() - tmt.getBulan();
        int y = tglAkhirKontrak.getTahun() - tmt.getTahun();
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

    // mencetak counter dosen tamu
    public void printCounterDosenTamu() {
        System.out.println("Jumlah Objek Dosen Tamu: " + counterDosenTamu);
    }

    // mencetak info dosen tamu
    @Override
    public final void printInfo() {
        System.out.println("NIP                   : " + nip);
        System.out.println("NIDK                  : " + nidk);
        System.out.println("Nama                  : " + nama);
        System.out.print("Tanggal Lahir         : ");
        tglLahir.printTanggal();
        System.out.print("TMT                   : ");
        tmt.printTanggal();
        System.out.println("Jabatan               : Dosen Tamu");
        System.out.println("Fakultas              : " + fakultas);
        Tanggal T = getMasaKerja();
        System.out.println("Masa Kerja            : " + T.getTahun() + " tahun " + T.getBulan() + " bulan " + T.getHari() + " hari");
        System.out.print("Tanggal Akhir Kontrak : ");
        tglAkhirKontrak.printTanggal();
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00");
        int tunjangan = (int) (0.025 * gajiPokok);
        System.out.println("Tunjangan             : 2,5% x Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00 = " + "Rp " + String.format(new Locale("id","ID"), "%,d", tunjangan) + ",00") ;
    }
}