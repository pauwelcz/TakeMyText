<<<<<<< HEAD
package cz.muni.takemytext.ui
=======
package cz.muni.takemytext.ui.detail
>>>>>>> c07c717b0a696fcf1c4152f73038ebcf413f4065

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.muni.takemytext.R

<<<<<<< HEAD
class DetailActiviry : AppCompatActivity() {

    // musime pouze onCreate s Bunle?, protoze jsou tam dve
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_2)

        val fragment = DetalFragment()

=======
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_single_container)

        val fragment = DetailFragment()
>>>>>>> c07c717b0a696fcf1c4152f73038ebcf413f4065
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

<<<<<<< HEAD
    /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById<TextView>(R.id.my_text_view)
        textView.setText(R.string.title)
    }*/
=======
>>>>>>> c07c717b0a696fcf1c4152f73038ebcf413f4065
}