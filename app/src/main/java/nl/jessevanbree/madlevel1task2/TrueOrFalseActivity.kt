package nl.jessevanbree.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import nl.jessevanbree.madlevel1task2.databinding.ActivityTrueOrFalseBinding

class TrueOrFalseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTrueOrFalseBinding
    private var inputTT: String = ""
    private var inputTF: String = ""
    private var inputFT: String = ""
    private var inputFF: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrueOrFalseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    fun initViews() {
        binding.submit.setOnClickListener { onSubmit() }
        binding.inputTT.addTextChangedListener(textWatcher)
        binding.inputTF.addTextChangedListener(textWatcher)
        binding.inputFT.addTextChangedListener(textWatcher)
        binding.inputFF.addTextChangedListener(textWatcher)
    }

    fun onSubmit() {
        var toastString: String = if (checkAnswers()) getString(R.string.correct) else getString(R.string.incorrect)
        Toast.makeText(applicationContext, toastString, Toast.LENGTH_SHORT).show()
    }

    fun checkAnswers(): Boolean {
        return inputTT == "T" && inputTF == "F" && inputFT == "F" && inputFF == "F"
    }

    private val textWatcher = object: TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            when (editable) {
                binding.inputTT.editableText -> {
                    inputTT = editable.toString()
                }
                binding.inputTF.editableText -> {
                    inputTF = editable.toString()
                }
                binding.inputFT.editableText -> {
                    inputFT = editable.toString()
                }
                binding.inputFF.editableText -> {
                    inputFF = editable.toString()
                }
            }
        }
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    }
}