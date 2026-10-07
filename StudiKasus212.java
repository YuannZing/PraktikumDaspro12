import java.util.Scanner;

public class StudiKasus212 {
    public static void main(String[] args) {
        // deklarasi
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa,
                jenisKegiatan;
        int jumlahDokumen,
                peringkatJuara,
                pendanaanPKM;

        // input
        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM?LAINNYA): ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        // proses
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan peringkat juara: ");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara >= 1 || peringkatJuara <= 3) {
                System.out.println("Peserta memperoleh dana penghargaan");
            } else {
                System.out.println("Peserta tidak memperoleh dana penghargaan");
            }
        } 
    }
}
