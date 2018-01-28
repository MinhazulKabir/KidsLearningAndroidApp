package cse.sust.kidslearning;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class Banglaresult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_result);
        TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        Typeface tf=Typeface.createFromAsset(getAssets(),"NikoshLight.ttf");
        TextView highScoreLabel = (TextView) findViewById(R.id.highScoreLabel);
        highScoreLabel.setTypeface(tf);
        int score = getIntent().getIntExtra("SCORE", 0);
        scoreLabel.setText(score + "");

        SharedPreferences settings = getSharedPreferences("HIGH_SCORE", Context.MODE_PRIVATE);
        int highScore = settings.getInt("HIGH_SCORE", 0);

        if (score > highScore) {
            highScoreLabel.setText("সর্বোচ্চস্কোরঃ  " + score);

            // Update High Score
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("HIGH_SCORE", score);
            editor.commit();

        } else {
            highScoreLabel.setText("সর্বোচ্চস্কোরঃ  " + highScore);

        }

    }


    public void tryAgain(View view) {
        startActivity(new Intent(getApplicationContext(), Banglastart.class));
        finish();
    }
    

}
