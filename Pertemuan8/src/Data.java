/* Nama File  : Data.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 30/04/2026 - 15.40 */

public class Data<G> {
    private G[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (G[]) new Object[100];
        banyak = 0;
    }

    public G getIsi(int i) {
        if (i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }
        return ruang[i - 1];
    }

    public void setIsi(int i, G x) {
        if (i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }
        if (ruang[i - 1] == null && x != null) {
            banyak++;
        } else if (ruang[i - 1] != null && x == null) {
            banyak--;
        }
        ruang[i - 1] = x;
    }

    public int getSize() {
        return banyak;
    }
}