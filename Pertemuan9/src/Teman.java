/* Nama File  : Teman.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 07/05/2026 - 15.40 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /*************** ATRIBUT *******************/
    private int nbelm;
    private List<String> Lnama;

    /*************** KONSTRUKTOR ***************/
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    /*************** SELEKTOR ******************/
    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int index) {
        if (index >= 0 && index < Lnama.size()) {
            return Lnama.get(index);
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    /*************** MUTATOR *******************/
    public void setNama(int index, String nama) {
        Lnama.set(index, nama);
    }

    /*************** METHOD LAIN ***************/
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int i = 0;
        for (i = 0; i < Lnama.size(); i++) {
            if (getNama(i).equals(nama)) {
                setNama(i, namabaru);
            }
        }
    }

    public int countNama(String nama) {
        int i = 0;
        int count = 0;
        for (i = 0; i < Lnama.size(); i++) {
            if (getNama(i).equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        int i;
        for (i = 0; i < Lnama.size(); i++) {
            System.out.println(getNama(i));
        }
    }
}