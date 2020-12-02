import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String mulai = "y";
    int menu, submenu;

    List<Customer> dCustomer = new ArrayList<Customer>();
    // List<Item> dItem = new ArrayList<Item>();
    // List<Method> dMethod = new ArrayList<Method>();
    // List<Invoice> dInvoice = new ArrayList<Invoice>();

    Customer cs1 = new Customer(1,"udin","palembang","082280847476");
    Customer cs2 = new Customer(2,"ujang","palembang","082280847477");

    dCustomer.add(cs1); //urutan 0
    dCustomer.add(cs2); //urutan 1

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
        System.out.println("4. Tampil data pelanggan");

        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data pelanggan
          // System.out.println("panggil fungsi tambah data pelanggan");
          // System.out.println();

          AddCustomer(dCustomer, input);
          System.out.println();
          GetCustomer(dCustomer);



        } else if (submenu == 2) {
          // panggil fungsi ubah data pelanggan
          // System.out.println("panggil fungsi ubah data pelanggan");
          UpdateCustomer(dCustomer, input);

        } else if (submenu == 3) {
          // panggil fungsi cari data pelanggan
          System.out.println("panggil fungsi cari data pelanggan");

        } else if (submenu == 4) {
          // panggil fungsi tampil data pelanggan
          // System.out.println("panggil fungsi tampil data pelanggan");
          System.out.println();
          GetCustomer(dCustomer);

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

  // CRUD Customer

  public static void AddCustomer(List<Customer> dCustomer, Scanner input) {
    int id;
    String nama_pelanggan, alamat_pelanggan, no_hp;

    System.out.println("------------------------------------");
    System.out.println("INPUT DATA PELANGGAN");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID : ");
    id = input.nextInt();

    System.out.print("NAMA : ");
    nama_pelanggan = input.next();

    System.out.print("ALAMAT : ");
    alamat_pelanggan = input.next();

    System.out.print("HP : ");
    no_hp = input.next();

    Customer cs = new Customer(id,nama_pelanggan,alamat_pelanggan,no_hp);
    dCustomer.add(cs);

    System.out.println();
    System.out.println("Data berhasil diinput");

  }

  public static void GetCustomer(List<Customer> dCustomer) {
    System.out.println();

    for (int i=0; i<dCustomer.size(); i++) {
      System.out.println();
      System.out.println("ID : "+dCustomer.get(i).id);
      System.out.println("NAMA : "+dCustomer.get(i).nama_pelanggan);
      System.out.println("ALAMAT : "+dCustomer.get(i).alamat_pelanggan);
      System.out.println("HP : "+dCustomer.get(i).no_hp);
      System.out.println();
    }
  }

  public static void UpdateCustomer(List<Customer> dCustomer, Scanner input) {
    int id;
    String nama_pelanggan, alamat_pelanggan, no_hp;


    System.out.println("------------------------------------");
    System.out.println("UPDATE DATA PELANGGAN");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID : ");
    id = input.nextInt();

    if ((dCustomer.size() < id) || dCustomer.get(id-1).id != id) {

      System.out.println();
      System.out.println("Data tidak ditemukan.");

    } else {

      System.out.print("NAMA BARU : ");
      nama_pelanggan = input.next();

      System.out.print("ALAMAT BARU : ");
      alamat_pelanggan = input.next();

      System.out.print("HP BARU: ");
      no_hp = input.next();

      Customer cs = new Customer(id,nama_pelanggan,alamat_pelanggan,no_hp);
      dCustomer.set(id-1,cs);

      System.out.println();
      System.out.println("Data berhasil diupdate");

    }


  }


}
