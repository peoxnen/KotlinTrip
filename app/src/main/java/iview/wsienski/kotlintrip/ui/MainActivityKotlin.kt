package iview.wsienski.kotlintrip.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import iview.wsienski.kotlintrip.R.layout.activity_main
import iview.wsienski.kotlintrip.basic.toast
import iview.wsienski.kotlintrip.data.inheritance.DogKotlin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        message.text = "Kotlin"
        //lambda
        btn.setOnClickListener {
            val dog = DogKotlin("Rex", "sheep-dog")
            dog.greet()
            dog.makeCommand("Jump")
            toast(txt = dog.greetingsTxt())
        }

        val items = listOf("Kotlin", "Java", "C++")
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ListAdapterKotlin(items)

    }
}
