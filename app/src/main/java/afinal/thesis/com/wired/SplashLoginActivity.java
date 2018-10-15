package afinal.thesis.com.wired;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import afinal.thesis.com.wired.Adapter.SplashLoginViewPagerAdapter;
import afinal.thesis.com.wired.SplashLoginTabs.Login;
import afinal.thesis.com.wired.SplashLoginTabs.Register;

public class SplashLoginActivity extends AppCompatActivity
        implements Login.OnFragmentInteractionListener,
        Register.OnFragmentInteractionListener{

    Handler handler = new Handler();
    TabLayout tabLayout;
    RelativeLayout relLayTabs;
    ImageView ivLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_login);

        handler.postDelayed(runnableIvLogo, 1000);

        relLayTabs = findViewById(R.id.relLayTabs);

        ViewPager loginSignupViewPager = findViewById(R.id.loginSignupViewPager);
        SplashLoginViewPagerAdapter splashLoginViewPagerAdapter = new SplashLoginViewPagerAdapter(getSupportFragmentManager());
        loginSignupViewPager.setAdapter(splashLoginViewPagerAdapter);

        tabLayout = findViewById(R.id.loginSignUpTablayout);
        tabLayout.setupWithViewPager(loginSignupViewPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    Runnable runnableIvLogo = new Runnable() {
        @Override
        public void run() {
            relLayTabs.setVisibility(View.VISIBLE);
        }
    };
}
