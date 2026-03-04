/* Nama File  : MTitik.java */
/* Deskripsi  : berisi main program class Titik */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/02/2026 - 15.40 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("============== CLASS TITIK ==============\n");

        Titik T1 = new Titik();
        System.out.print("Create T1 (0, 0)     : ");
        T1.printTitik();

        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.print("Set Absis & Ordinat  : ");
        T1.printTitik();

        T1.geser(3, 4);
        System.out.print("Geser (3, 4)         : ");
        T1.printTitik();

        T1.refleksiX();
        System.out.print("Refleksi X           : ");
        T1.printTitik();

        T1.refleksiY();
        System.out.print("Refleksi Y           : ");
        T1.printTitik();

        System.out.println("Kuadran T1           : " + T1.getKuadran());
        System.out.println("Jarak T1 Ke Pusat    : " + T1.getJarakPusat());

        Titik T2 = new Titik(6, 8);
        System.out.print("\nCreate T2 (X, Y)     : ");
        T2.printTitik();

        Titik T2RefX = T2.getRefleksiX();
        System.out.print("Get Refleksi X       : ");
        T2RefX.printTitik();

        Titik T2RefY = T2.getRefleksiY();
        System.out.print("Get Refleksi Y       : ");
        T2RefY.printTitik();

        System.out.println("Absis T2             : " + T2.getAbsis());
        System.out.println("Ordinat T2           : " + T2.getOrdinat());
        System.out.println("Jarak T1 Ke T2       : " + T1.getJarak(T2));

        System.out.println("\nJumlah Objek Titik   : " + Titik.getCounterTitik());
    }
}