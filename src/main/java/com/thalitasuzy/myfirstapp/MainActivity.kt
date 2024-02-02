package com.thalitasuzy.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.thalitasuzy.myfirstapp.databinding.ActivityMainBinding
import java.util.Objects

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_Calculate) {
            calculate()
        }

    }

    fun calculate() {
        if (isValid()) {
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()
            if (autonomy == 0f) {
                Toast.makeText(this, R.string.no_possible_div_zero, Toast.LENGTH_SHORT).show()
                binding.textResult.text = "R$0"
            } else {
                val totalValue = (price * distance) / autonomy
                binding.textResult.text = "R$ ${"%.2f"}".format(totalValue)
            }
        } else {
            Toast.makeText(this, R.string.validate_fill_all_fildes, Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValid(): Boolean {
        return (binding.editDistance.text.toString() != ""
                && binding.editPrice.text.toString() != ""
                && binding.editAutonomy.text.toString() != ""
                && binding.editAutonomy.text.toString().toFloat() != 0f)
    }

}