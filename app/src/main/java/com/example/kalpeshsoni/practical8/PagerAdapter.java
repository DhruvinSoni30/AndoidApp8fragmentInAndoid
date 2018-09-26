package com.example.kalpeshsoni.practical8;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TableLayout;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.noOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
              Syllabus s = new Syllabus();
              return s;

            case 1:
                Theory t = new Theory();
                return t;

            case 2:
                Practical p = new Practical();
                return p;

            case 3:
                Others o = new Others();
                return o;

            default :
                return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
