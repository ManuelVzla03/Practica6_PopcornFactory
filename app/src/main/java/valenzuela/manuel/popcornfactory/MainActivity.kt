package valenzuela.manuel.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById<Button>(R.id.botonP)

        btn.setOnClickListener{
            var intent: Intent = Intent(this, catalogo::class.java)
            startActivity(intent)
        }
    }
}