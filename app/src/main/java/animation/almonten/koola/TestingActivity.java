package animation.almonten.koola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.appwood.mylibrarys.AdsClass;


public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
    }

    @Override
    public void onBackPressed() {
        AdsClass.BackInterstitial(TestingActivity.this);
    }

    public void ADS(View view) {

        AdsClass.Interstitial(this, new Intent(this,  MainActivity.class), 0);

    }


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
}