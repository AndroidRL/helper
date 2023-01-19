package animation.almonten.koola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.appwood.mylibrarys.AnimationR;


public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
    }

    @Override
    public void onBackPressed() {
        AnimationR.BackAnimation(TestingActivity.this);
    }

    public void ADS(View view) {
        AnimationR.Slider_intents(this, new Intent(this, MainActivity.class), null, 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        AnimationR.Top_animation(this, findViewById(R.id.native_detail),
                findViewById(R.id.banner_native), findViewById(R.id.addcontain)
                , findViewById(R.id.ad_native_fb));

        //banner
        AnimationR.Bottom_animation(this, findViewById(R.id.bottomsads).findViewById(com.appwood.mylibrarys.R.id.google_banner_container), findViewById(R.id.bottomsads).findViewById(com.appwood.mylibrarys.R.id.fb_banner_container), findViewById(R.id.bottomsads));
    }


}