/* Nama File  : Dosen.java */
/* Deskripsi  : berisi atribut dan method dalam class Dosen */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class Dosen extends Pegawai {
    /*************** ATRIBUT *******************/
    protected String fakultas;
    private static int counterDosen = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek dosen tanpa parameter
    public Dosen() {
        counterDosen++;
    }

    // konstruktor untuk membuat objek dosen dengan parameter
    public Dosen(String nip, String nama, Tanggal tglLahir, Tanggal tmt, String fakultas, int gajiPokok) {
        super(nip, nama,tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }

    /*************** SELEKTOR ******************/
    // mengembalikan fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    /*************** MUTATOR *******************/
    // mengeset fakultas dosen dengan nilai baru
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /*************** METHOD LAIN ***************/
    // mencetak counter dosen
    public void printCounterDosen() {
        System.out.println("Jumlah Objek Dosen: " + counterDosen);
    }

    // mencetak info dosen
    @Override
    public void printInfo() {
        System.out.println("NIP                   : " + nip);
        System.out.println("Nama                  : " + nama);
        System.out.print("Tanggal Lahir         : ");
        tglLahir.printTanggal();
        System.out.print("TMT                   : ");
        tmt.printTanggal();
        System.out.println("Fakultas              : " + fakultas); 
        Tanggal T = getMasaKerja();
        System.out.println("Masa Kerja            : " + T.getTahun() + " tahun " + T.getBulan() + " bulan " + T.getHari() + " hari");
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", gajiPokok) + ",00");
    }
}