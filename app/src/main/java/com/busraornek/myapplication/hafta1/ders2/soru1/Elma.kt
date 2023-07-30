package com.busraornek.myapplication.hafta1.ders2.soru1

class Elma(adi:String, tatlilikDerecesi:String , val vitaminDegeri:String):Meyve(adi,tatlilikDerecesi) {

    fun vitaminDegeri(){
        println("Meyvenin vitaminleri: $vitaminDegeri ")

    }

    fun yiyebilir() {
        println("$adi yenebilir.")
    }


}