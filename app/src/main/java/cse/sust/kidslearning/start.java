package cse.sust.kidslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;


public class start extends AppCompatActivity {

    //private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);}

    public void startGame(View view) {
        startActivity(new Intent(getApplicationContext(), EnglishGames.class));
        finish();
    }

    // Disable Return Button

}
