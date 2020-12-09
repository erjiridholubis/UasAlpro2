import java.util.*;

class Project_uas {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    String mulai = "y";
    int menu, submenu;

    System.out.println("=======================================================================");
    System.out.println("             MENGHITUNG PERKIRAAN KUMPULAN ABSEN MAHASISWA             ");
    System.out.println("=======================================================================");

    Mahasiswa muthia = new Mahasiswa("09011281924061","Muthia Fadhilah Ramadhan", "Alpro", new int[] { 1, 1, 1 });
    Mahasiswa titan = new Mahasiswa("09011281924062","Titaniah Astra Jingga", "Alpro", new int[] { 1, 1, 1 });
    Mahasiswa fachri = new Mahasiswa("09011281924063","Fachri Saragih", "Alpro", new int[] { 1, 1, 1 });
    Mahasiswa endy = new Mahasiswa("09011281924064","Endy Afri Wildanu", "Alpro", new int[] { 3, 2, 1 });
    Mahasiswa burhan = new Mahasiswa("09011281924065","Burhansyah Reza", "Alpro", new int[] { 1, 3, 2 });
    Mahasiswa budi = new Mahasiswa("09011281924066","Budi Doremi", "Alpro", new int[] { 1, 2, 1 });
    Mahasiswa farhan = new Mahasiswa("09011281924067","Farhan Hilman", "Alpro", new int[] { 1, 2, 1 });
    Mahasiswa gibran = new Mahasiswa("09011281924068","Gibran Saputra", "Alpro", new int[] { 1, 1, 2 });
    Mahasiswa sultan = new Mahasiswa("09011281924069","Sultan Alif", "Alpro", new int[] { 2, 1, 1 });
    Mahasiswa supriadi = new Mahasiswa("09011281924070","Supriadi", "Alpro", new int[] { 1, 2, 1 });
    Mahasiswa rizky = new Mahasiswa("09011281924071","Rizky Nazar", "Alpro", new int[] { 1, 1, 3 });
    Mahasiswa juang = new Mahasiswa("09011281924072","Juang Dwi Putra", "Alpro", new int[] { 1, 1, 1 });
    Mahasiswa dinda = new Mahasiswa("09011281924073","Dinda Hauw", "Alpro", new int[] { 1, 2, 1 });
    Mahasiswa mufra = new Mahasiswa("09011281924074","Mufra Saputri", "Alpro", new int[] { 2, 2, 1 });
    Mahasiswa namira = new Mahasiswa("09011281924075","Namira Alzera", "Alpro", new int[] { 3, 1, 1 });
    Mahasiswa soleh = new Mahasiswa("09011281924076","Soleh Nur Muhammad", "Alpro", new int[] { 1, 1, 1 });
    Mahasiswa putri = new Mahasiswa("09011281924077","Putri Shalsabila", "Alpro", new int[] { 1, 1, 2 });
    Mahasiswa todung = new Mahasiswa("09011281924078","Todung Ahmad", "Alpro", new int[] { 3, 2, 1 });
    Mahasiswa roki = new Mahasiswa("09011281924079","Roki Gustiansyah", "Alpro", new int[] { 2, 1, 1 });
    Mahasiswa nurul = new Mahasiswa("09011281924080","Nurul Aini", "Alpro", new int[] { 1, 1, 1 });

