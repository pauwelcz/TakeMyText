package cz.muni.takemytext.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.muni.takemytext.R

class DetailActiviry : AppCompatActivity() {

    // musime pouze onCreate s Bunle?, protoze jsou tam dve
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_2)

        val fragment = DetalFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById<TextView>(R.id.my_text_view)
        textView.setText(R.string.title)
    }*/
}