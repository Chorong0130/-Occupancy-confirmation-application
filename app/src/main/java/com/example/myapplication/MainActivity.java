package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //static RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 콘텐츠 뷰 설정
        setContentView(R.layout.activity_main);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);


        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        //ImageView dance_drchang = findViewById(R.id.dance_drchang);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        ImageButton btn1 = findViewById(R.id.imageButton);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);
        //AnimationDrawable aniDanceDrawable5 = (AnimationDrawable) dance_drchang.getDrawable();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int time = 0;
            final int[] color = {0, 0, 0};
            int vidx = 0;
            final int maxColor = 200;
            final int tick = 50;
            final int[][] v = {
                    { (maxColor / tick), 0, 0},
                    {0, 0,  (-maxColor / tick)},
                    {0,  (maxColor / tick), 0},
                    { (-maxColor / tick), 0, 0},
                    {0, 0,  (maxColor / tick)},
                    {0,  (-maxColor / tick), 0},
            };

            @Override
            public void run() {
                MainActivity.this.runOnUiThread(() -> {
                    if (time != 0 && time % tick == 0) {
                        vidx = vidx == 5 ? 0 : vidx + 1;
                    }
                    time++;
                    for (int i = 0; i < 3; ++i) {
                        if (color[i] + v[vidx][i] > 0) {
                            color[i] += v[vidx][i];
                        }
                    }
                    textView.setTextColor(Color.rgb(color[0], color[1], color[2]));
                    textView2.setTextColor(Color.rgb(color[0], color[1], color[2]));
                    textView3.setTextColor(Color.rgb(color[0], color[1], color[2]));
                    textView4.setTextColor(Color.rgb(color[0], color[1], color[2]));
                    textView5.setTextColor(Color.rgb(color[0], color[1], color[2]));
                    textView6.setTextColor(Color.rgb(color[0], color[1], color[2]));
                });
            }

        };
        timer.schedule(timerTask,17,17);

        btn1.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView.setText("재실");
                    Animation kkhmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.kkhmove1);
                    imageView.startAnimation(kkhmove1);
                    i++;
                }
                else if (i == 1) {
                    textView.setText("회의");

                    /*Animation test = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.test);
                    imageView.startAnimation(test);*/

                    i++;
                }
                else if (i == 2) {
                    textView.setText("강의");
                    Animation kkhmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.kkhmove2);
                    imageView.startAnimation(kkhmove2);
                    i++;
                }
                else if (i == 3) {
                    textView.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView.setText("교외");
                    i++;
                }
                else {
                    textView.setText("퇴근");
                    i = 0;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView2.setText("재실");
                    Animation jswmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.jswmove1);
                    imageView2.startAnimation(jswmove1);
                    i++;
                }
                else if (i == 1) {
                    textView2.setText("회의");
                    i++;
                }
                else if (i == 2) {
                    textView2.setText("강의");
                    Animation jswmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.jswmove2);
                    imageView2.startAnimation(jswmove2);
                    i++;
                }
                else if (i == 3) {
                    textView2.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView2.setText("교외");
                    i++;
                }
                else {
                    textView2.setText("퇴근");
                    i = 0;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView3.setText("재실");
                    Animation hhsmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.hhsmove1);
                    imageView3.startAnimation(hhsmove1);
                    i++;
                }
                else if (i == 1) {
                    textView3.setText("회의");
                    i++;
                }
                else if (i == 2) {
                    textView3.setText("강의");
                    Animation hhsmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.hhsmove2);
                    imageView3.startAnimation(hhsmove2);
                    i++;
                }
                else if (i == 3) {
                    textView3.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView3.setText("교외");
                    i++;
                }
                else {
                    textView3.setText("퇴근");
                    i = 0;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView4.setText("재실");
                    Animation sshmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sshmove1);
                    imageView4.startAnimation(sshmove1);
                    i++;
                }
                else if (i == 1) {
                    textView4.setText("회의");
                    i++;
                }
                else if (i == 2) {
                    textView4.setText("강의");
                    Animation sshmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sshmove2);
                    imageView4.startAnimation(sshmove2);
                    i++;
                }
                else if (i == 3) {
                    textView4.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView4.setText("교외");
                    i++;
                }
                else {
                    textView4.setText("퇴근");
                    i = 0;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView5.setText("재실");
                    Animation drchangmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.drchangmove1);
                    imageView5.startAnimation(drchangmove1);
/*
                    if(aniDanceDrawable5 != null) {
                        aniDanceDrawable5.start();
                        try {
                            aniDanceDrawable5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }*/
                    /*else {
                        Toast.makeText(this, "애니메이션 실패!!", Toast.LENGTH_SHORT).show();
                    }*/

                    i++;
                }
                else if (i == 1) {
                    textView5.setText("회의");
                    i++;
                }
                else if (i == 2) {
                    textView5.setText("강의");
                    Animation drchangmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.drchangmove2);
                    imageView5.startAnimation(drchangmove2);
                    i++;
                }
                else if (i == 3) {
                    textView5.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView5.setText("교외");
                    i++;
                }
                else if (i == 5) {
                    textView5.setText("연구실");
                    i++;
                }
                else {
                    textView5.setText("퇴근");
                    i = 0;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            int i = 0;

            public void onClick(View v) {
                if (i == 0) {
                    textView6.setText("재실");
                    Animation rwjmove1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rwjmove1);
                    imageView6.startAnimation(rwjmove1);
                    i++;
                }
                else if (i == 1) {
                    textView6.setText("회의");
                    i++;
                }
                else if (i == 2) {
                    textView6.setText("강의");
                    Animation rwjmove2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rwjmove2);
                    imageView6.startAnimation(rwjmove2);
                    i++;
                }
                else if (i == 3) {
                    textView6.setText("교내");
                    i++;
                }
                else if (i == 4) {
                    textView6.setText("교외");
                    i++;
                }
                else if (i == 5) {
                    textView6.setText("연구실");
                    i++;
                }
                else {
                    textView6.setText("퇴근");
                    i = 0;
                }
            }
        });

    }
}