package com.busraornek.myapplication.hafta2.ders2.soru5

class Memur(override val calisilanYil: Int, override val bonus: Int) :Employee {

        override fun maasHesapla() {
            val maas = (3000 * calisilanYil) + bonus
            println("Memur maaşı: $maas")
        }


}