/* Nama File  : MPiaraan.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 07/05/2026 - 15.40 */

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan P = new Piaraan();
        Anabul A0 = new Anjing("Snowy", "Snow");
        Anabul A1 = new Kucing("Melky", "Melik", 3.5);
        Anabul A2 = new Kucing("Cio", "Encik", 4.1);
        Anabul A3 = new Kucing("Yeyen", "Oyen", 4.7);
        Anabul A4 = new Kucing("Pepeng", "Empeng", 4.3);
        Anabul A5 = new Kucing("Mochi", "Moshing", 3.9);
        Anabul A6 = new Kucing("Tomy", "Totom", 4.6);
        Anabul A7 = new Kucing("Oki", "Okik", 4.0);
        Anabul A8 = new Kucing("Gerung", "Geyung", 4.2);
        Anabul A9 = new Kucing("Cecep", "Encep", 4.3);
        Anabul A10 = new Kucing("Ceppy", "Cip", 3.1);
        Anabul A11 = new Kucing("Omay", "Omey", 3.9);
        Anabul A12 = new Kucing("Ocil", "Bocil", 3.6);
        Anabul A13 = new Kucing("Sigit", "Segitiga", 3.3);
        Anabul A14 = new Burung("Levi", "Lev");

        P.enqueueAnabul(A0);
        P.enqueueAnabul(A1);
        P.enqueueAnabul(A2);
        P.enqueueAnabul(A3);
        P.enqueueAnabul(A4);
        P.enqueueAnabul(A5);
        P.enqueueAnabul(A6);
        P.enqueueAnabul(A7);
        P.enqueueAnabul(A8);
        P.enqueueAnabul(A9);
        P.enqueueAnabul(A10);
        P.enqueueAnabul(A11);
        P.enqueueAnabul(A12);
        P.enqueueAnabul(A13);
        P.enqueueAnabul(A14);

        System.out.println("=== Daftar Piaraan ===");
        P.showAnabul();

        System.out.println("\nJumlah piaraan  : " + P.getNbelm());
        System.out.println("Piaraan pertama : " + P.getAnabul().getNama());
        System.out.println("Apakah Cio piaraan ku ? " + P.isMember(A2));

        P.dequeueAnabul();
        System.out.println("\n=== Daftar Piaraan ===");
        P.showJenisAnabul();

        System.out.println("\nJumlah kucing      : " + P.countKucing());
        System.out.println("Total bobot kucing : " + P.bobotKucing());

    }
}