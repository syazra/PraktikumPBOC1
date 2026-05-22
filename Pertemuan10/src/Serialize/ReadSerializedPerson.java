/* Nama File  : ReadSerializedPerson.java */
/* Deskripsi  : program untuk serialisasi objek Person */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package Serialize;
import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serializes person name = " + person.getName());
        } catch(Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
