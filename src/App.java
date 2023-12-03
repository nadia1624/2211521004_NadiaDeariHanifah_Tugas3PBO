import java.util.*;
import java.text.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false; 
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E,dd/MM/yyyy"); 
        SimpleDateFormat waktu =new SimpleDateFormat("hh:mm:ss a zzz");
       

        do {
            try {
                System.out.print("Masukkan nama pelanggan\t\t: ");
                String namaPelanggan = scanner.next();

                System.out.print("Masukkan nomor HP pelanggan\t: ");
                String nomorHpPelanggan = scanner.next();

                System.out.print("Masukkan alamat pelanggan\t: ");
                String alamatPelanggan = scanner.next();

                System.out.print("Masukkan Kode Barang\t\t: ");
                String kodeBarang = scanner.next();

                System.out.print("Masukkan Nama Barang\t\t: ");
                String namaBarang = scanner.next();

                System.out.print("Masukkan Harga Barang\t\t: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("Masukkan Jumlah Beli\t\t: ");
                int jumlahBeli = scanner.nextInt();

                Faktur faktur = new Faktur(kodeBarang,namaPelanggan,nomorHpPelanggan,alamatPelanggan, namaBarang, hargaBarang, jumlahBeli);

                System.out.println("==============================================\n");
                System.out.println("\tBUDIMAN SUPERMARKET");
                System.out.println("Tanggal\t\t: " +tanggal.format(hariSekarang));
                System.out.println("Waktu\t\t: "+ waktu.format(hariSekarang));
                System.out.println("==============================================");
                System.out.println("DATA PELANGGAN");
                System.out.println("----------------------------------------------");
                System.out.println(faktur);
                System.out.println("TOTAL BAYAR\t: " + faktur.hitungTotalBayar());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Kasir : NADIA");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan
            } catch (Exception e) { //exception
                System.out.println("Terjadi kesalahan input \n" );
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); // Membersihkan buffer input
            }
        } 
        while (!inputValid);

        scanner.close();
    
    }
}
