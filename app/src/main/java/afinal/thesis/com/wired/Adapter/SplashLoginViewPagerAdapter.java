package afinal.thesis.com.wired.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import afinal.thesis.com.wired.SplashLoginTabs.Login;
import afinal.thesis.com.wired.SplashLoginTabs.Register;

public class SplashLoginViewPagerAdapter extends FragmentPagerAdapter {

    public SplashLoginViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new Login();
            case 1: return new Register();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "LOGIN";
            case 1: return "REGISTER";
            default: return null;
        }
    }
}
