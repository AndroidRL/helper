package animation.almonten.koola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.appwood.mylibrarys.BigAnimation;
import com.appwood.mylibrarys.NextAnimation;
import com.appwood.mylibrarys.SmallAnimation;


public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        BigAnimation.TopAnimation(this, findViewById(R.id.top_animation));
//        SmallAnimation.BottomAnimation( this, findViewById(R.id.bottom_animation));
    }

    @Override
    public void onBackPressed() {
         NextAnimation.BackAnimation(TestingActivity.this,null);
    }

    public void ADS(View view) {
//        startActivity(new Intent(this,MainActivity.class));
//        NextAnimation.SliderAnimation(this);
        NextAnimation.SliderAnimation(this, new Intent(this, MainActivity.class),0);
    }


}