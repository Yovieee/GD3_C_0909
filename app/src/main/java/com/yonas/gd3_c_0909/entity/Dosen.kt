package com.yonas.gd3_c_0909.entity

class Dosen(var name: String, var pengajar: String) {
    companion object{
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fedelis Brian", "Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C")
        )
    }
}