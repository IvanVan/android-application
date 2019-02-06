package mds2019.ivan_vankovich

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.widget.ImageView
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;

class MainActivity : AppCompatActivity() {

    private val APP_CENTER_KEY : String = "ccce248b-8f79-4637-bf10-d5a5d51db628"

    override fun onCreate(savedInstanceState: Bundle?) {
//        val img = findViewById<ImageView>(R.id.imageView)
//        val bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ivan_van_photo)
//        val roundImage = RoundedBitmapDrawableFactory.create(getResources(), bitmap)
//        roundImage.circular(true)
//        img.setImageDrawable(roundImage)

//        val imageView : ImageView = findViewById<ImageView>(R.id.imageView);
//        val bitmap : Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ivan_van_photo);
//        val roundedBitmapDrawable : RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
//        roundedBitmapDrawable.setCircular(true);
//        imageView.setImageDrawable(roundedBitmapDrawable);

        super.onCreate(savedInstanceState)
        Fabric.with(this, Crashlytics())
        setContentView(R.layout.activity_main)
        AppCenter.start(application, APP_CENTER_KEY, Distribute::class.java)
    }
}
