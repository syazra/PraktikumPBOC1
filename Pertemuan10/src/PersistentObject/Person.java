/* Nama File  : Person.java */
/* Deskripsi  : person database model */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package PersistentObject;

public class Person {
    private int id;
    private String name;
    
    public Person(String n) {
        name = n;
    }
    
    public Person(int i, String n) {
        id = i;
        name = n;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
