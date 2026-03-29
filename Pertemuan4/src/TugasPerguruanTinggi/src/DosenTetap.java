/* Nama File  : DosenTetap.java */
/* Deskripsi  : berisi atribut dan method dalam class DosenTetap */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class DosenTetap extends Dosen {
    /*************** ATRIBUT *******************/
    private String nidn;
    private static int counterDosenTetap = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek dosen tetap tanpa parameter
    public DosenTetap() {
        counterDosenTetap++;
    }

    // konstruktor untuk membuat objek dosen tetap dengan parameter
    public DosenTetap(String nip, String nidn, String nama, Tanggal tglLahir, Tanggal tmt, String fakultas, int gajiPokok) {
        super(nip, nama, tglLahir, tmt, fakultas, gajiPokok);
        this.nidn = nidn;
        counterDosenTetap++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nidn dosen tetap
    public String getNIDN() {
        return nidn;
    }

    /*************** MUTATOR *******************/
    // mengeset nidn dosen tetap dengan nilai baru
    public void setNIDN(String nidn) {
        this.nidn = nidn;
    }

    /*************** METHOD LAIN ***************/
    // mengembalikan tanggal pensiun dosen tetap, yaitu tanggal 1 bulan berikutnya dari tanggal lahir ditambah usia BUP (65 tahun)
    public Tanggal getTanggalPensiun() {
        return new Tanggal(1, tglLahir.getBulan() + 1, tglLahir.getTahun() + 65);
    }

    // mencetak counter dosen tetap
    public void printCounterDosenTetap() {
        System.out.println("Jumlah Objek Dosen Tetap: " + counterDosenTetap);
    }

    // mencetak info dosen tetap
    @Override
    public final void printInfo() {
        System.out.println("NIP                   : " + nip);
        System.out.println("NIDN                  : " + nidn);
        System.out.println("Nama                  : " + nama);
        System.out.print("Tanggal Lahir         : ");
        tglLahir.printTanggal();
        System.out.print("TMT                   : ");
        tmt.printTanggal();
        System.out.println("Jabatan               : Dosen Tetap");
        System.out.println("Fakultas              : " + fakultas);
        Tanggal T1 = getMasaKerja();
        System.out.println("Masa Kerja            : " + T1.getTahun() + " tahun " + T1.getBulan() + " bulan " + T1.getHari() + " hari");
        System.out.print("Tanggal Pensiun       : ");
        Tanggal T2 = getTanggalPensiun();
        T2.printTanggal();
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00");
        int tunjangan = (int) (0.02 * T1.getTahun() * gajiPokok);
        System.out.println("Tunjangan             : 2% x " + T1.getTahun() + " x " + "Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00 = " + "Rp " + String.format(new Locale("id","ID"), "%,d", tunjangan) + ",00") ;
    }
}