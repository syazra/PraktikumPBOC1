/* Nama File  : Pengusaha.java */
/* Deskripsi  : berisi atribut dan method dalam class Pengusaha */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /*************** ATRIBUT *******************/
    private String npwp;
    private static int counterPengusaha = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek pengusaha tanpa parameter
    public Pengusaha() {
        counterPengusaha++;
    }

    // konstruktor untuk membuat objek pengusaha dengan parameter
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan npwp pengusaha
    public String getNpwp() {
        return npwp;
    }

    // mengembalikan counter pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /*************** MUTATOR *******************/
    // mengeset npwp pengusaha dengan nilai baru
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /*************** METHOD LAIN ***************/
    // menghitung masa kerja pengusaha
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period p = Period.between(tglMulaiKerja, now);
        return p.getYears() + 8;
    }

    // menghitung pajak pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // mencetak info pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                : " + tglMulaiKerja);
    }
}
