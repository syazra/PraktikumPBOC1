/* Nama File  : Manusia.java */
/* Deskripsi  : berisi atribut dan method dalam class Manusia */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

import java.time.LocalDate;
import java.util.Locale;

public abstract class Manusia {
    /*************** ATRIBUT *******************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek manusia tanpa parameter
    protected Manusia() {
        counterMns++;
    }

    // konstruktor untuk membuat objek manusia dengan parameter
    protected Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nama manusia
    public String getNama() {
        return nama;
    }

    // mengembalikan tanggal mulai kerja manusia
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    // mengembalikan alamat manusia
    public String getAlamat() {
        return alamat;
    }

    // mengembalikan pendapatan manusia
    public double getPendapatan() {
        return pendapatan;
    }

    // mengembalikan counter manusia
    public static int getCounterMns() {
        return counterMns;
    }

    /*************** MUTATOR *******************/
    // mengeset nama manusia dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset tanggal mulai kerja manusia dengan nilai baru
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    // mengeset alamat manusia dengan nilai baru
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // mengeset pendapatan manusia dengan nilai baru
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /*************** METHOD LAIN ***************/
    // mencetak info manusia
    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : Rp " + String.format(new Locale("id","ID"), "%,.0f", pendapatan) + ",00");
    }

    // abstract method untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}