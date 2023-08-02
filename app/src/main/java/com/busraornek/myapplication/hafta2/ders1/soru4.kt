package com.busraornek.myapplication.hafta2.ders1

fun tersCevir(liste:List<Int>): List<Int> {
    return liste.reversed()
}

fun main(){
    val liste = listOf(1,2,3,4,5,6,7,8,9)

    val tersListe = tersCevir(liste)
    println(tersListe)
}