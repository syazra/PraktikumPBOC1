/* Nama File  : Program.java */
/* Deskripsi  : main program untuk akses mahasiswa */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MySQLMahasiswaService;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static MySQLMahasiswaService service = new MySQLMahasiswaService();
    
    public static void main(String[] args) throws Exception {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println("");
        
        // insert
        System.out.println("=== insert");
        Mahasiswa mhsAdd1 = new Mahasiswa(5, "Eric");
        service.add(mhsAdd1);
        System.out.println("berhasil insert : " + mhsAdd1);
        Mahasiswa mhsAdd2 = new Mahasiswa(6, "Jacob");
        service.add(mhsAdd2);
        System.out.println("berhasil insert : " + mhsAdd2);
        displayAll();
        
        // update 
        System.out.println("=== update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("akan di-update data lama : " + mhsUpdate);
        mhsUpdate.setNama("Juyeon");
        System.out.println("dengan data baru : " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // delete
        System.out.println("=== delete");
        System.out.println("akan di-delete : " + service.getById(5));
        service.delete(5);
        System.out.println("akan di-delete : " + service.getById(6));
        service.delete(6);
        displayAll();
    }
    
    public static void displayAll() throws Exception {
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
        System.out.println("");
    }
}
