/* Nama File  : MGaris.java */
/* Deskripsi  : berisi main program class Garis */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/02/2026 - 15.40 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // membuat objek titik T1 (0, 0)
        Titik T2 = new Titik(6, 8); // membuat objek titik T2 (6, 8)
        Garis G1 = new Garis(); // membuat objek garis G1 (0, 0), (1, 1)
        Garis G2 = new Garis(new Titik(-6, 0), new Titik(0, 12)); // membuat objek garis G2 (-6, 0), (0, 12)

        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 setelah diubah
        T1.geser(3, 4); // menggeser T1 sejauh (3, 4)
        T1.printTitik(); // mencetak koordinat T1 setelah digeser
        T1.refleksiX(); // merefleksikan T1 terhadap sumbu X
        T1.printTitik(); // mencetak koordinat T1 setelah direfleksikan terhadap sumbu X
        T1.refleksiY(); // merefleksikan T1 terhadap sumbu Y
        T1.printTitik(); // mencetak koordinat T1 setelah direfleksikan terhadap sumbu Y
        System.out.println("Kuadran T1: " + T1.getKuadran()); // mencetak kuadran T1
        System.out.println("Jarak T1 Ke Pusat: " + T1.getJarakPusat()); // mencetak jarak T1 ke pusat

        System.out.println("Absis T2: " + T2.getAbsis()); // mencetak nilai absis T2
        System.out.println("Ordinat T2: " + T2.getOrdinat()); // mencetak nilai ordinat T2
        Titik T2RefX = T2.getRefleksiX(); // membuat objek titik T2RefX yang berisi refleksi T2 terhadap sumbu X
        T2RefX.printTitik(); // mencetak koordinat T2RefX
        Titik T2RefY = T2.getRefleksiY(); // membuat objek titik T2RefY yang berisi refleksi T2 terhadap sumbu Y
        T2RefY.printTitik(); // mencetak koordinat T2RefY
        
        System.out.println("Jarak T1 Ke T2: " + T1.getJarak(T2)); // mencetak jarak T1 ke T2
        System.out.println("Jumlah Objek Titik: " + Titik.getCounterTitik()); // mencetak jumlah objek titik

        G1.setTitikAwal(new Titik(-2, 0)); // mengubah titik awal G1 dengan titik (2, 0)
        G1.setTitikAkhir(new Titik(0, 4)); // mengubah titik akhir G1 dengan titik (0, 4)
        G1.printGaris(); // mencetak garis G1 setelah diubah
        Titik T1Tgh = G1.getTitikTengah(); // membuat objek T1Tgh yang berisi titik tengah G1
        T1Tgh.printTitik(); // mencetak koordinat T1Tgh
        System.out.println("Panjang G1: " + G1.getPanjangGaris()); // mencetak panjang garis G1
        System.out.println("Gradien G1: " + G1.getGradien()); // mencetak gradien G1
        G1.printPersamaanGaris(); // mencetak persamaan garis G1

        G2.getTitikAwal().printTitik(); // mencetak titik awal garis G2
        G2.getTitikAkhir().printTitik(); // mencetak titik akhir garis G2
        Titik T2Tgh = G2.getTitikTengah(); // membuat objek T2Tgh yang berisi titik tengah G2
        T2Tgh.printTitik(); // mencetak koordinat T2Tgh
        System.out.println("Panjang G2: " + G2.getPanjangGaris()); // mencetak panjang garis G2
        System.out.println("Gradien G2: " + G2.getGradien()); // mencetak gradien G2
        G2.printPersamaanGaris(); // mencetak persamaan garis G2

        System.out.println("Is Sejajar G1 & G2 ? " + G1.isSejajar(G2)); // mencetak apakah G1 dan G2 sejajar
        System.out.println("Is Tegak Lurus G1 & G2 ? " + G1.isTegakLurus(G2)); // mencetak apakah G1 dan G2 tegak lurus
        System.out.println("Jumlah Objek Garis: " + Garis.getCounterGaris()); // mencetak jumlah objek garis
    }
}
