package com.example.konekdatabase

class ApiEndPoint {

    companion object {

        private val SERVER = "http://127.0.0.1/belajarkoding"
        val CREATE = SERVER+"create_fakultas.php"
        val READ = SERVER+"read_fakultas.php"
        val DELETE = SERVER+"fakultas_delete.php"
        val UPDATE = SERVER+"fakultas_update.php"

    }
}