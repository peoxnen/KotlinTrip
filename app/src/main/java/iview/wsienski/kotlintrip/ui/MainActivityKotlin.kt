package iview.wsienski.kotlintrip.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import iview.wsienski.kotlintrip.Constants
import iview.wsienski.kotlintrip.R.layout.activity_main
import iview.wsienski.kotlintrip.data.inheritance.DogKotlin
import iview.wsienski.kotlintrip.data.properties.LanguageKotlin
import iview.wsienski.kotlintrip.syntax.toast
import iview.wsienski.kotlintrip.util.Request
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val lang = LanguageKotlin()
        lang.name = "Kotlin"
        message.text = lang.name
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

        doAsync {
            Request(Constants.URL).run()
            uiThread { toast("Request OK") }
        }

    }
}
