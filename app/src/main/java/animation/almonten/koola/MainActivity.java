package animation.almonten.koola;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.appwood.mylibrarys.AnimationR;

import animation.almonten.koola.AdsCode.ExitScreen;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ADS(View view) {
         AnimationR.Slider_intents(this, new Intent(this, TestingActivity.class), null,0);
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

    @Override
    public void onBackPressed() {
        AnimationR.BackAnimation(this);
    }

//    @Override
//    public void onBackPressed() {
//      AnimationR.Slider_intents(this, new Intent(this, ExitScreen.class),null,0);
//    }

}





































