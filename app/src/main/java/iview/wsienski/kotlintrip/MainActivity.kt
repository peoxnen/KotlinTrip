package iview.wsienski.kotlintrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import iview.wsienski.kotlintrip.basic.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        //lambda
        btn.setOnClickListener { toast("Hello Kotlin") }
    }
}
