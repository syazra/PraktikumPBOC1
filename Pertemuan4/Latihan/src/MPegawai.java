/* Nama File  : MPegawai.java */
/* Deskripsi  : berisi main program class Pegawai */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 12/03/2026 - 15.40 */

import java.util.Locale;

public class MPegawai {
    public static void main(String[] args) {
        Tanggal T0 = new Tanggal();
        Tanggal T1 = new Tanggal(15, 8, 1995);
        Tanggal T2 = new Tanggal(1, 1, 2020);
        Tanggal T3 = new Tanggal(10, 3, 2025);
        Pegawai P0 = new Pegawai();
        Pegawai P1 = new Pegawai("P00001", "Jake Sully", new Tanggal(10, 5, 1990), new Tanggal(1, 3, 2010), 10500000);
        Dosen D1 = new Dosen("D00001", "Shaun Murphy", new Tanggal(12, 3, 1975), new Tanggal(1, 9, 2005), "Fakultas Kedokteran", 60000000);
        DosenTetap DTP1 = new DosenTetap("DTP00001", "NIDN00001", "Sarah Kim", new Tanggal(17, 8, 1970), new Tanggal(1, 1, 2000), "Fakultas Hukum", 80000000);
        DosenTamu DTM1 = new DosenTamu("DTM00001", "NIDK00001", "Glassman", new Tanggal(3, 5, 1982), new Tanggal(1, 9, 2022), "Fakultas Kedokteran", new Tanggal(31, 12, 2026), 70000000);
        Tendik TK1 = new Tendik("TK00001", "Melendez", new Tanggal(20, 4, 1988), new Tanggal(1, 7, 2015), "Akademik", 4200000);

        System.out.println("Hari: " + T1.getHari());
        System.out.println("Bulan: " + T1.getBulan());
        System.out.println("Tahun: " + T1.getTahun());
        
        T0.setHari(25);
        T0.setBulan(12);
        T0.setTahun(2016);
        T0.printTanggal();

        T1.printTanggal();
        T2.printTanggal();
        T3.printTanggal();

        System.out.println("NIP                   : " + P1.getNIP());
        System.out.println("Nama                  : " + P1.getNama());
        System.out.print("Tanggal Lahir         : ");
        P1.getTglLahir().printTanggal();
        System.out.print("TMT                   : ");
        P1.getTMT().printTanggal();
        Tanggal temp1 = P1.getMasaKerja();
        System.out.println("Masa Kerja            : " + temp1.getTahun() + " tahun " + temp1.getBulan() + " bulan " + temp1.getHari() + " hari");
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", P1.getGajiPokok()) + ",00");

        P0.setNIP("P00002");
        P0.setNama("Neytiri");
        P0.setTglLahir(T1);
        P0.setTMT(T0);
        P0.setGajiPokok(8000000);
        P0.printInfo();

        System.out.println("NIP                   : " + D1.getNIP());
        System.out.println("Nama                  : " + D1.getNama());
        System.out.print("Tanggal Lahir         : ");
        D1.getTglLahir().printTanggal();
        System.out.print("TMT                   : ");
        D1.getTMT().printTanggal();
        System.out.println("Fakultas              : " + D1.getFakultas()); 
        Tanggal temp2 = D1.getMasaKerja();
        System.out.println("Masa Kerja            : " + temp2.getTahun() + " tahun " + temp2.getBulan() + " bulan " + temp2.getHari() + " hari");
        System.out.println("Gaji Pokok            : Rp " + String.format(new Locale("id","ID"), "%,d", D1.getGajiPokok()) + ",00");

        DTP1.printInfo();
        DTM1.printInfo();
        TK1.printInfo();
    }
}
