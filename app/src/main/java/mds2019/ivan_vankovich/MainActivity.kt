package mds2019.ivan_vankovich

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {

    val APP_KEY : String = "ccce248b-8f79-4637-bf10-d5a5d51db628"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fabric.with(this, Crashlytics())
        setContentView(R.layout.activity_main)
        AppCenter.start(application, APP_KEY, Analytics::class.java, Crashes::class.java)
    }
}
