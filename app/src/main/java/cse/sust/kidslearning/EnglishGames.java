package cse.sust.kidslearning;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class EnglishGames extends Activity {

    private static String realAnswer[] = {"Apple","Ball","Car","Doll","Elephant","Fish",
            "Girl","Horse","Ice-cream","Jacket","Kite","Lion","Moon","Nurse","Oranges",
            "Pen","Queen","Rat","Star","Tree","Umbrella","Vegetables","Window","X-ray","Yo-yo","Zebra"};
    private static String wrongAnswer[] = {"Apel","Boll","Caal","Dol","Elifant","fis",
            "Garl","Hors","Is-creame","Jaket","Kait","Laion","Mun","Nars","Orengs",
            "Pennn","Quin","Raaat","Staaar","Trei","Umbrela","Vegitebols","Windous","X-re","Yi-yi","Zibra"};
    private TextView scoreLabel;
    private TextView startLabel,startLabel2;
    private ImageView box;
    private TextView orange;
    private TextView pink;
    private TextView black;

    // Size
    private int frameHeight;
    private int boxSize;
    private int screenWidth;
    private int screenHeight;

    // Position
    private int boxY;
    private int orangeX;
    private int orangeY;
    private int pinkX;
    private int pinkY;
    private int blackX;
    private int blackY;

    // Speed
    private int boxSpeed;
    private int orangeSpeed;
    private int pinkSpeed;
    private int blackSpeed;

    // Score
    private int score = 0;

    // Initialize Class
    private Handler handler = new Handler();
    private Timer timer = new Timer();
    private SoundPlayer sound;


    // Status Check
    private boolean action_flg = false;
    private boolean start_flg = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_main_game);

        sound = new SoundPlayer(this);

        scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        startLabel = (TextView) findViewById(R.id.startLabel);
        startLabel2 = (TextView) findViewById(R.id.startLabel2);
        box = (ImageView) findViewById(R.id.box);
        orange = (TextView) findViewById(R.id.orange);
        orange.setText(realAnswer[(int) (Math.random()*25)]);
        pink = (TextView) findViewById(R.id.pink);
        pink.setText(realAnswer[(int) (Math.random()*25)]);
        black = (TextView) findViewById(R.id.black);
        black.setText(wrongAnswer[(int) (Math.random()*25)]);


        // Get screen size.
        WindowManager wm = getWindowManager();
        Display disp = wm.getDefaultDisplay();
        Point size = new Point();
        disp.getSize(size);

        screenWidth = size.x;
        screenHeight = size.y;

        // Now
        // Nexus4 Width: 768 Height:1280
        // Speed Box:20 Orange:12 Pink:20 Black:16

        boxSpeed = Math.round(screenHeight / 60);  // 1280 / 60 = 21.333... => 21
        orangeSpeed = Math.round(screenWidth / 100); // 768 / 60 = 12.8 => 13
        pinkSpeed = Math.round(screenWidth / 70);   // 768 / 36 = 21.333... => 21
        blackSpeed = Math.round(screenWidth / 100); // 768 / 45 = 17.06... => 17

        //Log.v("SPEED_BOX", boxSpeed + "");
        //Log.v("SPEED_ORANGE", orangeSpeed + "");
        //Log.v("SPEED_PINK", pinkSpeed + "");
        //Log.v("SPEED_BLACK", blackSpeed + "");


        // Move to out of screen.
        orange.setX(-80);
        orange.setY(-80);
        pink.setX(-80);
        pink.setY(-80);
        black.setX(-80);
        black.setY(-80);

        scoreLabel.setText("Score : 0");


    }


    public void changePos() {

        hitCheck();

        // Orange
        orangeX -= orangeSpeed;
        if (orangeX < 0) {
            orangeX = screenWidth + 100;
            int i= (int) (Math.random()*25);
            orange.setText(realAnswer[i]);
            orangeY = (int) Math.floor(Math.random() * (frameHeight - orange.getHeight()));
        }
        orange.setX(orangeX);
        orange.setY(orangeY);


        // Black
        blackX -= blackSpeed;
        if (blackX < 0) {
            blackX = screenWidth + 300;
            int i= (int) (Math.random()*25);
            black.setText(wrongAnswer[i]);
            blackY = (int) Math.floor(Math.random() * (frameHeight - black.getHeight()));
        }
        black.setX(blackX);
        black.setY(blackY);


        // Pink
        pinkX -= pinkSpeed;

        if (pinkX < 0) {
            pinkX = screenWidth + 500;
            int ii= (int) (Math.random()*25);
            pink.setText(realAnswer[ii]);
            pinkY = (int) Math.floor(Math.random() * (frameHeight - pink.getHeight()));
        }
        pink.setX(pinkX);
        pink.setY(pinkY);


        // Move Box
        if (action_flg == true) {
            // Touching
            boxY -= boxSpeed;

        } else {
            // Releasing
            boxY += boxSpeed;
        }

        // Check box position.
        if (boxY < 0) boxY = 0;

        if (boxY > frameHeight - boxSize) boxY = frameHeight - boxSize;

        box.setY(boxY);

        scoreLabel.setText("Score : " + score);

    }


    public void hitCheck() {

        // If the center of the ball is in the box, it counts as a hit.

        // Orange
        int orangeCenterX = orangeX + orange.getWidth()/8;
        int orangeCenterY = orangeY + orange.getHeight()/8;

        // 0 <= orangeCenterX <= boxWidth
        // boxY <= orangeCenterY <= boxY + boxHeight

        if (0 <= orangeCenterX && orangeCenterX <= boxSize &&
                boxY <= orangeCenterY && orangeCenterY <= boxY + boxSize) {

            score += 10;
            orangeX = -10;
            sound.playHitSound();

        }

        // Pink
        int pinkCenterX = pinkX + pink.getWidth()/8;
        int pinkCenterY = pinkY + pink.getHeight()/8;

        if (0 <= pinkCenterX && pinkCenterX <= boxSize &&
                boxY <= pinkCenterY && pinkCenterY <= boxY + boxSize) {
            score += 15;
            pinkX = -10;
            sound.playHitSound();

        }

        // Black
        int blackCenterX = blackX + black.getWidth() / 7;
        int blackCenterY = blackY + black.getHeight() / 7;

        if (0 <= blackCenterX && blackCenterX <= boxSize &&
                boxY <= blackCenterY && blackCenterY <= boxY + boxSize) {

            // Stop Timer!!
            timer.cancel();
            timer = null;

            sound.playOverSound();

            // Show Result
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
            finish();

        }



    }


    public boolean onTouchEvent(MotionEvent me) {

        if (start_flg == false) {

            start_flg = true;

            // Why get frame height and box height here?
            // Because the UI has not been set on the screen in OnCreate()!!

            FrameLayout frame = (FrameLayout) findViewById(R.id.frame);
            frameHeight = frame.getHeight();

            boxY = (int)box.getY();

            // The box is a square.(height and width are the same.)
            boxSize = box.getHeight();


            startLabel.setVisibility(View.GONE);
            startLabel2.setVisibility(View.GONE);

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            changePos();
                        }
                    });
                }
            }, 0, 40);


        } else {
            if (me.getAction() == MotionEvent.ACTION_DOWN) {
                action_flg = true;

            } else if (me.getAction() == MotionEvent.ACTION_UP) {
                action_flg = false;
            }
        }

        return true;
    }
    

    // Disable Return Button
/*    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_BACK:
                    return true;
            }
        }

        return super.dispatchKeyEvent(event);
    }
*/
}