package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.LionAndMouseOne;
import cse.sust.kidslearning.LionAndMouseTwo;
import  cse.sust.kidslearning.LionAndMouseThree;

public class LionAndMouseAdapter extends FragmentPagerAdapter {
    public LionAndMouseAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                LionAndMouseOne t1 = new LionAndMouseOne();
                return t1;
            case 1:
                LionAndMouseTwo t2 = new LionAndMouseTwo();
                return t2;
            case 2:
                LionAndMouseThree t3 = new LionAndMouseThree();
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
