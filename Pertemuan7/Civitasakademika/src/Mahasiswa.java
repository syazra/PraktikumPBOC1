/* Nama File  : Mahasiswa.java */
/* Deskripsi  : class Mahasiswa */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Mahasiswa extends Civitasakademika {
    /*************** ATRIBUT *******************/
    private String NIM;
    private Dosen DosenWali;

    /*************** KONSTRUKTOR ***************/
    public Mahasiswa() {
    }

    public Mahasiswa(String Nama, String NIM, Dosen DosenWali) {
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = DosenWali;
    }

    /*************** SELEKTOR ******************/
    @Override
    public String getNomor() {
        return NIM;
    }

    /*************** MUTATOR *******************/
    public void setWali(Dosen DosenWali) {
        this.DosenWali = DosenWali;
    }

    /*************** METHOD LAIN ***************/
    public void tampilDataMahasiswa() {
        System.out.println("\nNIM        : " + NIM);
        System.out.println("Nama       : " + Nama);
        System.out.println("Dosen Wali : " + DosenWali.getNama());
    }
}  
