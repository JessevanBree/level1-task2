package nl.jessevanbree.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import nl.jessevanbree.madlevel1task2.databinding.ActivityTrueOrFalseBinding

class TrueOrFalseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTrueOrFalseBinding
    private var inputFF: String = "test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrueOrFalseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun initViews() {
        binding.submit.setOnClickListener { onSubmit() }
        binding.inputFF.textWa
    }

    fun onSubmit() {
        var toastString: String = if (checkAnswers()) getString(R.string.correct) else getString(R.string.incorrect)
        Toast.makeText(applicationContext, toastString, Toast.LENGTH_SHORT).show()
    }

    fun checkAnswers(): Boolean {
        return false
    }
}