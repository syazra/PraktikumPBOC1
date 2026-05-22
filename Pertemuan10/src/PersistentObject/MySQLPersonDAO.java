/* Nama File  : MySQLPersonDAO.java */
/* Deskripsi  : implementasi PersonDAO untuk MySQL */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package PersistentObject;
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo", "root", "AzPq9#wK1p1o(2umN"
        );
        String query = "INSERT INTO person(name) VALUES ('"+ name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
