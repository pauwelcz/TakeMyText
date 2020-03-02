package cz.muni.takemytext.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import cz.muni.takemytext.R
import kotlinx.android.synthetic.main.fragment_detail.view.*

class DetalFragment: Fragment() {

    var text = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        view.title_edit_text.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                text = s.toString()
                Log.d("DETAIL_FRAGMENT", text)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

        val categoryArray = arrayOf("Doma", "Prace", "Skola", "Osobni")

        context?.let { context ->
            view.category_spinner.adapter = ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1,
                categoryArray)
        }

        view.save_button.setOnClickListener {
            Log.d("DETAIL_FRAGMENT","on button clicked ${text.length}")
        }
        return view
        // return super.onCreateView(inflater, container, savedInstanceState)
    }

}