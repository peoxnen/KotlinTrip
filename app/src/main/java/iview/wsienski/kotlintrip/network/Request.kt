package iview.wsienski.kotlintrip.network

import com.google.gson.Gson
import iview.wsienski.kotlintrip.data.data.RepoKotlin
import timber.log.Timber
import java.net.URL

/**
 * Created by WSienski on 22/12/2017.
 */
class Request(private val url: String) {

    fun run(): List<RepoKotlin> {
        val jsonStr = URL(url).readText()
        Timber.d(jsonStr)
        return Gson().fromJson(jsonStr, Array<RepoKotlin>::class.java).toList()
    }
}