package com.busraornek.myapplication.hafta2.ders1

fun main(){
    val hashMab = hashMapOf("a" to 10,"b" to 12 ,"c" to 45, "d" to 5)
    println(toplamDegerleriTopla(hashMab))
}

fun toplamDegerleriTopla(deger:HashMap<String,Int>):Int{
    var toplam = 0
    for(i in deger.values){
        toplam += i
    }
    return toplam
}
