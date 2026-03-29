/* Nama File  : MBangunDatar.java */
/* Deskripsi  : berisi main program class BangunDatar */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(); // membuat objek persegi P1 tanpa parameter menggunakan tipe bangun datar
        BangunDatar P2 = new Persegi(5, "green", "blue"); // membuat objek persegi P2 dengan parameter menggunakan tipe bangun datar
        BangunDatar L1 = new Lingkaran(); // membuat objek lingkaran L1 tanpa parameter menggunakan tipe bangun datar
        BangunDatar L2 = new Lingkaran(1, "pink", "purple"); // membuat objek lingkaran L2 dengan parameter menggunakan tipe bangun datar
        Persegi P3 = new Persegi(); // membuat objek persegi P3 tanpa parameter
        Persegi P4 = new Persegi(9.5, "black", "white"); // membuat objek persegi P4 dengan parameter
        Lingkaran L3 = new Lingkaran(); // membuat objek lingkaran L3 tanpa parameter
        Lingkaran L4 = new Lingkaran(7, "grey", "navy"); // membuat objek lingkaran L4 dengan parameter

        System.out.println("=============== PERSEGI P1 =====================");
        ((Persegi)(P1)).setSisi(3.5); // mengubah panjang sisi persegi P1
        P1.setWarna("maroon"); // mengubah warna persegi P1
        P1.setBorder("violet"); // mengubah border persegi P1
        P1.printInfo(); // mencetak info persegi P1 setelah diubah
        System.out.println("Keliling Persegi: " + ((Persegi)(P1)).getKeliling()); // mencetak keliling persegi P1
        System.out.println("Luas Persegi: " + ((Persegi)(P1)).getLuas()); // mencetak luas persegi P1
        System.out.println("Diagonal Persegi: " + ((Persegi)(P1)).getDiagonal()); // mencetak diagonal persegi P1

        System.out.println("=============== PERSEGI P2 =====================");
        System.out.println("Jumlah Sisi: " + P2.getJmlSisi()); // mencetak jumlah sisi persegi P2
        System.out.println("Warna: " + P2.getWarna()); // mencetak warna persegi P2
        System.out.println("Border: " + P2.getBorder()); // mencetak border persegi P2
        System.out.println("Panjang Sisi Persegi: " + ((Persegi)(P2)).getSisi()); // mencetak panjang sisi persegi P2
        System.out.println("Keliling Persegi: " + ((Persegi)(P2)).getKeliling()); // mencetak keliling persegi P2
        System.out.println("Luas Persegi: " + ((Persegi)(P2)).getLuas()); // mencetak luas persegi P2
        System.out.println("Diagonal Persegi: " + ((Persegi)(P2)).getDiagonal()); // mencetak diagonal persegi P2

        System.out.println("=============== LINGKARAN L1 ====================");
        ((Lingkaran)(L1)).setJari(100); // mengubah jari-jari lingkaran L1
        L1.setWarna("pink"); // mengubah warna lingkaran L1
        L1.setBorder("navy"); // mengubah border lingkaran L1
        L1.printInfo(); // mencetak info lingkaran L1 setelah diubah
        System.out.println("Keliling Lingkaran: " + ((Lingkaran)(L1)).getKeliling()); // mencetak keliling lingkaran L1
        System.out.println("Luas Lingkaran: " + ((Lingkaran)(L1)).getLuas()); // mencetak luas lingkaran L1

        System.out.println("=============== LINGKARAN L2 ====================");
        System.out.println("Jumlah Sisi: " + L2.getJmlSisi()); // mencetak jumlah sisi lingkaran L2
        System.out.println("Warna: " + L2.getWarna()); // mencetak warna lingkaran L2
        System.out.println("Border: " + L2.getBorder()); // mencetak border lingkaran L2
        System.out.println("Jari-Jari Lingkaran: " + ((Lingkaran)(L2)).getJari()); // mencetak jari-jari lingkaran L2
        System.out.println("Diameter Lingkaran: " + ((Lingkaran)(L2)).getDiameter()); // mencetak diameter lingkaran L2
        System.out.println("Keliling Lingkaran: " + ((Lingkaran)(L2)).getKeliling()); // mencetak keliling lingkaran L2
        System.out.println("Luas Lingkaran: " + ((Lingkaran)(L2)).getLuas()); // mencetak luas lingkaran L2

        System.out.println("=============== PERSEGI P3 =====================");
        P3.setWarna("cream"); // mengubah warna persegi P3
        P3.setBorder("mustard"); // mengubah border persegi P3
        P3.setSisi(88); // mengubah panjang sisi persegi P3
        P3.printInfo(); // mencetak info persegi P3 setelah diubah
        System.out.println("Keliling Persegi: " + P3.getKeliling()); // mencetak keliling persegi P3
        System.out.println("Luas Persegi: " + P3.getLuas()); // mencetak luas persegi P3
        System.out.println("Diagonal Persegi: " + P3.getDiagonal()); // mencetak diagonal persegi P3

        System.out.println("=============== PERSEGI P4 =====================");
        System.out.println("Jumlah Sisi: " + P4.getJmlSisi()); // mencetak jumlah sisi persegi P4
        System.out.println("Warna: " + P4.getWarna()); // mencetak warna persegi P4
        System.out.println("Border: " + P4.getBorder()); // mencetak border persegi P4
        System.out.println("Panjang Sisi Persegi: " + P4.getSisi()); // mencetak panjang sisi persegi P4
        System.out.println("Keliling Persegi: " + P4.getKeliling()); // mencetak keliling persegi P4
        System.out.println("Luas Persegi: " + P4.getLuas()); // mencetak luas persegi P4
        System.out.println("Diagonal Persegi: " + P4.getDiagonal()); // mencetak diagonal persegi P4

        System.out.println("=============== LINGKARAN L3 ===================");
        L3.setJari(10.5); // mengubah jari-jari lingkaran L3
        L3.setWarna("peach"); // mengubah warna lingkaran L3
        L3.setBorder("olive"); // mengubah border lingkaran L3
        L3.printInfo(); // mencetak info lingkaran L3 setelah diubah
        System.out.println("Keliling Lingkaran: " + L3.getKeliling()); // mencetak keliling lingkaran L3
        System.out.println("Luas Lingkaran: " + L3.getLuas()); // mencetak luas lingkaran L3

        System.out.println("=============== LINGKARAN L3 ===================");
        System.out.println("Jumlah Sisi: " + L4.getJmlSisi()); // mencetak jumlah sisi lingkaran L4
        System.out.println("Warna: " + L4.getWarna()); // mencetak warna lingkaran L4
        System.out.println("Border: " + L4.getBorder()); // mencetak border lingkaran L4
        System.out.println("Jari-Jari Lingkaran: " + L4.getJari()); // mencetak jari-jari lingkaran L4
        System.out.println("Diameter Lingkaran: " + L4.getDiameter()); // mencetak diameter lingkaran L4
        System.out.println("Keliling Lingkaran: " + L4.getKeliling()); // mencetak keliling lingkaran L4
        System.out.println("Luas Lingkaran: " + L4.getLuas()); // mencetak luas lingkaran L4

        System.out.println("=============== COUNTER ========================");
        System.out.println("Jumlah Objek Persegi: " + Persegi.getCounterPersegi()); // mencetak jumlah objek persegi
        System.out.println("Jumlah Objek Lingkaran: " + Lingkaran.getCounterLingkaran()); // mencetak jumlah objek lingkaran
        System.out.println("Jumlah Objek Bangun Datar: " + BangunDatar.getCounterBangunDatar()); // mencetak jumlah objek bangun datar

        System.out.println("=============== RESIZE PERSEGI =================");
        System.out.println("Panjang Sisi Persegi P1 (Before): " + ((Persegi)(P1)).getSisi()); // mencetak panjang sisi persegi P1
        ((Persegi)(P1)).zoomIn(); // menambah panjang sisi menjadi 10% lebih besar
        System.out.println("Panjang Sisi Persegi P1 (After): " + ((Persegi)(P1)).getSisi()); // mencetak panjang sisi persegi P1
        System.out.println("Panjang Sisi Persegi P2 (Before): " + ((Persegi)(P2)).getSisi()); // mencetak panjang sisi persegi P2
        ((Persegi)(P2)).zoomOut(); // mengurangi panjang sisi menjadi 10% lebih kecil
        System.out.println("Panjang Sisi Persegi P2 (After): " + ((Persegi)(P2)).getSisi()); // mencetak panjang sisi persegi P2
        System.out.println("Panjang Sisi Persegi P3 (Before): " + P3.getSisi()); // mencetak panjang sisi persegi P3
        P3.zoom(20); // menskalakan panjang sisi sebesar 20%
        System.out.println("Panjang Sisi Persegi P3 (After): " + P3.getSisi()); // mencetak panjang sisi persegi P3

        System.out.println("=============== RESIZE LINGKARAN ===============");
        System.out.println("Panjang Jari-Jari Lingkaran L1 (Before): " + ((Lingkaran)(L1)).getJari()); // mencetak jari-jari lingkaran L1
        ((Lingkaran)(L1)).zoomIn(); // menambah panjang jari-jari menjadi 10% lebih besar
        System.out.println("Panjang Jari-Jari Lingkaran L1 (After): " + ((Lingkaran)(L1)).getJari()); // mencetak jari-jari lingkaran L1
        System.out.println("Panjang Jari-Jari Lingkaran L2 (Before): " + ((Lingkaran)(L2)).getJari()); // mencetak jari-jari lingkaran L2
        ((Lingkaran)(L2)).zoomOut(); // mengurangi panjang jari-jari menjadi 10% lebih kecil
        System.out.println("Panjang Jari-Jari Lingkaran L2 (After): " + ((Lingkaran)(L2)).getJari()); // mencetak jari-jari lingkaran L2
        System.out.println("Panjang Jari-Jari Lingkaran L3 (Before): " + L3.getJari()); // mencetak jari-jari lingkaran L3
        L3.zoom(50); // menskalakan panjang jari-jari seebesar 50%
        System.out.println("Panjang Jari-Jari Lingkaran L3 (After): " + L3.getJari()); // mencetak jari-jari lingkaran L3
    }
}