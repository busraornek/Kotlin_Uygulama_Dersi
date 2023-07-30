package com.busraornek.myapplication.hafta1.ders1

import java.util.Scanner


fun factorial(n:Int):Long{
    var sayi:Long = 1
    for(i in 1..n){
        sayi *= i

    }
    return sayi
}
fun main(){

    val input = Scanner(System.`in`)
    print("faktöriyel hesplamak istediğiniz bir sayı giriniz: ")
    val girdi = input.nextInt()
    if(girdi >= 0) {
        val result = factorial(girdi)
        println("$girdi ! = $result")
    }

}