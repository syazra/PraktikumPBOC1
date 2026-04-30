/* Nama File  : Mahasiswa.java */
/* Deskripsi  : polimorfisme ad hoc overloading */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Mahasiswa {
    /*************** ATRIBUT *******************/
    String NIM;
    String Nama;
    String ProgramStudi;

    /*************** KONSTRUKTOR ***************/
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    public Mahasiswa(Mahasiswa M) {
        this.NIM = M.NIM;
        this.Nama = M.Nama;
        this.ProgramStudi = M.ProgramStudi;
    }

    /*************** SELEKTOR ******************/


    /*************** MUTATOR *******************/
    public void setProgramStudi() {
        ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }

    public void setProgramStudi(Mahasiswa M) {
        this.ProgramStudi = M.ProgramStudi;
    }

    /*************** METHOD LAIN ***************/
    void printInfo() {
        System.out.println("NIM           : " + NIM);
        System.out.println("Nama          : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
    }
}
