package iview.wsienski.kotlintrip

import android.app.Application
import timber.log.Timber

/**
 * Created by WSienski on 22/12/2017.
 */
class MyAppKotlin: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}