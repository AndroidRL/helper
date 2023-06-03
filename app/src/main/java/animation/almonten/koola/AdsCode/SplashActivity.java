package animation.almonten.koola.AdsCode;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.appwood.mylibrarys.Splash;

import animation.almonten.koola.MainActivity;
import animation.almonten.koola.R;


public class SplashActivity extends AppCompatActivity {


    String Token = "e9f1f11b64bcf5d1ce733c749e6b150dd5f3c134";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public boolean isOnline() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Splash.StartAnimation(this, new Intent(this, MainActivity.class), "Test", "1", 0,"2805cd77185b02ab4a79a8294cdacb5e/raw/CootPlayer");
        Splash.StartAnimation(this, new Intent(this, MainActivity.class), "Test", "1", 0, "90ec1f54ab4ee8da68b2f47bf97b57e6/raw/" + Token + "/Videocalls");
    }
}