import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String mulai = "y";
    int menu, submenu;

    List<Customer> dCustomer = new ArrayList<Customer>();
    List<Item> dItem = new ArrayList<Item>();
    List<Method> dMethod = new ArrayList<Method>();
    List<Invoice> dInvoice = new ArrayList<Invoice>();

    // Random randomNumbers = new Random();
    //
    // System.out.println(randomNumbers.nextInt());
    // System.out.println(dInvoice.size()+1);

    while (mulai.equals("y")) {
      System.out.println("=====Aplikasi Catatan Hutang=====");
      System.out.println();

      System.out.println("Pilihan Menu:");
      System.out.println("1. pelanggan");
      System.out.println("2. Barang");
      System.out.println("3. Metode Pembayaran");
      System.out.println("4. Tagihan");
      System.out.println("5. Keluar");

      System.out.println();
      System.out.print("Silahkan Pilih Menu : ");
      menu = input.nextInt();
      System.out.println("-------------------------------------------");

      if (menu == 1) {
        System.out.println();

        System.out.println(">> Menu Pelanggan");
        System.out.println("1. Tambah data pelanggan");
        System.out.println("2. Ubah data pelanggan");
        System.out.println("3. Cari data pelanggan");
        System.out.println("4. Tampil data pelanggan");

        System.out.println();
        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data pelanggan

          System.out.println();
          AddCustomer(dCustomer, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 2) {
          // panggil fungsi ubah data pelanggan

          System.out.println();
          UpdateCustomer(dCustomer, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 3) {
          // panggil fungsi cari data pelanggan

          System.out.println();
          SearchCustomer(dCustomer, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 4) {
          // panggil fungsi tampil data pelanggan

          System.out.println("-------------------------------------------");
          GetCustomer(dCustomer);

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 2) {
        System.out.println();

        System.out.println(">> Menu Barang");
        System.out.println("1. Tambah data barang");
        System.out.println("2. Ubah data barang");
        System.out.println("3. Cari barang");
        System.out.println("4. Tampil data barang");

        System.out.println();
        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data barang

          System.out.println();
          AddItem(dItem, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 2) {
          // panggil fungsi ubah data barang

          System.out.println();
          UpdateCustomer(dCustomer, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 3) {
          // panggil fungsi cari data barang

          System.out.println();
          SearchItem(dItem, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 4) {
          // panggil fungsi cari data barang

          System.out.println("-------------------------------------------");
          GetItem(dItem);

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 3) {
        System.out.println();

        System.out.println(">> Menu Metode Pembayaran");
        System.out.println("1. Tambah metode pembayaran");
        System.out.println("2. Ubah metode pembayaran");
        System.out.println("3. Lihat Seluruh Metode Pembayaran");

        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data pembayaran

          System.out.println();
          AddMethod(dMethod, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 2) {
          // panggil fungsi ubah data pembayaran

          System.out.println();
          UpdateMethod(dMethod, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 3) {
          // panggil fungsi lihat data pembayaran

          System.out.println("-------------------------------------------");
          GetMethod(dMethod);

        } else {
          System.out.println("Maaf, pilihan tidak tersedia.");
          mulai = "y";

        }

      } else if (menu == 4) {
        System.out.println();

        System.out.println(">> Menu Tagihan");
        System.out.println("1. Masukkan invoice");
        System.out.println("2. Urutkan nominal hutang");
        System.out.println("3. Urutkan tempo hutang");
        System.out.println("4. Ubah status pembayaran");
        System.out.println("5. Cari Invoice");

        System.out.println();
        System.out.print("Silahkan Pilih Submenu : ");
        submenu = input.nextInt();

        if (submenu == 1) {
          // panggil fungsi tambah data tagihan

          System.out.println();
          AddInvoice(dInvoice, dCustomer, dItem, dMethod, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 2) {
          // panggil fungsi urutan data tagihan berdasarkan nominal
          System.out.println();
          System.out.println("panggil fungsi urutan data tagihan berdasarkan nominal");
          System.out.println("-------------------------------------------");

        } else if (submenu == 3) {
          // panggil fungsi urutan data tagihan berdasarkan tempo
          System.out.println();
          System.out.println("panggil fungsi urutan data tagihan berdasarkan tempo");
          System.out.println("-------------------------------------------");

        } else if (submenu == 4) {
          // panggil fungsi ubah status pembayaran

          System.out.println();
          UpdateInvoice(dInvoice, dCustomer, dItem, dMethod, input);
          System.out.println("-------------------------------------------");

        } else if (submenu == 5) {
          // panggil fungsi cari invoice

          System.out.println("-------------------------------------------");
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

    // System.out.print("ID : ");
    // id = input.nextInt();
    id = dCustomer.size()+1;

    System.out.print("NAMA : ");
    nama_pelanggan = input.next();

    System.out.print("ALAMAT : ");
    alamat_pelanggan = input.next();

    System.out.print("HP : ");
    no_hp = input.next();

    Customer cs = new Customer(id, nama_pelanggan, alamat_pelanggan, no_hp);
    dCustomer.add(cs);

    System.out.println();
    System.out.println("Data berhasil diinput");

  }

  public static void GetCustomer(List<Customer> dCustomer) {
    System.out.println();

    if (dCustomer.size() > 0) {
      for (int i = 0; i < dCustomer.size(); i++) {
        System.out.println();
        System.out.println("ID : " + dCustomer.get(i).id);
        System.out.println("NAMA : " + dCustomer.get(i).nama_pelanggan);
        System.out.println("ALAMAT : " + dCustomer.get(i).alamat_pelanggan);
        System.out.println("HP : " + dCustomer.get(i).no_hp);
        System.out.println();
      }
    } else {
      System.out.println();
      System.out.println("Data belum tersedia, silahkan inputkan data.");
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

    if ((dCustomer.size() < id) || dCustomer.get(id - 1).id != id) {

      System.out.println();
      System.out.println("Data tidak ditemukan.");

    } else {

      System.out.print("NAMA BARU : ");
      nama_pelanggan = input.next();

      System.out.print("ALAMAT BARU : ");
      alamat_pelanggan = input.next();

      System.out.print("HP BARU: ");
      no_hp = input.next();

      Customer cs = new Customer(id, nama_pelanggan, alamat_pelanggan, no_hp);
      dCustomer.set(id - 1, cs);

      System.out.println();
      System.out.println("Data berhasil diupdate");

    }

  }

  public static void SearchCustomer(List<Customer> dCustomer, Scanner input) {
    int id, harga, stok;
    String nama_barang;

    System.out.println("------------------------------------");
    System.out.println("PENCARIAN DATA CUSTOMER");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID CUSTOMER : ");
    id = input.nextInt();

    if ((dCustomer.size() < id) || dCustomer.get(id-1).id != id) {
      System.out.println();
      System.out.println("Data Customer tidak ditemukan.");

    } else {
      System.out.println("Data Customer ditemukan");
      System.out.println();
      System.out.println("ID : " + dCustomer.get(id-1).id);
      System.out.println("NAMA : " + dCustomer.get(id-1).nama_pelanggan);
      System.out.println("ALAMAT : " + dCustomer.get(id-1).alamat_pelanggan);
      System.out.println("HP : " + dCustomer.get(id-1).no_hp);
      System.out.println();
    }

  }

  // CRUD ITEM
  public static void AddItem(List<Item> dItem, Scanner input) {
    int id, harga, stok;
    String nama_barang;

    System.out.println("------------------------------------");
    System.out.println("INPUT DATA BARANG");
    System.out.println("------------------------------------");
    System.out.println();

    // System.out.print("ID : ");
    // id = input.nextInt();
    id = dItem.size()+1;

    System.out.print("NAMA BARANG : ");
    nama_barang = input.next();

    System.out.print("HARGA : ");
    harga = input.nextInt();

    System.out.print("STOK : ");
    stok = input.nextInt();

    Item it = new Item(id, nama_barang, harga, stok);
    dItem.add(it);

    System.out.println();
    System.out.println("Data barang berhasil diinput");

  }

  public static void GetItem(List<Item> dItem) {
    System.out.println();

    if (dItem.size() > 0) {

      for (int i = 0; i < dItem.size(); i++) {
        System.out.println();
        System.out.println("ID : " + dItem.get(i).id);
        System.out.println("NAMA BARANG : " + dItem.get(i).nama_barang);
        System.out.println("HARGA : " + dItem.get(i).harga);
        System.out.println("STOK : " + dItem.get(i).stok);
        System.out.println();
      }
    }  else {
      System.out.println();
      System.out.println("Data belum tersedia, silahkan inputkan data.");
    }
  }

  public static void UpdateItem(List<Item> dItem, Scanner input) {
    int id, harga, stok;
    String nama_barang;

    System.out.println("------------------------------------");
    System.out.println("UPDATE DATA BARANG");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID BARANG : ");
    id = input.nextInt();

    if ((dItem.size() < id) || dItem.get(id - 1).id != id) {
      System.out.println();
      System.out.println("Data barang tidak ditemukan.");

    } else {
      System.out.print("NAMA BARANG BARU: ");
      nama_barang = input.next();

      System.out.print("HARGA BARANG BARU: ");
      harga = input.nextInt();

      System.out.print("STOK BARANG BARU: ");
      stok = input.nextInt();

      Item it = new Item(id, nama_barang, harga, stok);
      dItem.set(id - 1, it);
    }

  }

  public static void SearchItem(List<Item> dItem, Scanner input) {
    int id, harga, stok;
    String nama_barang;

    System.out.println("------------------------------------");
    System.out.println("PENCARIAN DATA BARANG");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID BARANG : ");
    id = input.nextInt();

    if ((dItem.size() < id) || dItem.get(id-1).id != id) {
      System.out.println();
      System.out.println("Data barang tidak ditemukan.");

    } else {
      System.out.println("Data barang ditemukan");
      System.out.println();
      System.out.println("ID : " + dItem.get(id-1).id);
      System.out.println("NAMA BARANG : " + dItem.get(id-1).nama_barang);
      System.out.println("HARGA : " + dItem.get(id-1).harga);
      System.out.println("STOK : " + dItem.get(id-1).stok);
      System.out.println();
    }

  }

  // CRUD  METHOD
  public static void AddMethod(List<Method> dMethod, Scanner input) {
    int id;
    String nama_metode, rekening;

    System.out.println("------------------------------------");
    System.out.println("INPUT METODE PEMBAYARAN");
    System.out.println("------------------------------------");
    System.out.println();

    // System.out.print("ID : ");
    // id = input.nextInt();
    id = dMethod.size()+1;

    System.out.print("NAMA METODE PEMBAYARAN : ");
    nama_metode = input.next();

    System.out.print("REKENING : ");
    rekening = input.next();

    Method mt = new Method(id, nama_metode, rekening);
    dMethod.add(mt);

    System.out.println();
    System.out.println("Metode pembayaran berhasil diinput.");

  }

  public static void GetMethod(List<Method> dMethod) {
    System.out.println();

    if (dMethod.size() > 0) {


      for (int i = 0; i < dMethod.size(); i++) {
        System.out.println();
        System.out.println("ID : " + dMethod.get(i).id);
        System.out.println("NAMA METODE PEMBAYRAN : " + dMethod.get(i).nama_metode);
        System.out.println("REKENING : " + dMethod.get(i).rekening);
        System.out.println();
      }
    }  else {
      System.out.println();
      System.out.println("Data belum tersedia, silahkan inputkan data.");
    }

  }

  public static void UpdateMethod(List<Method> dmMethod, Scanner input) {
    int id;
    String nama_metode, rekening;

    System.out.println("------------------------------------");
    System.out.println("UPDATE METODE PEMBAYARAN");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("ID : ");
    id = input.nextInt();

    if ((dmMethod.size() < id) || dmMethod.get(id - 1).id != id) {
      System.out.println();
      System.out.println("Data metode pembayaran tidak ditemukan.");

    } else {
      System.out.print("NAMA METODE PEMBAYARAN: ");
      nama_metode = input.next();

      System.out.print("REKENING BARU: ");
      rekening = input.next();

      Method mt = new Method(id, nama_metode, rekening);
      dmMethod.set(id - 1, mt);
    }

  }

  // CRUD INVOICE
  public static void AddInvoice(List<Invoice> dInvoice, List<Customer> dCustomer, List<Item> dItem, List<Method> dMethod, Scanner input) {
    int invoice;
    int[] id_barang = new int[3];
    int id_pelanggan;
    int id_metode;
    String tempo;
    int total;
    String status;

    System.out.println("------------------------------------");
    System.out.println("INPUT INVOICE");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.println("Note* : Invoice dalam bentuk angka dan otomatis terupdate");
    System.out.println();

    // System.out.print("INVOICE : ");
    // invoice= input.nextInt();

    invoice = dInvoice.size()+1;

    System.out.print("ID PELANGGAN : ");
    id_pelanggan = input.nextInt();

    // System.out.println();
    // System.out.print("Banyak barang diambil : ");
    // banyak = input.nextInt();

    // if (dItem.size() <= banyak) {
    // id_barang = new int[banyak];
    // } else {
    //   System.out.println("Maaf barang yang diambil melebihi banyak barang");
    // }

    System.out.println(">> Barang yang diambil ");
    System.out.println();
    for (int i=0; i<id_barang.length; i++) {
      System.out.print("   Barang ke-"+(i+1)+" : ");
      id_barang[i] = input.nextInt();
    }
    System.out.println();

    System.out.print("ID METODE PEMBAYARAN : ");
    id_metode = input.nextInt();

    System.out.print("TEMPO PEMBAYARAN : ");
    tempo = input.next();

    System.out.print("STATUS PEMBAYARAN : ");
    status = input.next();

    total = 0;
    for (int i=0; i<id_barang.length; i++) {
      total += dItem.get(id_barang[i]-1).harga;
      // System.out.println(dItem.get(id_barang[i]-1).harga);
    }
    // System.out.println(total);

    Invoice iv = new Invoice(invoice, id_barang, id_pelanggan, id_metode, tempo, total, status);
    dInvoice.add(iv);

    System.out.println();
    System.out.println("INVOICE BERHASIL");

  }

  public static void GetInvoice(List<Invoice> dInvoice ){
    System.out.println();

    if (dInvoice.size() > 0) {


      for (int i = 0; i < dInvoice.size(); i++) {
        System.out.println();
        System.out.println("INVOICE PEMBAYARAN : " + dInvoice.get(i).invoice);
        System.out.println("ID PELANGGAN : " + dInvoice.get(i).id_pelanggan);

        System.out.println(">> Barang yang diambil ");
        System.out.println();
        for (int j=0; i<dInvoice.get(i).id_barang.length; j++) {
          System.out.print("   Barang ke-"+(i+1)+" : "+dInvoice.get(i).id_barang[j]);
        }
        System.out.println();

        System.out.println("ID METODE PEMBAYARAN : " + dInvoice.get(i).id_metode);
        System.out.println("TEMPO PEMBAYARAN : " + dInvoice.get(i).tempo);
        System.out.println("TOTAL HARGA : RP." + dInvoice.get(i).total);
        System.out.println("STATUS PEMBAYARAN : " + dInvoice.get(i).status);
        System.out.println();
      }
    }  else {
      System.out.println();
      System.out.println("Data belum tersedia, silahkan inputkan data.");
    }

  }

  public static void UpdateInvoice(List<Invoice> dInvoice, List<Customer> dCustomer, List<Item> dItem, List<Method> dMethod, Scanner input) {
    int invoice;
    int[] id_barang = new int[3];
    int id_pelanggan;
    int id_metode;
    String tempo;
    int total;
    String status;

    System.out.println("------------------------------------");
    System.out.println("UPDATE DATA INVOICE");
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("INVOICE : ");
    invoice = input.nextInt();

    if ((dInvoice.size() < invoice) || dInvoice.get(invoice - 1).invoice != invoice) {
      System.out.println();
      System.out.println("Data metode pembayaran tidak ditemukan.");

    } else {
      System.out.print("ID PELANGGAN : ");
      id_pelanggan = input.nextInt();

      System.out.println(">> Barang yang diambil ");
      System.out.println();
      for (int i=0; i<id_barang.length; i++) {
        System.out.print("   Barang ke-"+(i+1)+" : ");
        id_barang[i] = input.nextInt();
      }
      System.out.println();

      System.out.print("ID METODE PEMBAYARAN : ");
      id_metode = input.nextInt();

      System.out.print("TEMPO PEMBAYARAN : ");
      tempo = input.next();

      System.out.print("STATUS PEMBAYARAN : ");
      status = input.next();

      total = 0;
      for (int i=0; i<id_barang.length; i++) {
        total += dItem.get(id_barang[i]-1).harga;
      }

      Invoice iv = new Invoice(invoice, id_barang, id_pelanggan, id_metode, tempo, total, status);
      dInvoice.set(invoice - 1, iv);
    }

  }

  public static void SortWithDate(List<Invoice> dInvoice, List<Customer> dCustomer, List<Item> dItem, List<Method> dMethod) {
    // int r = Integer.parseInt(d.replaceAll("/",""));
  }


}
