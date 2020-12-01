import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String mulai = "y";
    int menu, submenu;

    while (mulai.equals("y")) {
      System.out.println("=====Aplikasi Catatan Hutang=====");
      System.out.println("Pilihan Menu:");
      System.out.println("1. pelanggan");
      System.out.println("2. Barang");
      System.out.println("3. Metode Pembayaran");
      System.out.println("4. Tagihan");
      System.out.println("5. Keluar");

      System.out.print("Silahkan Pilih Menu : ");
      menu = input.nextInt();

      if (menu == 1) {
        // Customer customer1 = new Customer();

        System.out.println();
        System.out.println("1. Tambah data pelanggan");
        System.out.println("2. Ubah data pelanggan");
        System.out.println("3. Cari data pelanggan");

        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data pelanggan
          System.out.println("panggil fungsi tambah data pelanggan");

        } else if (submenu == 2) {
          // panggil fungsi ubah data pelanggan
          System.out.println("panggil fungsi ubah data pelanggan");

        } else if (submenu == 3) {
          // panggil fungsi cari data pelanggan
          System.out.println("panggil fungsi cari data pelanggan");

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 2) {
        // Item item1 = new Item();

        System.out.println();
        System.out.println("1. Tambah data barang");
        System.out.println("2. Ubah data barang");
        System.out.println("3. Cari barang");

        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data barang
          System.out.println("panggil fungsi tambah data barang");

        } else if (submenu == 2) {
          // panggil fungsi ubah data barang
          System.out.println("panggil fungsi ubah data barang");

        } else if (submenu == 3) {
          // panggil fungsi cari data barang
          System.out.println("panggil fungsi cari data barang");

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 3) {
        // Method method1 = new Method();

        System.out.println();
        System.out.println("1. Pilih metode pembayaran");
        System.out.println("2. Ubah metode pembayaran");


        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data pembayaran
          System.out.println("panggil fungsi tambah data pembayaran");

        } else if (submenu == 2) {
          // panggil fungsi ubah data pembayaran
          System.out.println("panggil fungsi ubah data pembayaran");

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 4) {
        // Invoice invoice1 = new Invoice();
        System.out.println();
        System.out.println("1. Masukkan invoice");
        System.out.println("2. Urutkan nominal hutang");
        System.out.println("3. Urutkan tempo hutang");
        System.out.println("4. Ubah status pembayaran");
        System.out.println("5. Cari Invoice");


        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data tagihan
          System.out.println("panggil fungsi tambah data tagihan");

        } else if (submenu == 2) {
          // panggil fungsi urutan data tagihan berdasarkan nominal
          System.out.println("panggil fungsi urutan data tagihan berdasarkan nominal");

        } else if (submenu == 3) {
          // panggil fungsi urutan data tagihan berdasarkan tempo
          System.out.println("panggil fungsi urutan data tagihan berdasarkan tempo");

        } else if (submenu == 4) {
          // panggil fungsi ubah status pembayaran
          System.out.println("panggil fungsi status pembayaran");

        } else if (submenu == 5) {
          // panggil fungsi cari invoice
          System.out.println("panggil fungsi cari invoice");

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 5) {
        System.out.println("Terima kasih");
        System.exit(0);

      } else {
        System.out.println("Menu yang dipilih tidak tersedia");
      }

      System.out.println("\n==========================================");
      System.out.print("Apakah ingin mengulangi program (y/n) ? ");
      mulai = input.next();
      System.out.println("==========================================");

    }
    System.out.println("Terima kasih, program dihentikan");

  }
}
