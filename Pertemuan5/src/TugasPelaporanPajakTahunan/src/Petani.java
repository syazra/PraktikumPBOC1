/* Nama File  : Petani.java */
/* Deskripsi  : berisi atribut dan method dalam class Petani */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /*************** ATRIBUT *******************/
    private String asalKota;
    private static int counterPetani = 0;

    /*************** KONSTRUKTOR ***************/
        // konstruktor untuk membuat objek petani tanpa parameter
    public Petani() {
        counterPetani++;
    }

        // konstruktor untuk membuat objek petani dengan parameter
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan asal kota petani
    public String getAsalKota() {
        return asalKota;
    }

    // mengembalikan counter petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    /*************** MUTATOR *******************/
    // mengeset asal kota petani dengan nilai baru
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }


    /*************** METHOD LAIN ***************/
    // menghitung masa kerja petani
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period p = Period.between(tglMulaiKerja, now);
        return p.getYears() + 0;
    }

    // menghitung pajak petani
    @Override
    public double hitungPajak() {
        return 0;
    }

    // mencetak info petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + tglMulaiKerja);
    }
}
