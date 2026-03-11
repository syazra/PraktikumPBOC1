/* Nama File  : Dosen.java */
/* Deskripsi  : berisi atribut dan method dalam class Dosen */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 05/03/2026 - 15.40 */

public class Dosen {
    /*************** ATRIBUT *******************/
    private String nip;
    private String nama;
    private String prodi;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek dosen tanpa parameter
    public Dosen() {
        nip = "-";
        nama = "-";
        prodi = "-";
    }

    // konstruktor untuk membuat objek dosen dengan parameter nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nip dosen
    public String getNIP() {
        return nip;
    }

    // mengembalikan nama dosen
    public String getNama() {
        return nama;
    }

    // mengembalikan prodi dosen
    public String getProdi() {
        return prodi;
    }

    /*************** MUTATOR *******************/
    // mengeset nip dosen dengan nilai baru
    public void setNIP(String nip) {
        this.nip = nip;
    }

    // mengeset nama dosen dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset prodi dosen dengan nilai baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /*************** METHOD LAIN ***************/
    // mencetak nip, nama, dan prodi dosen ke layar
    public void printDosen() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
