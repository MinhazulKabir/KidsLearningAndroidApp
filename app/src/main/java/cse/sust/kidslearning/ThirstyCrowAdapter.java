package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.ThirstyCrowOne;
import cse.sust.kidslearning.ThirstyCrowTwo;
import  cse.sust.kidslearning.ThirstyCrowThree;
import  cse.sust.kidslearning.ThirstyCrowFour;

public class ThirstyCrowAdapter extends FragmentPagerAdapter {
    public ThirstyCrowAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                ThirstyCrowOne t1 = new ThirstyCrowOne();
                return t1;
            case 1:
                ThirstyCrowTwo t2 = new ThirstyCrowTwo();
                return t2;
            case 2:
                ThirstyCrowThree t3 = new ThirstyCrowThree();
                return t3;
            case 3:
                ThirstyCrowFour t4 = new ThirstyCrowFour();
                return t4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
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
            case 3:
                return "চতুর্থ অংশ";
        }
        return null;
    }
    }
