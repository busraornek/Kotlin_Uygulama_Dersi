package com.busraornek.myapplication.hafta1.ders2.soru3

fun main(){

    val hayvan = HayvanBarinagi()

    val kedi:Hayvan = Kedi()
    val kopek:Hayvan = Kopek()

    hayvan.hayvanToplulugu(kedi)
    hayvan.hayvanToplulugu(kopek)
}