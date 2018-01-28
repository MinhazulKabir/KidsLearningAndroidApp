package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.CountingOne;
import cse.sust.kidslearning.CountingTwo;
import  cse.sust.kidslearning.CountingThree;
import  cse.sust.kidslearning.CountingFour;
import cse.sust.kidslearning.CountingFive;
import  cse.sust.kidslearning.CountingSix;
import  cse.sust.kidslearning.CountingSeven;
import cse.sust.kidslearning.CountingEight;
import  cse.sust.kidslearning.CountingNine;
import  cse.sust.kidslearning.CountingTen;
public class NumberAdapter extends FragmentPagerAdapter {
    public NumberAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                CountingOne t1 = new CountingOne();
                return t1;
            case 1:
                CountingTwo t2 = new CountingTwo();
                return t2;
            case 2:
                CountingThree t3 = new CountingThree();
                return t3;
            case 3:
                CountingFour t4 = new CountingFour();
                return t4;
            case 4:
                CountingFive t5 = new CountingFive();
                return t5;
            case 5:
                CountingSix t6 = new CountingSix();
                return t6;
            case 6:
                CountingSeven t7 = new CountingSeven();
                return t7;
            case 7:
                CountingEight t8 = new CountingEight();
                return t8;
            case 8:
                CountingNine t9 = new CountingNine();
                return t9;
            case 9:
                CountingTen t10 = new CountingTen();
                return t10;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 10;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "1 ১";
            case 1:
                return "2 ২";
            case 2:
                return "3 ৩";
            case 3:
                return "4 ৪";
            case 4:
                return "5 ৫";
            case 5:
                return "6 ৬";
            case 6:
                return "7 ৭";
            case 7:
                return "8 ৮";
            case 8:
                return "9 ৯";
            case 9:
                return "10 ১০";
        }
        return null;
    }
}
