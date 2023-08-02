package com.busraornek.myapplication.hafta2.ders2.soru5

class Mudur(override val bonus: Int, override val calisilanYil: Int) :Employee {


    override fun maasHesapla() {
        val maas = (5000 * calisilanYil) + bonus
       println("Müdürün maaşı: $maas")
    }
}