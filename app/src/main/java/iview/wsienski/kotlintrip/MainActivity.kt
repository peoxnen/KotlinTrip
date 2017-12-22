package iview.wsienski.kotlintrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import iview.wsienski.kotlintrip.basic.toast
import iview.wsienski.kotlintrip.data.inheritance.DogKotlin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = "Kotlin"
        //lambda
        btn.setOnClickListener {
            val dog = DogKotlin("Rex", "sheep-dog")
            dog.greet()
            toast(txt = dog.greetingsTxt())
        }

    }
}
