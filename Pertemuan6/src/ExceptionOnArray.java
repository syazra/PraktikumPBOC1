/* Nama File  : ExceptionOnArray.java */
/* Deskripsi  : program penggunaan eksepsi menggunakan class library Java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 14/04/2026 - 15.40 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansisasi pbject array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
