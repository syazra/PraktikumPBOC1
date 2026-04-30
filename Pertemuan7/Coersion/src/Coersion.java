/* Nama File  : Coersion.java */
/* Deskripsi  : polimorfisme ad hoc coersion */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 23/04/2026 - 15.40 */

public class Coersion {
    public static void main(String[] args) {
        // a. Konversi integer ke character dan real
        int a = 65;
        System.out.println("Konversi integer menjadi character dan real");
        System.out.println("65 Sebagai Integer   : " + a);
        System.out.println("65 Sebagai Character : " + (char) a);
        System.out.println("65 Sebagai Real      : " + (double) a);

        // b. Konversi real kembali ke integer
        double b = (double) a;
        int c = (int) b;
        System.out.println("\nKonversi real menjadi integer");
        System.out.println("Real    : " + b);
        System.out.println("Integer : " + c);

        // c. Konkatenasi serta penjumlahan (Integer) String X dan Y 
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("\nKonkatenasi serta penjumlahan (Integer) String X dan Y");
        System.out.println("S (konkatenasi) : " + S);
        System.out.println("Z (penjumlahan) : " + Z);

        // d. Konkatenasi serta penjumlahan (Double) String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("\nKonkatenasi serta penjumlahan (Double) String P dan Q");
        System.out.println("R (konkatenasi) : " + R);
        System.out.println("D (penjumlahan) : " + D);

        // e. Konversi S ke Integer A
        Integer A = Integer.parseInt(S);
        System.out.println("\nInteger A diisi Sring S");
        System.out.println("Nilai A : " + A);

        // f. Konversi A ke String T
        String T = Integer.toString(A);
        System.out.println("\nString T siisi Integer A");
        System.out.println("Nilai T : " + T);
    }
}