    Mahasiswa aisyah = new Mahasiswa("09011281924081","Aisyah Aqila", "SWN", new int[] { 1, 1, 1 });
    Mahasiswa natasya = new Mahasiswa("09011281924082","Natasya Wilona", "SWN", new int[] { 1, 3, 1 });
    Mahasiswa putra = new Mahasiswa("09011281924083","Putra Sulung", "SWN", new int[] { 1, 1, 1 });
    Mahasiswa erji = new Mahasiswa("09011281924084","Erji Ridho Lubis", "SWN", new int[] { 3, 1, 1 });
    Mahasiswa adelya = new Mahasiswa("09011281924085","Adelya Natasya", "SWN", new int[] { 1, 1, 2 });
    Mahasiswa amai = new Mahasiswa("09011281924086","Amailia", "SWN", new int[] { 1, 2, 2 });
    Mahasiswa pitri = new Mahasiswa("09011281924087","Pitria Putri Sari", "SWN", new int[] { 2, 2, 1 });
    Mahasiswa cindy = new Mahasiswa("09011281924088","Cindy Angelina", "SWN", new int[] { 2, 1, 2 });
    Mahasiswa fahmi = new Mahasiswa("09011281924089","Fahmi Ilham", "SWN", new int[] { 2, 1, 1 });
    Mahasiswa zeri = new Mahasiswa("09011281924090","Muhammad Zeri", "SWN", new int[] { 3, 2, 1 });
    Mahasiswa kiko = new Mahasiswa("09011281924091","Ahmad Kiko Bangsawan", "SWN", new int[] { 1, 1, 3 });
    Mahasiswa dandi = new Mahasiswa("09011281924092","Rahmad Dandi", "SWN", new int[] { 2, 1, 1 });
    Mahasiswa agdil = new Mahasiswa("09011281924093","Agdil Risyatala", "SWN", new int[] { 2, 2, 1 });
    Mahasiswa reny = new Mahasiswa("09011281924094","Reni Anggriani", "SWN", new int[] { 2, 1, 1 });
    Mahasiswa momo = new Mahasiswa("09011281924095","Molina Tata", "SWN", new int[] { 3, 2, 1 });
    Mahasiswa luluk = new Mahasiswa("09011281924096","Luthfia Unigha", "SWN", new int[] { 1, 1, 2 });
    Mahasiswa winda = new Mahasiswa("09011281924097","Winda Pratiwi", "SWN", new int[] { 1, 2, 2 });
    Mahasiswa dwi = new Mahasiswa("09011281924098","Dwi Prasetiya", "SWN", new int[] { 1, 2, 1 });
    Mahasiswa vira = new Mahasiswa("09011281924099","Vira Triasyah", "SWN", new int[] { 2, 2, 1 });
    Mahasiswa guli = new Mahasiswa("090112819240100","Guli Saputri", "SWN", new int[] { 3, 1, 1 });

    String cari;
    Mahasiswa kumpulan_mahasiswa[] = { 
      muthia, titan, fachri, endy, burhan, budi, farhan, gibran, sultan, supriadi,
        rizky, juang, dinda, mufra, namira, soleh, putri, todung, roki, nurul, aisyah, natasya, putra, erji, adelya,
        amai, pitri, cindy, fahmi, zeri, kiko, dandi, agdil, reny, momo, luluk, winda, dwi, vira, guli,
         };
    printMahasiswa(kumpulan_mahasiswa);

    System.out.println("============================================================================");
    
