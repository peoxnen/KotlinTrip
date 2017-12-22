package iview.wsienski.kotlintrip.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import iview.wsienski.kotlintrip.R.layout.activity_menu
import kotlinx.android.synthetic.main.activity_menu.*
import org.jetbrains.anko.intentFor

/**
 * Created by WSienski on 22/12/2017.
 */
class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_menu)

        btnKotlin.setOnClickListener({ startActivity(intentFor<MainActivityKotlin>()) })
        btnJava.setOnClickListener({ startActivity(intentFor<MainActivityJava>()) })
    }

}