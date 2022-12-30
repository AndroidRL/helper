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
        AnimationR.Slider_intents(this, new Intent(this,  MainActivity.class), null,1);
    }


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
}