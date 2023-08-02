package com.busraornek.myapplication.hafta2.ders2

fun main(){
    val hash = hashSetOf<Int>(1,2,3,4,5)
    val hashSet2 = hashSetOf<Int>()

    println(elemanAktarimi(hash,hashSet2))
}



fun <T>elemanAktarimi(hash:HashSet<T>,hashSet2:HashSet<T>): HashSet<T> {
   hashSet2.addAll(hash)
    return hashSet2
}