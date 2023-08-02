package com.busraornek.myapplication.hafta2.ders1

fun birlestirVeSirala(liste1: List<Int>, liste2: List<Int>): List<Int> {
    val birlesikListe = liste1 + liste2
    return birlesikListe
}

fun main() {

    val liste1 = listOf(56, 61, 51, 37)
    val liste2 = listOf(2, 14, 65, 38)

    val sonuc = birlestirVeSirala(liste1, liste2)
    println(sonuc)
}
