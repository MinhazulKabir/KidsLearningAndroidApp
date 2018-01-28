package cse.sust.kidslearning;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class alphabet extends Activity {

    private Button banglaB, englishB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        //button font
        Typeface tf=Typeface.createFromAsset(getAssets(),"NikoshLight.ttf");
        banglaB= (Button) findViewById(R.id.banglaBB);
        banglaB.setText("বাংলা \n");
        banglaB.setTypeface(tf);
        banglaB= (Button) findViewById(R.id.banglaBB);
        banglaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(alphabet.this,Bangla.class);
                startActivity(i);
               // finish();
            }
        });
        englishB= (Button) findViewById(R.id.englishBB);
        englishB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(alphabet.this,EnglishFragment.class);
                startActivity(i);
                //finish();
            }
        });
    }
}
