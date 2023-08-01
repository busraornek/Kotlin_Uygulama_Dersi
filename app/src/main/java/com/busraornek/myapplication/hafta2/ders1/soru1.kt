package com.busraornek.myapplication.hafta2.ders1

fun main(){


    val sayilar = arrayListOf<Int>(3,4,5,6,2,6,25,854,24)
    var sum = 0
    for(i in sayilar){
        sum += i
    }
    println("Verilen Dizilerin toplamı : $sum")
}