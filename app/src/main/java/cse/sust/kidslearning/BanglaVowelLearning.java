package cse.sust.kidslearning;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class BanglaVowelLearning extends FragmentActivity {

    private ViewPager pager;
    private PagerTabStrip tab_strp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_vowel_learning);
        BanglaVowelAdapter mapager=new BanglaVowelAdapter(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);

        pager.setAdapter(mapager);
        tab_strp=(PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.BLACK);
        tab_strp.setTextSize(5,10);
        // tab_strp.setTabIndicatorColor(Color.WHITE);
    }

}
