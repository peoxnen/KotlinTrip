package iview.wsienski.kotlintrip;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by WSienski on 22/12/2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
