// Class Produk
class Produk(val nama: String, var harga: Double, var stok: Int) {

    // Fungsi untuk menampilkan detail produk
    fun tampilkanDetailProduk() {
        println("Nama Produk: $nama")
        println("Harga Produk: Rp. $harga")
        println("Stok Tersedia: $stok")
    }

    // Fungsi untuk mengurangi stok saat produk dibeli
    fun beliProduk(jumlah: Int) {
        if (stok >= jumlah) {
            stok -= jumlah
            println("$jumlah $nama berhasil dibeli.")
        } else {
            println("Stok tidak cukup!")
        }
    }
}

// Fungsi main
fun main() {
    // Membuat objek produk
    val produk1 = Produk("Laptop", 7000000.0, 10)

    // Menampilkan informasi produk
    produk1.tampilkanDetailProduk()

    // Simulasi pembelian produk
    produk1.beliProduk(3)

    // Menampilkan informasi produk setelah pembelian
    produk1.tampilkanDetailProduk()
}
