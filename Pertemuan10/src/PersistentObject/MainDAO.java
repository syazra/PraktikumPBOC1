/* Nama File  : MainDAO.java */
/* Deskripsi  : main program untuk akses DAO */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package PersistentObject;

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Azka");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
