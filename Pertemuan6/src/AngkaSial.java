/* Nama File  : AngkaSial.java */
/* Deskripsi  : program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws' */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 14/04/2026 - 15.40 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Ketika exception terjadi, baris 12 tidak dieksekusi karena langsung dihentikan oleh perintah throw
// Program kemudian berpindah ke catch, sehingga baris 21 dieksekusi untuk menangani exception yang terjadi
// Akibatnya, cobaAngka(12) tidak dieksekusi karena program sudah berpindah ke catch