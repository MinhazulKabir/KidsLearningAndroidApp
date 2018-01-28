package cse.sust.kidslearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private  Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.alphabet1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,alphabet.class);
                startActivity(i);
               // finish();
            }
        });
        b2= (Button) findViewById(R.id.number1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"NUMBER",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,number.class);
                startActivity(i);
               // finish();
            }
        });
        b3= (Button) findViewById(R.id.story1);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"STORY",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,ShortStoryAll.class);
                startActivity(i);
                //finish();
            }
        });
        b4= (Button) findViewById(R.id.exam1);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"STORY",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,ChoseQuiz.class);
                startActivity(i);
                //finish();
            }
        });
    }
}
