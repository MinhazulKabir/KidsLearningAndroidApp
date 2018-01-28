package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.HareAndTortoiseOne;
import cse.sust.kidslearning.HareAndTortoiseTwo;
import  cse.sust.kidslearning.HareAndTortoiseThree;

public class HareAndTortoiseAdapter extends FragmentPagerAdapter {
    public HareAndTortoiseAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                HareAndTortoiseOne t1 = new HareAndTortoiseOne();
                return t1;
            case 1:
                HareAndTortoiseTwo t2 = new HareAndTortoiseTwo();
                return t2;
            case 2:
                HareAndTortoiseThree t3 = new HareAndTortoiseThree();
                return t3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "প্রথম অংশ";
            case 1:
                return "দ্বিতীয় অংশ";
            case 2:
                return "তৃতীয় অংশ";
        }
        return null;
    }
    }
