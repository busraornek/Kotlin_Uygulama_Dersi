package com.busraornek.myapplication.hafta2.ders2

fun main(){
  val hashSet1 = hashSetOf(1,2,3,4,5,6)
   val eleman1 = 1
        println(hashSetElemanlari(hashSet1,eleman1))


}

fun <T> hashSetElemanlari(hashSet:HashSet<T>,eleman :T):Boolean{
    return hashSet.contains(eleman)
}