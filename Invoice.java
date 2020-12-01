class Invoice {

  int invoice;
  int[] id_barang = new int[3];
  int id_pelanggan;
  int id_metode;
  String tempo;
  int total;
  String status;

  public Invoice(int invoice, int[] id_barang, int id_pelanggan, int id_metode, String tempo, int total, String status ) {
    this.invoice = invoice;
    // this.id_barang =
    this.id_pelanggan = id_pelanggan;
    this.id_metode = id_metode;
    this.tempo = tempo;
    this.total = total;
    this.status = status;
  }

}
