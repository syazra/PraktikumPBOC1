/* Nama File  : LambdaList.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 28/05/2026 - 15.40 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        // list untuk menyimpan nama mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("sunwoo");
        mahasiswaList.add("eric");
        mahasiswaList.add("juyeon");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}