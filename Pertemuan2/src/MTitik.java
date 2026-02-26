/* Nama File  : MTitik.java */
/* Deskripsi  : berisi main program class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/02/2026 - 15.40 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //membuat objek titik T1 (0, 0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3, 4); //menggeser T1 sejauh (3, 4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3, 5);
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        T2.printCounterTitik();
        T1.refleksiX();
        T1.printTitik();
        System.out.println("Titik T1 berada di kuadran " + T1.getKuadran());
        System.out.println("Refleksi X Titik T1 " + T1.getRefleksiX());
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
    }
}