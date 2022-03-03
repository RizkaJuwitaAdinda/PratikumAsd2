package pertemuan2;

public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Boneka";
        b1.jenisBarang = "spons";
        b1.hargaSatuan = 40000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        Barang b2 = new Barang("Baju", "Bando", 25, 45000);
        b2.tampilBarang();
    }

}