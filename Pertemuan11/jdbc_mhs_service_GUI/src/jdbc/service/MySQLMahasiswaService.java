/* Nama File  : MySQLMahasiswaService.java */
/* Deskripsi  : service atau controller bagi program utama */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package jdbc.service;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MySQLUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLMahasiswaService {
    Connection koneksi = null;
    
    public MySQLMahasiswaService() {
        koneksi = MySQLUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa mhs) throws Exception {
        String query = "INSERT INTO mahasiswa(id, nama) VALUES ("
                + mhs.getId() + ", '" + mhs.getNama() + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs) throws Exception {
        String query = "UPDATE mahasiswa SET nama = '"
                + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa getById(int id) throws Exception {
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                return mhs;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Mahasiswa> getAll() throws Exception {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
            return listMhs;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty() {
        String query = "SELECT COUNT(*) AS jumlah FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()) {
                return rs.getInt("jumlah") == 0;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public void closeConnection() {
        try {
            if(koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
