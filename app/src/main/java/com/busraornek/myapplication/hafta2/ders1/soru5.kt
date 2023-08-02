package com.busraornek.myapplication.hafta2.ders1

fun tekrarEdenLeriBulma(liste:List<Int>):HashSet<Int>{
    val tekrarEdenler = HashSet<Int>()
    val geciciSet = HashSet<Int>()

    for(eleman in liste){
        if(!geciciSet.add(eleman)){
            tekrarEdenler.add(eleman)
        }
    }
    return tekrarEdenler
}
fun main(){
    val liste = listOf(1,2,3,4,2,1,4,2,5,7,4,6,4,8,4,8,5,4)

    val tekrarEdeneElemanlar = tekrarEdenLeriBulma(liste)
    println(tekrarEdeneElemanlar)
}