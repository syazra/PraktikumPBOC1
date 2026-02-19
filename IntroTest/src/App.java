public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("\n Contoh 1: Variables dan Conditionals ");
        contohVariabelDanKondisional();
        
        System.out.println("\n Contoh 2: Array dan Looping ");
        contohArrayDanLooping();
    }
    
    // Contoh 1: Penggunaan variable dan conditional (if-else)
    public static void contohVariabelDanKondisional() {
        // Deklarasi dan inisialisasi variable
        String nama = "Budi";
        int umur = 20;
        double ipk = 3.75;
        boolean mahasiswaAktif = true;
        
        // Menampilkan variable
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + (mahasiswaAktif ? "Aktif" : "Tidak Aktif"));
        
        // Conditional if-else untuk menentukan predikat
        System.out.print("Predikat: ");
        if (ipk >= 3.50) {
            System.out.println("Cum Laude");
        } else if (ipk >= 3.00) {
            System.out.println("Sangat Memuaskan");
        } else if (ipk >= 2.75) {
            System.out.println("Memuaskan");
        } else {
            System.out.println("Perlu Peningkatan");
        }
        
        // Conditional untuk kategori umur
        System.out.print("Kategori: ");
        if (umur < 17) {
            System.out.println("Remaja");
        } else if (umur <= 25) {
            System.out.println("Dewasa Muda");
        } else {
            System.out.println("Dewasa");
        }
    }
    
    // Contoh 2: Penggunaan array dan looping
    public static void contohArrayDanLooping() {
        // Deklarasi dan inisialisasi array
        int[] nilaiUjian = {85, 92, 78, 95, 88};
        String[] mataKuliah = {"Matematika", "Fisika", "Pemrograman", "Basis Data", "Algoritma"};
        
        // Menampilkan data dengan for loop
        System.out.println("Daftar Nilai:");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i] + ": " + nilaiUjian[i]);
        }
        
        // Menghitung total dan rata-rata menggunakan for-each loop
        int total = 0;
        for (int nilai : nilaiUjian) {
            total += nilai;
        }
        double rataRata = (double) total / nilaiUjian.length;
        
        System.out.println("\nTotal Nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        
        // Mencari nilai tertinggi dan terendah dengan while loop
        int tertinggi = nilaiUjian[0];
        int terendah = nilaiUjian[0];
        int index = 1;
        
        while (index < nilaiUjian.length) {
            if (nilaiUjian[index] > tertinggi) {
                tertinggi = nilaiUjian[index];
            }
            if (nilaiUjian[index] < terendah) {
                terendah = nilaiUjian[index];
            }
            index++;
        }
        
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        
        // Menghitung jumlah nilai yang lulus (>=75) dengan do-while
        int jumlahLulus = 0;
        int idx = 0;
        do {
            if (nilaiUjian[idx] >= 75) {
                jumlahLulus++;
            }
            idx++;
        } while (idx < nilaiUjian.length);
        
        System.out.println("Jumlah Mata Kuliah yang Lulus: " + jumlahLulus + " dari " + nilaiUjian.length);
    }
}
