public class Garis {
    /***************ATRIBUT***************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int counterGaris = 0;

    /***************METHOD****************/
    Garis() {
        TitikAwal = new Titik();
        TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir) {
        TitikAwal = awal;
        TitikAkhir = akhir;
        counterGaris++;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    Titik getTitikAwal() {
        return TitikAwal;
    }

    Titik getTitikAkhir() {
        return TitikAkhir;
    }

    void setTitikAwal(Titik awal) {
        TitikAwal = awal;
    }

    void setTitikAkhir(Titik akhir) {
        TitikAkhir = akhir;
    }

    double getPanjangGaris() {
        return Math.sqrt(Math.pow(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis(), 2)
        + Math.pow(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat(), 2));
    }

    double getGradien() {
        return (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) /
        (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
    }

    Titik getTitikTengah() {
        Titik T = new Titik();
        T.setAbsis((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2);
        T.setOrdinat((getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        return T;
    }

    boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    void printGaris() {
        System.out.println("Garis (" + TitikAwal.getAbsis() + ", " + TitikAwal.getOrdinat() + "), "
        + "(" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getOrdinat() + ")");
    }

    void printPersamaanGaris() {
        double c = getTitikAwal().getOrdinat() - getGradien() * getTitikAwal().getAbsis();
        if (c > 0) {
            System.out.println("y = " + getGradien() +"x + " + c);
        } else if (c < 0) {
            System.out.println("y = " + getGradien() +"x - " + Math.abs(c));
        } else {
            System.out.println("y = " + getGradien() +"x");
        }
    }
}