package com.example.android.pembrokepinestourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tonynguyen on 11/18/16.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {

    //Strings for each tab
    private String tabTitles[] = new String[]{"Eats", "Parks", "Malls", "Contacts"};

    private Context context;

    public FragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    //assign fragments position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
    } else if (position == 1){
            return new ParksFragment();
        } else if(position == 2){
            return new ShoppingFragment();
        }else {
            return new ContactsFragment();
    }
    }

    //how many fragments
    @Override
    public int getCount() {
        return 4;
    }

    //assign page title by its position
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}


