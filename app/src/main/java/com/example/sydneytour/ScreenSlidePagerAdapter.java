package com.example.sydneytour;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

    private String[] pageTitles = new String[]{"Parks", "Restaurants", "Museums", "Landmarks"};

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: return new ParksFragment();
            case 1: return new RestaurantsFragment();
            case 2: return new MuseumsFragment();
            case 3: return new LandmarksFragment();
            default: return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }
}
