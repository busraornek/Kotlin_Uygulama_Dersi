package com.busraornek.myapplication.hafta1.ders1

import java.util.Scanner

fun main (){

    val girdi = Scanner(System.`in`)
    println("Bir ay giriniz: ")
    val ay = girdi.next().toLowerCase()


    when(ay){
        "ocak","şubat", "aralık" -> println("Girdiğiniz ay kış mevsimine aittir.")
        "mart", "nisan", "mayıs" -> println("Girdiğiniz ay ilkbahar mevsimine aittir.")
        "haziran", "temmuz", "ağustos" -> println("Girdiğiniz ay yaz mevsimine aittir.")
        "eylül", "ekim", "kasım" -> println("Girdiğiniz ay sonbahar mevsimine aittir.")
        else -> println("Geçerli bir ay ismi giriniz.")

    }
}