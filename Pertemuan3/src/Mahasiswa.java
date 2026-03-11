/* Nama File  : Mahasiswa.java */
/* Deskripsi  : berisi atribut dan method dalam class Mahasiswa */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 05/03/2026 - 15.40 */

import java.util.ArrayList;

public class Mahasiswa {
    /*************** ATRIBUT *******************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*************** KONSTRUKTOR ***************/
    // konstruktor untuk membuat objek mahasiswa tanpa parameter
    public Mahasiswa() {
        nim = "-";
        nama = "-";
        prodi = "-";
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }
    
    // konstruktor untuk membuat objek mahasiswa dengan parameter nim, nama, dan prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    /*************** SELEKTOR ******************/
    // mengembalikan nim mahasiswa
    public String getNIM() {
        return nim;
    }

    // mengembalikan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // mengembalikan prodi mahasiswa
    public String getProdi() {
        return prodi;
    }

    // mengembalikan listMatkul mahasiswa
    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    // mengembalikan dowenWali mahasiswa
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // mengembalikan kendaraan mahasiswa
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /*************** MUTATOR *******************/
    // mengeset nim mahasiswa dengan nilai baru
    public void setNIM(String nim) {
        this.nim = nim;
    }

    // mengeset nama mahasiswa dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset prodi mahasiswa dengan nilai baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // mengeset listMatkul mahasiswa dengan nilai baru
    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    // mengeset dosenWali mahasiswa dengan nilai baru
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // mengeset kendaraan mahasiswa dengan nilai baru
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /*************** METHOD LAIN ***************/
    // menambahkan sebuah matakuliah ke atribut listMatKul
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // menghitung jumlah SKS matakuliah yang diambil mahasiswa
    public int getJumlahSKS() {
        int i, sum;
        sum = 0;
        for (i = 0; i < listMatKul.size(); i++) {
            sum += listMatKul.get(i).getSKS();
        }
        return sum;
    }

    // menghitung jumlah matakuliah
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // mencetak nim, nama, dan prodi mahasiswa ke layar
    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // mencetak nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah: ");
        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getIdMatKul() + " ");
        }
        System.out.println("Data Dosen Wali: ");
        dosenWali.printDosen();
        System.out.println("Data Kendaraan: ");
        kendaraan.printKendaraan();
    }
}