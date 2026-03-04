public class MGaris {
    public static void main(String[] args) {
        System.out.println("======================== CLASS GARIS ========================\n");

        Garis G1 = new Garis();
        System.out.print("Create G1                    : ");
        G1.printGaris();

        G1.setTitikAwal(new Titik(-2, 0));
        G1.setTitikAkhir(new Titik(0, 4));
        System.out.print("Set Titik Awal & Titik Akhir : ");
        G1.printGaris();

        Titik T1 = G1.getTitikTengah();
        System.out.print("Get Titik Tengah G1          : ");
        T1.printTitik();

        System.out.println("Panjang G1                   : " + G1.getPanjangGaris());
        System.out.println("Gradien G1                   : " + G1.getGradien());

        System.out.print("Persamaan Garis G1           : ");
        G1.printPersamaanGaris();

        Garis G2 = new Garis(new Titik(-6, 0), new Titik(0, 12));
        System.out.print("\nCreate G2                    : ");
        G2.printGaris();

        Titik T2 = G2.getTitikTengah();
        System.out.print("Get Titik Tengah G2          : ");
        T2.printTitik();

        System.out.println("Panjang G2                   : " + G2.getPanjangGaris());
        System.out.println("Gradien G2                   : " + G2.getGradien());

        System.out.print("Persamaan Garis G2           : ");
        G2.printPersamaanGaris();

        System.out.println("\nIs Sejajar G1 & G2 ?         : " + G1.isSejajar(G2));
        System.out.println("Is Tegak Lurus G1 & G2 ?     : " + G1.isTegakLurus(G2));
        
        System.out.println("\nJumlah Objek Garis           : " + Garis.getCounterGaris());
    }
}
