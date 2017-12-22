package iview.wsienski.kotlintrip.basic

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Witold Sienski on 06.12.2017.
 */
fun String.isEmail(): Boolean{
    return this.contains("@")
}

fun AppCompatActivity.toast(txt: String){
    return Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
}