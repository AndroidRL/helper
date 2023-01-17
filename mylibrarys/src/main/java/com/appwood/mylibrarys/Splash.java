package com.appwood.mylibrarys;

import static ProMex.classs.Utils.apiii.DEc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.TelephonyManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import ProMex.classs.Utils.Util;
import cz.msebera.android.httpclient.Header;
import top.oneconnectapi.app.OpenVpnApi;

import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Splash  extends AppCompatActivity {

    public static String extra_switch_1;
    public static String extra_switch_2;
    public static String extra_switch_3;
    public static String extra_switch_4;
    public static String extra_text_1;
    public static String extra_text_2;
    public static String extra_text_3;
    public static String extra_text_4;

    public static Context context_x;
    public static Intent intent_x;
    public static Runnable myRunnable;

    public static ArrayList<Countries> free_servers = new ArrayList<>();
    public static Countries selectedCountry = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
    /*Splash*/
    public static void next_activity_animation(String packageName, String VersonCode, Context context, Intent intent) {
        Handler handler = new Handler();
        myRunnable = new Runnable() {
            public void run() {
                if (MyHelpers.getCallBacks().equals("Yes")) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ShowIntents();
                        }
                    },2000);
                } else {
                    handler.postDelayed(myRunnable, 1000);
                }
            }
        };
        handler.postDelayed(myRunnable, 1000);

        context_x = context;
        intent_x = intent;
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.addHeader(DEc(Util.dojnghdklfjngkdfjng), DEc(Util.dfhdlkhmdflkhnmlkdfhm));
        asyncHttpClient.get(DEc(Util.askjdgnkjsgn) + packageName, new JsonHttpResponseHandler() {
            @Override
            public void onStart() {
                super.onStart();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                try {
                    // google
                    MyHelpers.setGoogleEnable(response.getString("enable_google_admob_id"));
                    if (MyHelpers.getGoogleEnable().equals("1")) {
                        //banner
                        MyHelpers.SetGoogleBanner(response.getString("google_admob_banner_id"));
                        MyHelpers.SetGoogleBanner1(response.getString("google_admob_banner_id_1"));
                        MyHelpers.SetGoogleBanner2(response.getString("google_admob_banner_id_2"));
                        //native
                        MyHelpers.SetGoogleNative(response.getString("google_admob_native_id"));
                        MyHelpers.SetGoogleNative1(response.getString("google_admob_native_id_1"));
                        MyHelpers.SetGoogleNative2(response.getString("google_admob_native_id_2"));

                        // color & name set
                        MyHelpers.setGooglebutton_name(response.getString("google_button_name"));
                        if (response.getString("google_button_color") != null && !response.getString("google_button_color").isEmpty()) {
                            MyHelpers.setGooglebutton_color(response.getString("google_button_color"));
                        } else {
                            MyHelpers.setGooglebutton_color("#000000");
                        }
                    }
                    if (response.getString("google_open_id") != null && !response.getString("google_open_id").isEmpty()) {
                        MyHelpers.setGoogle_OpenADS(response.getString("google_open_id"));
                    } else {
                        MyHelpers.setGoogle_OpenADS(null);
                    }
                    //google inter
                    if (response.getString("google_admob_interstitial_id") != null && !response.getString("google_admob_interstitial_id").isEmpty()) {
                        MyHelpers.SetGoogleInter(response.getString("google_admob_interstitial_id"));
                    } else {
                        MyHelpers.SetGoogleInter(null);
                    }
                    if (response.getString("google_admob_interstitial_id_1") != null && !response.getString("google_admob_interstitial_id_1").isEmpty()) {
                        MyHelpers.SetGoogleInter1(response.getString("google_admob_interstitial_id_1"));
                    } else {
                        MyHelpers.SetGoogleInter1(null);
                    }
                    if (response.getString("google_admob_interstitial_id_2") != null && !response.getString("google_admob_interstitial_id_2").isEmpty()) {
                        MyHelpers.SetGoogleInter2(response.getString("google_admob_interstitial_id_2"));
                    } else {
                        MyHelpers.SetGoogleInter2(null);
                    }


                    //facebook
                    MyHelpers.setFacebookEnable(response.getString("enable_facebook_id"));
                    if (MyHelpers.getFacebookEnable().equals("1")) {
                        //banner
                        MyHelpers.setFacebookBanner(response.getString("facebook_banner_id"));
                        MyHelpers.setFacebookBanner1(response.getString("facebook_banner_id_1"));
                        MyHelpers.setFacebookBanner2(response.getString("facebook_banner_id_2"));

                        //native
                        MyHelpers.SetFacebookNative(response.getString("facebook_native_id"));
                        MyHelpers.SetFacebookNative1(response.getString("facebook_native_id_1"));
                        MyHelpers.SetFacebookNative2(response.getString("facebook_native_id_2"));
                    }
                    if (response.getString("facebook_open_id") != null && !response.getString("facebook_open_id").isEmpty()) {
                        MyHelpers.setfacebook_open_ad_id(response.getString("facebook_open_id"));
                    } else {
                        MyHelpers.setfacebook_open_ad_id(null);
                    }
                    //facebook inter
                    if (response.getString("facebook_interstitial_id") != null && !response.getString("facebook_interstitial_id").isEmpty()) {
                        MyHelpers.SetFacebookInter(response.getString("facebook_interstitial_id"));
                    } else {
                        MyHelpers.SetFacebookInter(null);
                    }
                    if (response.getString("facebook_interstitial_id_1") != null && !response.getString("facebook_interstitial_id_1").isEmpty()) {
                        MyHelpers.SetFacebookInter1(response.getString("facebook_interstitial_id_1"));
                    } else {
                        MyHelpers.SetFacebookInter1(null);
                    }
                    if (response.getString("facebook_interstitial_id_2") != null && !response.getString("facebook_interstitial_id_2").isEmpty()) {
                        MyHelpers.SetFacebookInter2(response.getString("facebook_interstitial_id_2"));
                    } else {
                        MyHelpers.SetFacebookInter2(null);
                    }

                    //Auto Link
                    MyHelpers.setauto_link_on_off(response.getString("enable_auto_quereka_link"));  //on_off Auto link
                    if (MyHelpers.getauto_link_on_off().equals("1")) {
                        MyHelpers.setauto_link_array(response.getString("auto_quereka_link")); //link Array
                        MyHelpers.setauto_link_timer(response.getString("auto_quereka_time")); //open Timer
                        MyHelpers.Autolink();
                    }

                    //Back Button
                    MyHelpers.setBackAdsOnOff(response.getString("enable_back_button"));
                    if (response.getString("back_button_counter") != null && !response.getString("back_button_counter").isEmpty()) {
                        MyHelpers.setBackCounter(Integer.parseInt(response.getString("back_button_counter")));  //skip ads number
                    } else {
                        MyHelpers.setBackCounter(5000);
                    }
                    if (response.getString("regular_button_counter") != null && !response.getString("regular_button_counter").isEmpty()) {
                        MyHelpers.setCounter(Integer.parseInt(response.getString("regular_button_counter")));  //skip ads number
                    } else {
                        MyHelpers.setCounter(5000);
                    }

                    //MixAds
                    MyHelpers.setmix_ad_on_off(response.getString("mix_ad"));
                    if (response.getString("mix_ad_counter") != null && !response.getString("mix_ad_counter").isEmpty()) {
                        MyHelpers.setmix_ad_counter(Integer.parseInt(response.getString("mix_ad_counter")));
                    } else {
                        MyHelpers.setmix_ad_counter(5000);
                    }

                    extra_switch_1 = response.getString("extra_switch_1");
                    extra_switch_2 = response.getString("extra_switch_2");
                    extra_switch_3 = response.getString("extra_switch_3");
                    extra_switch_4 = response.getString("extra_switch_4");
                    extra_text_1 = response.getString("extra_text_1");
                    extra_text_2 = response.getString("extra_text_2");
                    extra_text_3 = response.getString("extra_text_3");
                    extra_text_4 = response.getString("extra_text_4");

                    //Open Other apps
                    MyHelpers.setOtherAppsShow(response.getString("replace_app"));
                    MyHelpers.setOtherAppsShowLink(response.getString("new_app_link"));
                    if (MyHelpers.getOtherAppsShow().equals("1")) {
                        MyHelpers.Entery_UpdateApps = 2;
                        context.startActivity(new Intent(context, UpdateAppActivity.class));
                        return;
                    }
                    //Update our apps
                    MyHelpers.setUpdateApps(response.getString("update_app"));
                    MyHelpers.setAppversioncode(response.getString("version_code"));
                    if (MyHelpers.getUpdateApps().equals("1")) {
                        if (!MyHelpers.getAppversioncode().equals(VersonCode)) {
                            MyHelpers.Entery_UpdateApps = 1;
                            context.startActivity(new Intent(context, UpdateAppActivity.class));
                            return;
                        }
                    }
                    //servers
                    if (extra_switch_4.equals("1")) {
                        if (CheckCountry()){
                            ShowIntents();
                        }else {
                            List<String> DATA = new ArrayList<String>(Arrays.asList(extra_text_4.split(",")));
                            MyHelpers.pack = DATA.get(0);
                            MyHelpers.Kyyy = DATA.get(1);
                            Thread thread = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        OneConnects oneConnect = new OneConnects();
                                        oneConnect.initialize(context);
                                        try {
                                            MyHelpers.FREE_SERVERS = oneConnect.fetch(true);
                                            MyHelpers.PREMIUM_SERVERS = oneConnect.fetch(false);
                                            selectedCountry = SelectedCountry();
                                            DislineNext(context);
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            thread.start();
                        }
                    } else {
                        ShowIntents();
                    }



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);

            }
        });
    }
    private static Countries SelectedCountry() {
        free_servers.clear();
        if (extra_text_2.equals("all")) {
            try {
                JSONArray jsonArray_free = new JSONArray(MyHelpers.FREE_SERVERS);
                for (int i = 0; i < jsonArray_free.length(); i++) {
                    JSONObject object = (JSONObject) jsonArray_free.get(i);
                    free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                }
                JSONArray jsonArray_vpi = new JSONArray(MyHelpers.PREMIUM_SERVERS);
                for (int i = 0; i < jsonArray_vpi.length(); i++) {
                    JSONObject object = (JSONObject) jsonArray_vpi.get(i);
                    free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                }
                return free_servers.get(getRandom(0, free_servers.size() - 1));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } else if (extra_text_2.equals("v")) {
            try {
                JSONArray jsonArray_vpi = new JSONArray(MyHelpers.PREMIUM_SERVERS);
                for (int i = 0; i < jsonArray_vpi.length(); i++) {
                    JSONObject object = (JSONObject) jsonArray_vpi.get(i);
                    free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                }
                return free_servers.get(getRandom(0, free_servers.size() - 1));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (extra_text_2.equals("f")) {
            try {
                JSONArray jsonArray_free = new JSONArray(MyHelpers.FREE_SERVERS);
                for (int i = 0; i < jsonArray_free.length(); i++) {
                    JSONObject object = (JSONObject) jsonArray_free.get(i);
                    free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                }
                return free_servers.get(getRandom(0, free_servers.size() - 1));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } else {
            try {
                List<String> myList = new ArrayList<String>(Arrays.asList(extra_text_2.split(",")));
                if (myList.get(0).equals("v")) {
                    JSONArray jsonArray_vpi = new JSONArray(MyHelpers.PREMIUM_SERVERS);
                    for (int i = 0; i < jsonArray_vpi.length(); i++) {
                        JSONObject object = (JSONObject) jsonArray_vpi.get(i);
                        free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                    }
                    return free_servers.get(Integer.parseInt(myList.get(getRandom(1, myList.size() - 1))));
                } else if (myList.get(0).equals("f")) {
                    JSONArray jsonArray_free = new JSONArray(MyHelpers.FREE_SERVERS);
                    for (int i = 0; i < jsonArray_free.length(); i++) {
                        JSONObject object = (JSONObject) jsonArray_free.get(i);
                        free_servers.add(new Countries(object.getString("serverName"), object.getString("flag_url"), object.getString("ovpnConfiguration"), object.getString("vpnUserName"), object.getString("vpnPassword")));
                    }
                    return free_servers.get(Integer.parseInt(myList.get(getRandom(1, myList.size() - 1))));
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

        return null;
    }
    public static void NextIntent(Context context, Intent intent) {
        context.startActivity(intent);
        ((Activity) context).finish();
    }
    public static void DislineNext(Context context) {
        Intent intent = VpnService.prepare(context);
        if (intent != null) {
            ((Activity) context).startActivityForResult(intent, 8565);
        } else {
            NextActivity();
        }
    }
    public static void NextActivity() {
        try {
            ActiveServer.saveServer(selectedCountry, context_x);
            OpenVpnApi.startVpn(context_x, selectedCountry.getOvpn(), selectedCountry.getCountry(), selectedCountry.getOvpnUserName(), selectedCountry.getOvpnUserPassword());
            MyHelpers.setCallBacks("Yes");
        } catch (RemoteException e) {
            e.printStackTrace();

        }
    }
    public static int getRandom(int min, int max) {
        int random = new Random().nextInt((max - min) + 1) + min;
        return random;
    }
    public static String getCountryCode() {
        TelephonyManager tm = (TelephonyManager) context_x.getSystemService(context_x.getApplicationContext().TELEPHONY_SERVICE);
        return tm.getNetworkCountryIso();
    }
    public static Boolean CheckCountry() {
        try {
            if (extra_text_3 == null || extra_text_3.equals("")){
                return false;
            }
            List<String> COUNTRY = new ArrayList<String>(Arrays.asList(extra_text_3.split(",")));
            String tm = getCountryCode();
            if (tm == null || tm.isEmpty()){
                return true;
            }
            for (int i = 0; i < COUNTRY.size(); i++) {
                if (COUNTRY.get(i).equals(tm)){
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    private static void ShowIntents() {

        if (MyHelpers.getGoogleEnable().equals("1")) {
            AnimationR.mix_adsInter = 0;
            AnimationR.mix_adsInter_back = 0;

            AnimationR.AutoGoogleInterID = 1;
            AnimationR.GoogleInterstitialAdLoad(context_x);
            if (MyHelpers.getmix_ad_on_off().equals("1")) {
                AnimationR.AutoLoadFBInterID = 1;
                AnimationR.FacebookInterLoad(context_x);
            }
            if (MyHelpers.getFacebookInter() != null && !MyHelpers.getFacebookInter().isEmpty()) {
                AnimationR.AutoLoadFBInterID = 1;
                AnimationR.Google_failed_FacebookInterLoad(context_x);
            }
            try {
                AppOpenAd.AppOpenAdLoadCallback loadCallback = new AppOpenAd.AppOpenAdLoadCallback() {
                    public void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
                        appOpenAd.show((Activity) context_x, new FullScreenContentCallback() {
                            public void onAdShowedFullScreenContent() {
                            }

                            public void onAdDismissedFullScreenContent() {
                                NextIntent(context_x, intent_x);
                            }

                            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                AnimationR.Google_open_failed_Facebook_Open(context_x, intent_x);
                            }
                        });
                    }

                    public void onAppOpenAdFailedToLoad(LoadAdError loadAdError) {
                        AnimationR.Google_open_failed_Facebook_Open(context_x, intent_x);

                    }
                };
                AppOpenAd.load((Context) context_x, MyHelpers.getGoogle_OpenADS(), new AdRequest.Builder().build(), 1, loadCallback);
                MyHelpers.appOpenManager = new AppOpenManager(MyHelpers.getInstance());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (MyHelpers.getFacebookEnable().equals("1")) {
            AnimationR.AutoLoadFBInterID = 1;
            AnimationR.mix_adsInter = 1;
            AnimationR.mix_adsInter_back = 1;
            AnimationR.FacebookInterLoad(context_x);
            if (MyHelpers.getmix_ad_on_off().equals("1")) {
                AnimationR.AutoLoadFBInterID = 1;
                AnimationR.FacebookInterLoad(context_x);
            }
            if (MyHelpers.getGoogleInter() != null && !MyHelpers.getGoogleInter().isEmpty()) {
                AnimationR.AutoGoogleInterID = 1;
                AnimationR.GoogleInterstitialAdLoad(context_x);
            }
            AnimationR.Facebook_Open(context_x, intent_x);

        } else {
            NextIntent(context_x, intent_x);
        }
    }
}
