/* Nama File  : LambdaMap.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 28/05/2026 - 15.40 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("10", "sunwoo");
        mahasiswaMap.put("11", "eric");
        mahasiswaMap.put("5", "juyeon");

        // lambda digunakan untuk menampilkan key dan value dari map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
