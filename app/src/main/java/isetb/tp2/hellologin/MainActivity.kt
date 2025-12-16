package isetb.tp2.hellologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        welcomeText.text = "Welcome to Troc App!"

        logoutButton.setOnClickListener {
            val intent = Intent(this, ConnectionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
