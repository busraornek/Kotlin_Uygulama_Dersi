package com.busraornek.myapplication.hafta2.ders2.soru4

class Dikdortgen:Shape {
    val uzunKenar = 5
    val kisaKenar = 6
    override fun alan() {
        val alan = uzunKenar * kisaKenar
        println("Dikdörtgenin alanı : $alan")
    }
}