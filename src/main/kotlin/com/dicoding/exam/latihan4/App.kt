/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan4

/**
 *  TODO
 *  Lengkapi inisialisasi fungsi dengan nilai kembalian Map di bawah ini dengan nilai key-value berikut:
 *
 *  key: type
 *  value: motorcycle
 *
 *  key: maxSpeed
 *  value: 230Km/s
 *
 *  key: maxTank
 *  value: 100Ltr
 *
 */
// Definisi fungsi "vehicle" yang mengembalikan sebuah Map<String, String>
 fun vehicle(): Map<String, String> {
    // Menginisialisasi Map dengan beberapa pasangan key-value
     return mapOf(
         "type" to "motorcycle", // Key "type" dengan value "motorcycle"
         "maxSpeed" to "230Km/s", // Key "maxSpeed" dengan value "230Km/s
         "maxTank" to "100Ltr"  // Key "maxTank" dengan value "100Ltr"
     )
 }
// Fungsi utama (entry point) program
fun main() {
    // Mencetak informasi dari Map "vehicle" ke layar dengan format yang rapi
    println("""
        My Map Result:
        ${vehicle()}
    """.trimIndent())
}

