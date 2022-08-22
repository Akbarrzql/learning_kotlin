fun main() {
    println("Biodata Diri")
    println("============================")

    print("Masukan Nama Anda: ")
    val Nama = readLine()!!.toString()
    print("Masukan Alamat Anda: ")
    val Alamat = readLine()!!.toString()
    print("Masukan Tangal Dan Tempat Lahir Anda:" )
    val Ttl = readLine()!!.toString()
    print("Institusi Anda Sekarang: ")
    val Institusi = readLine()!!.toString()
    print("1. Benar ")
    println(" 2.Belum Yakin")
    println("Yakin Sudah Benar?")
    val yakin = readLine()!!.toString()

    when(yakin){
        "1" -> {
            println("Nama Anda Adalah = $Nama")
        println("Tempat Tanggal Lahir = $Ttl")
        println("Alamat = $Alamat")
        println("Institusi = $Institusi")}
        "2" ->{
            println("Silahkan Isi Ulang Dari Awal")
        }
        else -> {
            println("Terjadi Kesalahan, Silahkan Mengulang")
        }
    }
    println("====Biodata Selesai====")



}