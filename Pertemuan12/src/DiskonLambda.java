/* Nama File  : DiskonLambda.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 28/05/2026 - 15.40 */

interface IDiskon {
    // menghitung harga diskon
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) throws Exception {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda inline
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda block statement (sederhana)
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // dengan lambda block statement (kompleks)
        IDiskon diskonBertingkat = (harga) -> {
            if (harga >= 100000) {
                return harga - (harga * 0.3);
            } else if (harga >= 50000) {
                return harga - (harga *0.15);
            } else {
                return harga;
            }
        };

        // menampilkan hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));
    }
}
