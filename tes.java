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

    // Customer cs3 = new Customer(1,"bujang","palembang","082280847476");

    // data
    dCustomer.add(cs1); //urutan 0
    dCustomer.add(cs2); //urutan 1
    // dCustomer.add(cs3); //urutan 2

    //update data urutan ke 1 menjadi data cs3
    // dCustomer.set(0, cs3);

    int id;
    String nama_pelanggan, alamat_pelanggan, no_hp;

    // int banyak;

    System.out.print("Masukkan ID data yang akan di update : ");
    id = input.nextInt();

    System.out.println("------------------------------------");
    System.out.println("INPUT DATA");
    System.out.println("------------------------------------");
    System.out.println();

    // System.out.print("ID : ");
    // id = input.nextInt();

    System.out.print("NAMA : ");
    nama_pelanggan = input.next();

    System.out.print("ALAMAT : ");
    alamat_pelanggan = input.next();

    System.out.print("HP : ");
    no_hp = input.next();

    Customer cs = new Customer(id,nama_pelanggan,alamat_pelanggan,no_hp);
    dCustomer.set(id-1, cs);

    // System.out.print("Banyak data yang akan diinput : ");
    // banyak = input.nextInt();
    //
    // for (int i=0; i<banyak; i++) {
    //   System.out.println("------------------------------------");
    //   System.out.println("INPUT DATA");
    //   System.out.println("------------------------------------");
    //   System.out.println();
    //
    //   System.out.print("ID : ");
    //   id = input.nextInt();
    //
    //   System.out.print("NAMA : ");
    //   nama_pelanggan = input.next();
    //
    //   System.out.print("ALAMAT : ");
    //   alamat_pelanggan = input.next();
    //
    //   System.out.print("HP : ");
    //   no_hp = input.next();
    //
    //   Customer cs = new Customer(id,nama_pelanggan,alamat_pelanggan,no_hp);
    //   dCustomer.add(cs);
    // }


    System.out.println("------------------------------------");
    System.out.println("Data berhasil ditambahkan");
    System.out.println("------------------------------------");
    System.out.println();
    System.out.println("------------------------------------");
    System.out.println("Data yang ada : ");
    System.out.println("------------------------------------");
    for (int i=0; i<dCustomer.size(); i++) {
      System.out.println();
      System.out.println("ID : "+dCustomer.get(i).id);
      System.out.println("NAMA : "+dCustomer.get(i).nama_pelanggan);
      System.out.println("ALAMAT : "+dCustomer.get(i).alamat_pelanggan);
      System.out.println("HP : "+dCustomer.get(i).no_hp);
      System.out.println();
    }


  }

}
