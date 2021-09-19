package com.muazzeznihalbahadir.cicekkitabi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cicekIsimleri = ArrayList<String>()
        cicekIsimleri.add("ataturk")
        cicekIsimleri.add("kupeli")
        cicekIsimleri.add("lale")
        cicekIsimleri.add("muge")
        cicekIsimleri.add("ortanca")
/*
        val ataturkBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ataturk)
        val kupeliBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kupeli)
        val laleBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lale)
        val mugeBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.muge)
        val ortancaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ortanca)



        var cicekGorselleri = ArrayList<Bitmap>()
        cicekGorselleri.add(ataturkBitmap)
        cicekGorselleri.add(kupeliBitmap)
        cicekGorselleri.add(laleBitmap)
        cicekGorselleri.add(mugeBitmap)
        cicekGorselleri.add(ortancaBitmap)
*/
        val ataturkDrawableId = R.drawable.ataturk
        val kupeliDrawableId = R.drawable.kupeli
        val laleDrawableId = R.drawable.lale
        val mugeDrawableId = R.drawable.muge
        val ortancaDrawableId = R.drawable.ortanca

        val cicekDrawableList = ArrayList<Int>()
        cicekDrawableList.add(ataturkDrawableId)
        cicekDrawableList.add(kupeliDrawableId)
        cicekDrawableList.add(laleDrawableId)
        cicekDrawableList.add(mugeDrawableId)
        cicekDrawableList.add(ortancaDrawableId)

        val layaoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layaoutManager

        val adapter = RecyclerAdapter(cicekIsimleri,cicekDrawableList)
        recyclerView.adapter = adapter


    }
}