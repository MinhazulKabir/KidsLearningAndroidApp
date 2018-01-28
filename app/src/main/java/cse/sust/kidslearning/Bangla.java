package cse.sust.kidslearning;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangla extends AppCompatActivity {

    private Button banglaV, banglaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
        Typeface tf=Typeface.createFromAsset(getAssets(),"NikoshLight.ttf");
        banglaV= (Button) findViewById(R.id.banglaVowel);
        banglaV.setTypeface(tf);
        banglaV= (Button) findViewById(R.id.banglaVowel);
        banglaV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(Bangla.this,BanglaVowelLearning.class);
                startActivity(i);
                finish();
            }
        });
        Typeface tf2=Typeface.createFromAsset(getAssets(),"NikoshLight.ttf");
        banglaC= (Button) findViewById(R.id.banglaConsonent);
        banglaC.setTypeface(tf2);
        banglaC= (Button) findViewById(R.id.banglaConsonent);
        banglaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(Bangla.this,BanglaConLearning.class);
                startActivity(i);
                finish();
            }
        });
    }
}
