package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.BanglaVowel01;
import cse.sust.kidslearning.BanglaVowel02;
import  cse.sust.kidslearning.BanglaVowel03;
import  cse.sust.kidslearning.BanglaVowel03;
import  cse.sust.kidslearning.BanglaVowel04;
import  cse.sust.kidslearning.BanglaVowel05;
import  cse.sust.kidslearning.BanglaVowel06;
import  cse.sust.kidslearning.BanglaVowel07;
import  cse.sust.kidslearning.BanglaVowel08;
import  cse.sust.kidslearning.BanglaVowel09;
import  cse.sust.kidslearning.BanglaVowel10;
import  cse.sust.kidslearning.BanglaVowel11;

public class BanglaVowelAdapter extends FragmentPagerAdapter {
    public BanglaVowelAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                BanglaVowel01 t1 = new BanglaVowel01();
                return t1;
            case 1:
                BanglaVowel02 t2 = new BanglaVowel02();
                return t2;
            case 2:
                BanglaVowel03 t3 = new BanglaVowel03();
                return t3;
            case 3:
                BanglaVowel04 t4 = new BanglaVowel04();
                return t4;
            case 4:
                BanglaVowel05 t5 = new BanglaVowel05();
                return t5;
            case 5:
                BanglaVowel06 t6 = new BanglaVowel06();
                return t6;
            case 6:
                BanglaVowel07 t7 = new BanglaVowel07();
                return t7;
            case 7:
                BanglaVowel08 t8 = new BanglaVowel08();
                return t8;
            case 8:
                BanglaVowel09 t9 = new BanglaVowel09();
                return t9;
            case 9:
                BanglaVowel10 t10 = new BanglaVowel10();
                return t10;
            case 10:
                BanglaVowel11 t11 = new BanglaVowel11();
                return t11;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 11;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "অ";
            case 1:
                return "আ";
            case 2:
                return "ই";
            case 3:
                return "ঈ";
            case 4:
                return "উ";
            case 5:
                return "ঊ";
            case 6:
                return "ঋ";
            case 7:
                return "এ";
            case 8:
                return "ঐ";
            case 9:
                return "ও";
            case 10:
                return "ঔ";
        }
        return null;
    }
}
