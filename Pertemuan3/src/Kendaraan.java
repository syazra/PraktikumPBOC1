/* Nama File  : Kendaraan.java */
/* Deskripsi  : berisi atribut dan method dalam class Kendaraan */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 05/03/2026 - 15.40 */

public class Kendaraan {
    /*************** ATRIBUT *******************/
    private String noPlat;
    private String jenis;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek kendaraan tanpa parameter
    public Kendaraan() {
        noPlat = "-";
        jenis = "-";
    }

    // konstruktor untuk membuat objek kendaraan dengan parameter noPlat dan jenis
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan noPlat kendaraan
    public String getNoPlat() {
        return noPlat;
    }

    // mengembalikan jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    /*************** MUTATOR *******************/
    // mengeset noPlat kendaraan dengan nilai baru
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // mengeset jenis kendaraan dengan nilai baru
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /*************** METHOD LAIN ***************/
    // mencetak noPlat dan jenis kendaraan ke layar
    public void printKendaraan() {
        System.out.println("NoPlat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }
}
