package com.appwood.mylibrarys;

import static ProMex.classs.Utils.apiii.DEc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ProMex.classs.Utils.Util;
import cz.msebera.android.httpclient.Header;

public class Splash extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }

    /*Splash*/
    public static void next_activity_animation(String packageName, String VersonCode, Context context, Intent intent) {
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
                    //Skip ads
                    /*
                     * 1 - Inter
                     * 2 - Native
                     * 3 - Banner
                     * */
                    if (response.getString("regular_button_counter") != null && !response.getString("regular_button_counter").isEmpty()) {
                        List<String> Counter = new ArrayList<String>(Arrays.asList(response.getString("regular_button_counter").split(",")));
                        MyHelpers.setCounter_Inter(Integer.parseInt(Counter.get(0)));   //Inter
                        MyHelpers.setCounter_Native(Integer.parseInt(Counter.get(1)));   // Native
                        MyHelpers.setCounter_Banner(Integer.parseInt(Counter.get(2)));    //Banner
                    } else {
                        MyHelpers.setCounter_Inter(5000);
                        MyHelpers.setCounter_Native(5000);
                        MyHelpers.setCounter_Banner(5000);
                    }

                    //MixAds
                    MyHelpers.setmix_ad_on_off(response.getString("mix_ad"));
                    if (response.getString("mix_ad_counter") != null && !response.getString("mix_ad_counter").isEmpty()) {
                        List<String> Counter = new ArrayList<String>(Arrays.asList(response.getString("mix_ad_counter").split(",")));
                        MyHelpers.setmix_ad_counter(Integer.parseInt(Counter.get(0)));   //Inter
                        MyHelpers.setmix_ad_counter_native(Integer.parseInt(Counter.get(1)));   // Native
                        MyHelpers.setmix_ad_counter_banner(Integer.parseInt(Counter.get(2)));   // Banner
                    } else {
                        MyHelpers.setmix_ad_counter(5000);
                        MyHelpers.setmix_ad_counter_native(5000);
                        MyHelpers.setmix_ad_counter_banner(5000);
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

                    ShowIntents();

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

    public static void NextIntent(Context context, Intent intent) {
        context.startActivity(intent);
        ((Activity) context).finish();
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
