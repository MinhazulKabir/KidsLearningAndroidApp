package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.FoxAndCrowOne;
import cse.sust.kidslearning.FoxAndCrowTwo;
import  cse.sust.kidslearning.FoxAndCrowThree;
import  cse.sust.kidslearning.FoxAndCrowFour;
import  cse.sust.kidslearning.FoxAndCrowFive;

public class FoxAndCrowAdapter extends FragmentPagerAdapter {
    public FoxAndCrowAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                FoxAndCrowOne t1 = new FoxAndCrowOne();
                return t1;
            case 1:
                FoxAndCrowTwo t2 = new FoxAndCrowTwo();
                return t2;
            case 2:
                FoxAndCrowThree t3 = new FoxAndCrowThree();
                return t3;
            case 3:
                FoxAndCrowFour t4 = new FoxAndCrowFour();
                return t4;
            case 4:
                FoxAndCrowFive t5 = new FoxAndCrowFive();
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
