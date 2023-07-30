package com.busraornek.myapplication.hafta1.ders2

import java.util.ArrayList
import java.util.Scanner

fun main(){

    val numbers = ArrayList<Int>()

    val input = Scanner(System.`in`)

    for(i in 1..5){
        println("Ekrana bir sayı giriniz:")
        val number = input.nextInt()
        if(number != null){
            numbers.add(number)
        }else{
            println("Lütfen sayı giriniz!!")
        }


    }
    fun toplam(numbers:ArrayList<Int>):Int{
        var top = 0
        for(number in numbers){
            top += number
        }
        return top
    }

    val toplam = toplam(numbers)
    println("Girilen sayıların toplamı = $toplam ")

}