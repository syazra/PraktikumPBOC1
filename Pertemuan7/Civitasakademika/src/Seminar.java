/* Nama File  : Seminar.java */
/* Deskripsi  : class Seminar */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Seminar {
    /*************** ATRIBUT *******************/
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    /*************** KONSTRUKTOR ***************/
    public Seminar() {
        pesertas = new Civitasakademika[10];
        banyakpeserta = 0;
    }

    /*************** METHOD LAIN ***************/
    public void registrasi(Civitasakademika C) {
        if (banyakpeserta < 10) {
            pesertas[banyakpeserta] = C;
            banyakpeserta++;
        } else {
            System.out.println("Peserta seminar penuh");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}