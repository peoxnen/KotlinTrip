package iview.wsienski.kotlintrip.util

import timber.log.Timber
import java.net.URL

/**
 * Created by WSienski on 22/12/2017.
 */
class Request(private val url: String) {

    fun run() {
        val jsonStr = URL(url).readText()
        Timber.d(jsonStr)
    }
}