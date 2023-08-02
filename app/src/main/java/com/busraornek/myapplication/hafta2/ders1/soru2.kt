package com.busraornek.myapplication.hafta2.ders1

fun tekSayilarYazma(liste:List<Int>):List<Int> {
    return liste.filter{ it % 2 != 0}
}

fun main(){
    val liste = listOf(1,2,3,4,5,6,7,8,9,10)

    val tekSayilar = tekSayilarYazma(liste)
    println(tekSayilar)




}