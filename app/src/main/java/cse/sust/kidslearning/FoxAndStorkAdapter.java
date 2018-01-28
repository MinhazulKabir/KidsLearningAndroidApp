package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.FoxAndStorkOne;
import cse.sust.kidslearning.FoxAndStorkTwo;
import  cse.sust.kidslearning.FoxAndStorkThree;
import  cse.sust.kidslearning.FoxAndStorkFour;
import  cse.sust.kidslearning.FoxAndStorkFive;

public class FoxAndStorkAdapter extends FragmentPagerAdapter {
    public FoxAndStorkAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                FoxAndStorkOne t1 = new FoxAndStorkOne();
                return t1;
            case 1:
                FoxAndStorkTwo t2 = new FoxAndStorkTwo();
                return t2;
            case 2:
                FoxAndStorkThree t3 = new FoxAndStorkThree();
                return t3;
            case 3:
                FoxAndStorkFour t4 = new FoxAndStorkFour();
                return t4;
            case 4:
                FoxAndStorkFive t5 = new FoxAndStorkFive();
                return t5;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
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
            case 4:
                return "পঞ্চম অংশ";
        }
        return null;
    }
    }
