package cse.sust.kidslearning;

        import android.app.ActionBar;
        import android.graphics.Color;
        import android.support.annotation.Nullable;
        import android.support.v4.app.FragmentActivity;
        import android.support.v4.view.PagerTabStrip;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;
        import android.view.Menu;
        import android.view.MenuItem;

public class LionAndMouse extends FragmentActivity {

   private ViewPager pager;
    private PagerTabStrip tab_strp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion_and_mouse);
        LionAndMouseAdapter mapager=new LionAndMouseAdapter(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);

        pager.setAdapter(mapager);
        tab_strp=(PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);
        tab_strp.setTextSize(5,5);
        // tab_strp.setTabIndicatorColor(Color.WHITE);
    }


}
