/* Nama File  : Piaraan.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 07/05/2026 - 15.40 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /*************** ATRIBUT *******************/
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /*************** KONSTRUKTOR ***************/
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    /*************** SELEKTOR ******************/
    public int getNbelm() {
        return nbelm;
    }

    public Anabul getAnabul() {
        return Lanabul.element();
    }

    /*************** METHOD LAIN ***************/
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public void dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            Lanabul.remove();
            nbelm--;
        }
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        int total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getClass());
        }
    }
}
