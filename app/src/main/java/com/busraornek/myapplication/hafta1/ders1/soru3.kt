package com.busraornek.myapplication.hafta1.ders1

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    println("Notunuzu giriniz: ")
    val not = girdi.nextInt()

    if(not >= 70){
        println("Dersten geçtiniz.")
    }else{
        println("Dersten kaldınız")
    }
}