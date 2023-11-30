package mx.edu.a22311091.dados

import kotlin.random.Random

class dado() {
    fun numcaras(caras: Int, dados: Int): Int {
        var totalcaras = 0
        for (i in 1..dados) {
            totalcaras +=  Random.nextInt(1, caras + 1)
        }
        return totalcaras
    }




}
