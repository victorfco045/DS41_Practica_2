package mx.edu.a22311091.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val dado = dado()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numdado = findViewById<EditText>(R.id.editTextNumberDecimal)
        val cara = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val btntirar = findViewById<Button>(R.id.button)
        val total = findViewById<TextView>(R.id.result)

        btntirar.setOnClickListener {
            val cantdado = numdado.text.toString().toIntOrNull()
            val cantcaras = cara.text.toString().toIntOrNull()

            if (cantdado != null && cantcaras != null && cantdado > 0 && cantcaras > 0) {
                val resultadofinal = dado.numcaras(cantcaras, cantdado)
                total.text = "Total: $resultadofinal"
            } else {
                total.text = "No ingresaste una cantidad válida"
            }
        }


    }

}