    while (mulai.equals("y")) {
      System.out.println();

      System.out.println("Pilihan Menu:");
      System.out.println("1. Cari Mahasiswa");
      System.out.println("2. Tampil mahasiswa paling rajin");
      System.out.println("3. Keluar");

      System.out.println();
      System.out.print("Silahkan Pilih Menu : ");
      menu = in.nextInt();
      System.out.println("-------------------------------------------");

      if(menu == 1) {
        System.out.print("Cari mahasiswa [nim]: ");
        cari = in.next();
        cariMahasiswa(kumpulan_mahasiswa, cari);
      } else if(menu == 2) {
        urutMahasiswa(kumpulan_mahasiswa);
      } else if(menu == 3) {
        System.out.println("Terima kasih");
        System.exit(0);
      } else {
        System.out.println("Menu yang dipilih tidak tersedia");
      }

      System.out.println("\n==========================================");
      System.out.print("Apakah ingin mengulangi program (y/n) ? ");
      mulai = in.next();
      System.out.println("==========================================");

    }System.out.println("Terima kasih, program dihentikan");

  }

  public static void printMahasiswa(Mahasiswa kumpulan_mahasiswa[]) {

    for (int i = 0; i < kumpulan_mahasiswa.length; i++) {
      System.out.println("Nim:" + kumpulan_mahasiswa[i].nim);
      System.out.println("Nama:" + kumpulan_mahasiswa[i].nama);
      System.out.println("Mata Pelajaran:" + kumpulan_mahasiswa[i].mata_pelajaran);
      System.out.println("Hadir:" + kumpulan_mahasiswa[i].kehadiran[0]);
      System.out.println("Telat:" + kumpulan_mahasiswa[i].kehadiran[1]);
      System.out.println("Alfa:" + kumpulan_mahasiswa[i].kehadiran[2]);
      System.out.println();
    }
  }

  public static void cariMahasiswa(Mahasiswa kumpulan_mahasiswa[], String cari) {
    cari = cari.toLowerCase();
    for (int i = 0; i < kumpulan_mahasiswa.length; i++) {
      if (kumpulan_mahasiswa[i].nim.toLowerCase().equals(cari)) {
        System.out.println("Nim:" + kumpulan_mahasiswa[i].nim);
        System.out.println("Nama:" + kumpulan_mahasiswa[i].nama);
        System.out.println("Mata Pelajaran:" + kumpulan_mahasiswa[i].mata_pelajaran);
        System.out.println("Hadir:" + kumpulan_mahasiswa[i].kehadiran[0]);
        System.out.println("Telat:" + kumpulan_mahasiswa[i].kehadiran[1]);
        System.out.println("Alfa:" + kumpulan_mahasiswa[i].kehadiran[2]);

        System.out.println("=======================================================");
        System.out.println("Akumulasi");
        System.out.println("Hadir : "+ kumpulan_mahasiswa[i].kehadiran[0]*2);
        System.out.println("Telat : "+ kumpulan_mahasiswa[i].kehadiran[1]*1);
        System.out.println("Alfa : "+ kumpulan_mahasiswa[i].kehadiran[2]*0);
        
        System.out.println();
      } 
    }
  }

  public static void urutMahasiswa(Mahasiswa kumpulan_mahasiswa[]) {
    int key[] = new int[kumpulan_mahasiswa.length-1];
    int tmp;

    for (int i = 0; i < key.length; i++) {
      key[i] = kumpulan_mahasiswa[i].kehadiran[0];
    }

    for (int i = 0; i < key.length; i++) {
      for (int j = (key.length - 1); j > i; j--) {
        if (key[j] > key[j - 1]) {
            tmp = key[j];
            key[j] = key[j - 1];
            key[j - 1] = tmp;
        }
      }
    }

    for(int i=0; i<kumpulan_mahasiswa.length-1; i++) {
      System.out.println("Nim:" + kumpulan_mahasiswa[key[i]-1].nim);
      System.out.println("Nama:" + kumpulan_mahasiswa[key[i] - 1].nama);
      System.out.println("Mata Pelajaran:" + kumpulan_mahasiswa[key[i]-1].mata_pelajaran);
      System.out.println("Hadir:" + kumpulan_mahasiswa[key[i]-1].kehadiran[0]);
      System.out.println("Telat:" + kumpulan_mahasiswa[key[i]-1].kehadiran[1]);
      System.out.println("Alfa:" + kumpulan_mahasiswa[key[i] - 1].kehadiran[2]);

      System.out.println("=======================================================");
      System.out.println("Akumulasi");
      System.out.println("Hadir : " + kumpulan_mahasiswa[key[i] - 1].kehadiran[0] * 2);
      System.out.println("Telat : " + kumpulan_mahasiswa[key[i]-1].kehadiran[1] * 1);
      System.out.println("Alfa : " + kumpulan_mahasiswa[key[i] - 1].kehadiran[2] * 0);

      System.out.println();
    }
        
  }

}


class Mahasiswa {
  String nim;
  String nama;
  String mata_pelajaran;
  int kehadiran[] = new int[3];

  public Mahasiswa(String nim, String nama_mahasiswa, String mata_pelajaran_mahasiswa, int kehadiran_mahasiswa[]) {
    this.nim = nim;
    this.nama = nama_mahasiswa;
    this.mata_pelajaran = mata_pelajaran_mahasiswa;
    this.kehadiran = kehadiran_mahasiswa;
  }
}