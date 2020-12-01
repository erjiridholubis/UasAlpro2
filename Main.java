import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    java.util.Scanner input = new Scanner(System.in);
    String mulai = "y";
    int menu, submenu;

    while (mulai.equals("y")) {
      System.out.println("=====Aplikasi Catatan Hutang=====");
      System.out.println("Pilihan Menu:");
      System.out.println("1. Pelanggan");
      System.out.println("2. Barang");
      System.out.println("3. Metode Pembayaran");
      System.out.println("4. Tagihan");
      System.out.println("5. Keluar");

      System.out.print("Silahkan Pilih Menu: ");
      menu = input.nextInt();

      if (menu == 1) {
        // Customer customer1 = new Customer();

        System.out.println();
        System.out.println("1. Tambah data pelanggan");
        System.out.println("2. Ubah data pelanggan");
        System.out.println("2. Cari data peLanggan");
      
      } else if (menu == 2) {
        // Item item1 = new Item();

        System.out.println();
        System.out.println("1. Tambah data barang");
        System.out.println("2. Ubah data barang");
        System.out.println("2. Cari barang");
      
      } else if (menu == 3) {
        // Method method1 = new Method();

        System.out.println();
        System.out.println("1. Pilih metode pembayaran");
        System.out.println("2. Ubah metode pembayaran");
      
      } else if (menu == 4) {
        // Invoice invoice1 = new Invoice();
        System.out.println();
        System.out.println("1. Masukkan invoice");
        System.out.println("2. Urutkan nominal hutang");
        System.out.println("3. Urutkan tempo hutang");
        System.out.println("4. Ubah status pembayaran");

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
