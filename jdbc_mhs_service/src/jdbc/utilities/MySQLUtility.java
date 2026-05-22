/* Nama File  : MySQLUtility.java */
/* Deskripsi  : mengelola koneksi database MySQL */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package jdbc.utilities;
import java.sql.*;

public class MySQLUtility {
    public static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "AzPq9#wK1p1o(2umN";
                
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("koneksi berhasil");
                }
            } catch(ClassNotFoundException cne) {
                System.out.println("gagal load driver : " + cne.getMessage());
            } catch(SQLException sqle) {
                System.out.println("gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
