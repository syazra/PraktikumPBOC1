/* Nama File  : BangunDatar.java */
/* Deskripsi  : berisi atribut dan method dalam class BangunDatar */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 26/03/2026 - 15.40 */

public abstract class BangunDatar {
    /*************** ATRIBUT *******************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek bangun datar tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // konstruktor untuk membuat objek bangun datar dengan parameter 
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan jumlah sisi bangun datar
    public int getJmlSisi() {
        return jmlSisi;
    }

    // mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    // mengembalikan border bangun datar
    public String getBorder() {
        return border;
    }

    // mengembalikan counter bangun datar
    public static int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    /*************** MUTATOR *******************/
    // mengeset jumlah sisi bangun datar dengan nilai baru
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    } 

    // mengeset warna bangun datar dengan nilai baru
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // mengeset border bangun datar dengan nilai baru
    public void setBorder(String border) {
        this.border = border;
    }

    /*************** METHOD LAIN ***************/
    // abstract method untuk menghitung keliling bangun datar
    public abstract double getKeliling();

    // abstract method untuk menghitung luas bangun datar
    public abstract double getLuas();
    
    // mencetak info bangun datar ke layar
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}