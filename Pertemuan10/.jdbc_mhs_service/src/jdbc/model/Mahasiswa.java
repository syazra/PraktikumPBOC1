/* Nama File  : Mahasiswa.java */
/* Deskripsi  : persistent object yang berperan sebagai model bagi tabel mahasiswa */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package jdbc.model;

public class Mahasiswa {
    private int id;
    private String nama;
    
    public Mahasiswa() {
        nama = "-";
    }
    
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa(id= " + id +", nama= " + nama + ")";
    }
}
