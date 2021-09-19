package com.muazzeznihalbahadir.cicekkitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
        val intent =intent
        val secilenCicekIsmi=intent.getStringExtra("cicekIsmi")
        textView.text=secilenCicekIsmi.toString()

        val secilenCicekGorseli = intent.getIntExtra("cicekGorseli",R.drawable.ataturk)

        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenCicekGorseli)
        imageView.setImageBitmap(bitmap)

        /*val secilenCicek = SingletonClass.SecilenCicek
        val secilenGörsel = secilenCicek.görsel
        imageView.setImageBitmap(secilenGörsel)*/
   }
}