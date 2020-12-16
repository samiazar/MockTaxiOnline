package com.samiazar.taxionline

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btAzadiSnapp).setOnClickListener {
            goAzadi("cab.snapp.driver")
        }
        findViewById<View>(R.id.btAzadiTap30).setOnClickListener {
            goAzadi("taxi.tap30.driver")
        }
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun goAzadi(referrer: String) {
        val uri = Uri.parse("https://balad.ir/location?latitude=35.701045&longitude=51.339202&zoom=16.34")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.putExtra(Intent.EXTRA_REFERRER, Uri.parse("http://$referrer"))
        startActivity(intent)
    }

}