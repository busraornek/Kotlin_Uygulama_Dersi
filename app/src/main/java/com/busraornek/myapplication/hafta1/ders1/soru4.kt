package com.busraornek.myapplication.hafta1.ders1

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    print("Bir harf giriniz: ")
    val harf = girdi.next().lowercase()
    if (harf.length == 1 && harf in "abcdefghijklmnopqrstuvwxyz") {

        if (sesliHarh(harf[0])) {
            println("Girilen harf bir sesli harftir")
        } else {
            println("Girilen sayı bir sessiz harftır")
        }
    }else{
        println("Geçerli bir harf giriniz.")
    }
}

fun sesliHarh(char: Char):Boolean{
    val sesliHarfler = arrayOf('a', 'e','i','o','u','ü','ı','ö')
    return char in sesliHarfler
}