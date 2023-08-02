package com.busraornek.myapplication.hafta2.ders2.soru4

import kotlin.math.PI

class Daire :Shape {
    val yariCap = 5

    override fun alan() {
        val alan = PI * yariCap * yariCap
        println("Dikdörtgenin alanı : $alan")
    }
}