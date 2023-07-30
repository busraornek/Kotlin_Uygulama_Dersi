package com.busraornek.myapplication.hafta1.ders2.soru2

fun main() {

    val muzikDersi = MuzikDersi()

    val gitar:MuzikAleti = Gitar()

    val piyano:MuzikAleti = Piyano()

    muzikDersi.muzikCal(gitar)

    muzikDersi.muzikCal(piyano)
}