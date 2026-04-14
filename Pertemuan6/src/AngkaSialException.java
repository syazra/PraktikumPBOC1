/* Nama File  : AngkaSialException.java */
/* Deskripsi  : eksepsi buatan sendiri, menolak masukan angka 13! */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 14/04/2026 - 15.40 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan masukkan angka 13 karena angka sial !!!");
    }
}
