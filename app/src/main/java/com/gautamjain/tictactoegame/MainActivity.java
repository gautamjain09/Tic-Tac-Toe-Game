package com.gautamjain.tictactoegame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;

    private String startGame = "X";

    int b1=2,b2=2,b3=2,b4=2,b5=2,b6=2,b7=2,b8=2,b9=2;

    int X_count=0;
    int O_count=0;
    int i = 0;

    private TextView ScoreX, ScoreO;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        ScoreO = findViewById(R.id.ScoreO);
        ScoreX = findViewById(R.id.ScoreX);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                resetValues();
                X_count=0;
                O_count=0;
                ScoreO.setText("Score O = " + String.valueOf(O_count));
                ScoreX.setText("Score X = " + String.valueOf(X_count));
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
             @Override
             public void onClick(View v)
             {
                 if(b1 == 2){
                     if (startGame.equals("X")) {
                         button1.setImageResource(R.drawable.x);
                         b1 = 1;
                         i++;
                     } else {
                         button1.setImageResource(R.drawable.o);
                         b1 = 0;
                         i++;
                     }
                     choosePlayer();
                     winninggame();
                 }
             }
         });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b2 == 2){
                    if (startGame.equals("X")) {
                        button2.setImageResource(R.drawable.x);
                        b2 = 1;
                        i++;
                    } else {
                        button2.setImageResource(R.drawable.o);
                        b2 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b3 == 2){
                    if (startGame.equals("X")) {
                        button3.setImageResource(R.drawable.x);
                        b3 = 1;
                        i++;
                    } else {
                        button3.setImageResource(R.drawable.o);
                        b3 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b4 == 2){
                    if (startGame.equals("X")) {
                        button4.setImageResource(R.drawable.x);
                        b4 = 1;
                        i++;
                    } else {
                        button4.setImageResource(R.drawable.o);
                        b4 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b5 == 2){
                    if (startGame.equals("X")) {
                        button5.setImageResource(R.drawable.x);
                        b5 = 1;
                        i++;
                    } else {
                        button5.setImageResource(R.drawable.o);
                        b5 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b6 == 2){
                    if (startGame.equals("X")) {
                        button6.setImageResource(R.drawable.x);
                        b6 = 1;
                        i++;
                    } else {
                        button6.setImageResource(R.drawable.o);
                        b6 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b7 == 2){
                    if (startGame.equals("X")) {
                        button7.setImageResource(R.drawable.x);
                        b7 = 1;
                        i++;
                    } else {
                        button7.setImageResource(R.drawable.o);
                        b7 = 0;
                        i++;
                    }

                    choosePlayer();
                    winninggame();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b8 == 2){
                    if (startGame.equals("X")) {
                        button8.setImageResource(R.drawable.x);
                        b8 = 1;
                        i++;
                    } else {
                        button8.setImageResource(R.drawable.o);
                        b8 = 0;
                        i++;
                    }
                    choosePlayer();
                    winninggame();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(b9 == 2){
                    if (startGame.equals("X")) {
                        button9.setImageResource(R.drawable.x);
                        b9 = 1;
                        i++;
                    } else {
                        button9.setImageResource(R.drawable.o);
                        b9 = 0;
                        i++;
                    }
                    choosePlayer();
                    winninggame();
                }
            }
        });
    }

    private void resetValues()
    {
        button1.setImageDrawable(null);
        button2.setImageDrawable(null);
        button3.setImageDrawable(null);
        button4.setImageDrawable(null);
        button5.setImageDrawable(null);
        button6.setImageDrawable(null);
        button7.setImageDrawable(null);
        button8.setImageDrawable(null);
        button9.setImageDrawable(null);
        b1=2;
        b2=2;
        b3=2;
        b4=2;
        b5=2;
        b6=2;
        b7=2;
        b8=2;
        b9=2;
        i=0;
    }
    
    private void choosePlayer()
    {
        if(startGame.equals("X")) {
            startGame = "O";
        }
        else {
            startGame = "X";
        }
    }

    private void winninggame()
    {
        if(((b1 == 1) &&(b2 == 1)&& (b3 == 1)) || ((b4 == 1) &&(b5 == 1)&& (b6 == 1)) || ((b7 == 1) &&(b8 == 1)&& (b9 == 1))
        || ((b1 == 1) &&(b4 == 1)&& (b7 == 1)) || ((b2 == 1) &&(b5 == 1)&& (b8 == 1)) || ((b3 == 1) &&(b6 == 1)&& (b9 == 1))
        || ((b1 == 1) &&(b5 == 1)&& (b9 == 1)) || ((b3 == 1) &&(b5 == 1)&& (b7 == 1)))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    resetValues();
                }
            });

                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    X_count++;
                    ScoreX.setText("Score X = " + String.valueOf(X_count));
        }

        else if(((b1 == 0) &&(b2 == 0)&& (b3 == 0)) || ((b4 == 0) &&(b5 == 0)&& (b6 == 0)) || ((b7 == 0) &&(b8 == 0)&& (b9 == 0))
                || ((b1 == 0) &&(b4 == 0)&& (b7 == 0)) || ((b2 == 0) &&(b5 == 0)&& (b8 == 0)) || ((b3 == 0) &&(b6 == 0)&& (b9 == 0))
                || ((b1 == 0) &&(b5 == 0)&& (b9 == 0)) || ((b3 == 0) &&(b5 == 0)&& (b7 == 0)))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            O_count++;
            ScoreO.setText("Score O =  " + String.valueOf(O_count));
        }

        else {
            if(i==9) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }
}