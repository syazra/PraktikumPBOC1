/* Nama File  : Date.java */
/* Deskripsi  : berisi atribut dan method dalam class Date */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

public class Tanggal {
    /*************** ATRIBUT *******************/
    private int hari;
    private int bulan;
    private int tahun;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek tanggal tanpa parameter
    public Tanggal() {
    }

    // konstruktor untuk membuat objek tanggal dengan parameter
    public Tanggal(int d, int m, int y) {
        hari = d;
        bulan = m;
        tahun = y;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan hari pada tanggal
    public int getHari() {
        return hari;
    }

    //mengembalikan bulan pada tanggal
    public int getBulan() {
        return bulan;
    }

    // mengembalikan tahun pada tanggal
    public int getTahun() {
        return tahun;
    }

    /*************** MUTATOR *******************/
    // mengeset hari dengan nilai baru
    public void setHari(int d) {
        hari = d;
    }

    // mengeset bulan dengan nilai baru
    public void setBulan(int m) {
        bulan = m;
    }

    // mengeset tahun dengan nilai baru
    public void setTahun(int y) {
        tahun = y;
    }

    /*************** METHOD LAIN ***************/
    // mencetak tanggal
    public void printTanggal() {
        String[] temp = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.println(hari + " " + temp[bulan - 1] + " " + tahun);
    }
}