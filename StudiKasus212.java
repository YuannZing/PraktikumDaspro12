import java.util.Scanner;

public class StudiKasus212 {
    public static void main(String[] args) {
        // deklarasi
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa,
                jenisKegiatan;
        int jumlahDokumen,
                peringkatJuara,
                dokumenkurang,
                pendanaanPKM;

        // input
        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM?LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        // proses
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Masukkan peringkat juara: ");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Peserta memperoleh dana penghargaan");
                } else {
                    dokumenkurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + dokumenkurang + " dokumen)");
                }
            } else {
                System.out.println("Status : Peserta tidak memperoleh dana penghargaan karena anda bukan juara 1,2,3");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos/0 = tidak lolos): ");
            pendanaanPKM = sc.nextInt();
            if (pendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Peserta memperoleh dana penghargaan");
                } else {
                    dokumenkurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + dokumenkurang + " dokumen)");
                }
            } else {
                System.out.println("Status : Peserta tidak memperoleh dana penghargaan");
            }
        } else {
            System.out.println("Status : Peserta tidak memperoleh dana penghargaan");
        }
    }
}
