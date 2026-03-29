/* Nama File  : Tendik.java */
/* Deskripsi  : berisi atribut dan method dalam class Tendik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class Tendik extends Pegawai {
    /*************** ATRIBUT *******************/
    private String bidang;
    private static int counterTendik = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek tendik tanpa parameter
    public Tendik() {
        counterTendik++;
    }

    // konstruktor untuk membuat objek tendik dengan parameter
    public Tendik(String nip, String nama, Tanggal tglLahir, Tanggal tmt,  String bidang, int gajiPokok) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan bidang tendik
    public String getBidang() {
        return bidang;
    }

    /*************** MUTATOR *******************/
    // mengeset bidang tendik dengan nilai baru
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    /*************** METHOD LAIN ***************/
    // mengembalikan tanggal pensiun tendik, yaitu tanggal 1 bulan berikutnya dari tanggal lahir ditambah usia BUP (55 tahun)
    public Tanggal getTanggalPensiun() {
        return new Tanggal(1, tglLahir.getBulan() + 1, tglLahir.getTahun() + 55);
    }

    // mencetak counter tendik
    public void printCounterTendik() {
        System.out.println("Jumlah Objek Tendik: " + counterTendik);
    }

    // mencetak info tendik
    public void printInfo() {
        System.out.println("NIP                   : " + nip);
        System.out.println("Nama                  : " + nama);
        System.out.print("Tanggal Lahir         : ");
        tglLahir.printTanggal();
        System.out.print("TMT                   : ");
        tmt.printTanggal();
        System.out.println("Jabatan               : Tendik");
        System.out.println("Bidang                : " + bidang);
        Tanggal T1 = getMasaKerja();
        System.out.println("Masa Kerja            : " + T1.getTahun() + " tahun " + T1.getBulan() + " bulan " + T1.getHari() + " hari");
        System.out.print("Tanggal Pensiun       : ");
        Tanggal T2 = getTanggalPensiun();
        T2.printTanggal();
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00");
        int tunjangan = (int) (0.01 * T1.getTahun() * gajiPokok);
        System.out.println("Tunjangan             : 1% x " + T1.getTahun() + " x " + "Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00 = " + "Rp " + String.format(new Locale("id","ID"), "%,d", tunjangan) + ",00") ;
    }
}