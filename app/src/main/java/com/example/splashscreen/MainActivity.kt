package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    private val splashScreen =8000
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val animasyon=AnimationUtils.loadAnimation(this,R.anim.animation)
        val animasyon1=AnimationUtils.loadAnimation(this,R.anim.animation1)
        val animasyon2=AnimationUtils.loadAnimation(this,R.anim.animation2)

        val acik=binding.acik
        val kapali=binding.kapali
        val aciklama=binding.aciklama
        val baslik=binding.baslik

        acik.animation=animasyon
        kapali.animation=animasyon1
        aciklama.animation=animasyon2
        baslik.animation=animasyon2

        Handler().postDelayed({
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        },splashScreen.toLong())

    }
}