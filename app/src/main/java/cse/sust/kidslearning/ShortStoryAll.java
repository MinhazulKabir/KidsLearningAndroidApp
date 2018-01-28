package cse.sust.kidslearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShortStoryAll extends Activity {
    private Button storyNumber1,storyNumber2,storyNumber3,storyNumber4,storyNumber5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_story_all);
        //create sroty button
        storyNumber1= (Button) findViewById(R.id.StoryNumber001);
        storyNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ShortStoryAll.this,LionAndMouse.class);
                startActivity(i);
                //finish();
            }
        });
        storyNumber2= (Button) findViewById(R.id.StoryNumber002);
        storyNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ShortStoryAll.this,FoxAndCrow.class);
                startActivity(i);
                //finish();
            }
        });
        storyNumber3= (Button) findViewById(R.id.StoryNumber003);
        storyNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ShortStoryAll.this,FoxAndStork.class);
                startActivity(i);
               // finish();
            }
        });
        storyNumber4= (Button) findViewById(R.id.StoryNumber004);
        storyNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ShortStoryAll.this,HareAndTortoise.class);
                startActivity(i);
                //finish();
            }
        });
        storyNumber5= (Button) findViewById(R.id.StoryNumber005);
        storyNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_LONG).show();
                Intent i=new Intent(ShortStoryAll.this,ThirstyCrow.class);
                startActivity(i);
                //finish();
            }
        });
    }
}
