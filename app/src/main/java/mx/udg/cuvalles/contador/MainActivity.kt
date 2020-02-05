package mx.udg.cuvalles.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contador = 0
        etiquetaMostrar.text = "$contador"

        btnIncrementar.setOnClickListener {
            contador ++
            etiquetaMostrar.text = "$contador"
        }

    }
}
