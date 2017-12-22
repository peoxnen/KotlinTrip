package iview.wsienski.kotlintrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import iview.wsienski.kotlintrip.basic.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = "Hello"
        //lambda
        btn.setOnClickListener { toast("Kotlin") }
    }
}
