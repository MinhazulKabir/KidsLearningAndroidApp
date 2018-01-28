package cse.sust.kidslearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoseQuiz extends Activity {
    private Button eB,bB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_quiz);
        eB= (Button) findViewById(R.id.EnglishQuiz);
        eB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ChoseQuiz.this,start.class);
                startActivity(i);
                // finish();
            }
        });
        bB= (Button) findViewById(R.id.BanglaQuiz);
        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"ALPHABET",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ChoseQuiz.this,Banglastart.class);
                startActivity(i);
                // finish();
            }
        });
    }
}
