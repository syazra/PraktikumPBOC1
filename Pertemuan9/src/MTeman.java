/* Nama File  : MTeman.java */
/* Pembuat    : 24060124130088 - Syafira Azka Ramadhani */
/* Tanggal    : 07/05/2026 - 15.40 */

public class MTeman {
    public static void main(String[] args) {
        Teman TBZ = new Teman();

        TBZ.addNama("Sangyeon");
        TBZ.addNama("Jacob");
        TBZ.addNama("Hyunjae");
        TBZ.addNama("Younghoon");
        TBZ.addNama("Juyeon");
        TBZ.addNama("Chanhee");
        TBZ.addNama("Changmin");
        TBZ.addNama("Kevin");
        TBZ.addNama("Haknyeon");
        TBZ.addNama("Hwall");
        TBZ.addNama("Sunwoo");
        TBZ.addNama("Eric");
        TBZ.addNama("Creker");

        TBZ.delNama("Creker");
        System.out.println("=== Daftar Member TBZ ===");
        TBZ.showTeman();

        TBZ.setNama(5, "New");
        TBZ.setNama(6, "Q");
        TBZ.gantiNama("Hwall", "Hyunjun");
        System.out.println("\n=== Daftar Member TBZ Setelah Ganti Nama ===");
        TBZ.showTeman();

        System.out.println("\nJumlah member TBZ : " + TBZ.getNbelm());
        System.out.println("Leader member TBZ : " + TBZ.getNama(0));
        System.out.println("Jumlah nama Eric  : " + TBZ.countNama("Eric"));
        System.out.println("Apakah New member TBZ ? " + TBZ.isMember("New"));
        System.out.println("Member  TBZ ke-13 : " + TBZ.getNama(12));
    }
}
