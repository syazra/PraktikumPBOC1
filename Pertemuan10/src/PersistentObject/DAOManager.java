/* Nama File  : DAOManager.java */
/* Deskripsi  : pengelola DAO dalam program */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package PersistentObject;

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
