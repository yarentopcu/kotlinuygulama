package com.yt.ka3

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yt.ka3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        binding.textView.text="hello"
        binding.button.setOnClickListener{
            binding.textView.text="buton aktif"
        }*/

        /*
        val image=findViewById<ImageView>(R.id.imageView)
        val benimTextview=findViewById<TextView>(R.id.textView)
        benimTextview.text="merhaba kotlin"
        image.setImageResource(R.drawable.androidfoto2)*/
    }
    fun kaydet(view: View){
        binding.textView.text="kayıt edildi"

    }
    fun iptal(view:View){
        binding.textView.text="iptal edildi"

    }
}