package com.busraornek.myapplication.hafta1.ders1

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val random = Random.nextInt(1, 51)
    var tahminHakki = 3

    val girdi = Scanner(System.`in`)

    println("1 ile 50 arasındaki bir sayı tahmin ediniz.Toplam 3 hakkınız var.")

    while(tahminHakki > 0){
        print("Tahmininiz: ")
        val tahmin = girdi.nextInt()
        if(tahmin == null){
            println("Geçersiz bir sayı girdiniz. Bir sayı giriniz.")
            continue
        }
        if(tahmin == random){
            println("Tebrikler doğru tahmin ettiniz.")
            break
        }else{
            println("Sayıyı bulamadınız tekrar deneyiniz.Kalan hakkınız: ${tahminHakki -1} ")

        }
        tahminHakki --

    }
}