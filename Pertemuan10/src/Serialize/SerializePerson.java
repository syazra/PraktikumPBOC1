/* Nama File  : SerializePerson.java */
/* Deskripsi  : program untuk serialisasi objek Person */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 16/05/2026 - 13.00 */

package Serialize;
import java.io.*;

class Person implements Serializable {
    private String name;
    
    public Person(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Sunwoo");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.print("selesai menulis objek person");
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
