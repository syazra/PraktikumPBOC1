/* Nama File  : MataKuliah.java */
/* Deskripsi  : berisi atribut dan method dalam class MataKuliah */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 05/03/2026 - 15.40 */

public class MataKuliah {
    /*************** ATRIBUT *******************/
    private String idMatKul;
    private String nama;
    private int sks;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek matakuliah tanpa parameter
    public MataKuliah() {
        idMatKul = "-";
        nama = "-";
        sks = 0;
    }

    // konstruktor untuk membuat objek matakuliah dengan parameter idMatKul, nama, dan sks
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // mengembalikan nama matakuliah
    public String getNama() {
        return nama;
    }

    // mengembalikan sks matakuliah
    public int getSKS() {
        return sks;
    }

    /*************** MUTATOR *******************/
    // mengeset idMatKul dengan nilai baru
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // mengeset nama matakuliah dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset sks matakuliah dengan nilai baru
    public void setSKS(int sks) {
        this.sks = sks;
    }

    /*************** METHOD LAIN ***************/
    // mencetak idMatKul, nama, dan sks matakuliah ke layar
    public void printMataKuliah() {
        System.out.println("IdMatKul: " + idMatKul);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah SKS: " + sks);
    }
}
