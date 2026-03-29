/* Nama File  : PNS.java */
/* Deskripsi  : berisi atribut dan method dalam class PNS */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /*************** ATRIBUT *******************/
    private String nip;
    private static int counterPNS = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek PNS tanpa parameter
    public PNS() {
        counterPNS++;
    }

    // konstruktor untuk membuat objek PNS dengan parameter
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nip PNS
    public String getNip() {
        return nip;
    }

    // mengembalikan counter PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    /*************** MUTATOR *******************/
    // mengeset nip PNS dengan nilai baru
    public void setNip(String nip) {
        this.nip = nip;
    }

    /*************** METHOD LAIN ***************/
    // menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period p = Period.between(tglMulaiKerja, now);
        return p.getYears() + 8;
    }

    // menghitung pajak PNS
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    // mencetak info PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                 : " + tglMulaiKerja);
    }
}
