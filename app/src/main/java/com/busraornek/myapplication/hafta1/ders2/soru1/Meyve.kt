package com.busraornek.myapplication.hafta1.ders2.soru1

open class Meyve(val adi:String, val tatlilikDerecesi:String) {

    open fun bilgileriGoster(){

        println("Meyvenin adı: $adi , Meyvenin tatlılık derecesi 1-10 arasında: $tatlilikDerecesi")
    }


}