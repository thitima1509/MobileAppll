package com.example.jill.pao_yhing_chub;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgMe,imgRobot;
    TextView Sme,Srobot;
    int scMe,scRobot;
    TextView txtSt,txtH,txtS,txtP,txtR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMe = (ImageView)findViewById(R.id.imgMe);
        imgRobot = (ImageView)findViewById(R.id.imgRobot);
        Sme = (TextView)findViewById(R.id.Sme);
        Srobot = (TextView)findViewById(R.id.Srobot);

        txtSt = (TextView) findViewById(R.id.btnSt);
        txtH = (TextView) findViewById(R.id.btnH);
        txtS = (TextView) findViewById(R.id.btnS);
        txtP = (TextView) findViewById(R.id.btnP);
        txtR = (TextView) findViewById(R.id.btnR);
    }

    public void clickStart(View view){
        scMe = 0;
        scRobot = 0;
        Sme.setText("It's Me : 0");
        Srobot.setText("Robot : 0");
        imgMe.setImageResource(0);
        imgRobot.setImageResource(0);
    }

    public void clickHeamer(View view){
        imgMe.setImageResource(R.drawable.heamer);

        Random rd = new Random();
        int r = rd.nextInt(3);

        if (r == 0){
            imgRobot.setImageResource(R.drawable.heamer);
        }
        else if (r == 1){
            imgRobot.setImageResource(R.drawable.scissors);
            scMe++;
            Sme.setText("It's Me : "+scMe);
        }
        else if (r == 2){
            imgRobot.setImageResource(R.drawable.paper);
            scRobot++;
            Srobot.setText("Robot : "+scRobot);
        }

        switch (scMe){
            case 10 :
            AlertDialog.Builder builder =
                    new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("You Win!!!");

            builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //dialog.dismiss();
                }
            });
            builder.show();
        }
        switch (scRobot){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Lose!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
    }

    public void clickScissor(View view){
        imgMe.setImageResource(R.drawable.scissors);

        Random rd = new Random();
        int r = rd.nextInt(3);

        if (r == 0){
            imgRobot.setImageResource(R.drawable.heamer);
            scRobot++;
            Srobot.setText("Robot : "+scRobot);
        }
        else if (r == 1){
            imgRobot.setImageResource(R.drawable.scissors);
        }
        else if (r == 2){
            imgRobot.setImageResource(R.drawable.paper);
            scMe++;
            Sme.setText("It's Me : "+scMe);
        }

        switch (scMe){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Win!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
        switch (scRobot){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Lose!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
    }

    public void clickPaper(View view){
        imgMe.setImageResource(R.drawable.paper);

        Random rd = new Random();
        int r = rd.nextInt(3);

        if (r == 0){
            imgRobot.setImageResource(R.drawable.heamer);
            scMe++;
            Sme.setText("It's Me : "+scMe);
        }
        else if (r == 1){
            imgRobot.setImageResource(R.drawable.scissors);
            scRobot++;
            Srobot.setText("Robot : "+scRobot);
        }
        else if (r == 2){
            imgRobot.setImageResource(R.drawable.paper);
        }

        switch (scMe){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Win!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
        switch (scRobot){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Lose!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
    }

    public void clickRandom(View view){

        Random rd = new Random();
        int r = rd.nextInt(3);

        if (r == 0){
            imgRobot.setImageResource(R.drawable.heamer);
        }
        else if (r == 1){
            imgRobot.setImageResource(R.drawable.scissors);
        }
        else if (r == 2){
            imgRobot.setImageResource(R.drawable.paper);
        }

        Random rd2 = new Random();
        int r2 = rd2.nextInt(3);

        if (r2 == 0){
            imgMe.setImageResource(R.drawable.heamer);

            if (r == 0){}
            if (r == 1){
                scMe++;
                Sme.setText("It's Me : "+scMe);
            }
            if (r == 2){
                scRobot++;
                Srobot.setText("Robot : "+scRobot);
            }
        }
        else if (r2 == 1){
            imgMe.setImageResource(R.drawable.scissors);

            if (r == 0){
                scRobot++;
                Srobot.setText("Robot : "+scRobot);
            }
            if (r == 1){}
            if (r == 2){
                scMe++;
                Sme.setText("It's Me : "+scMe);
            }
        }
        else if (r2 == 2){
            imgMe.setImageResource(R.drawable.paper);

            if (r == 0){
                scMe++;
                Sme.setText("It's Me : "+scMe);
            }
            if (r == 1){
                scRobot++;
                Srobot.setText("Robot : "+scRobot);
            }
            if (r == 2){}
        }

        switch (scMe){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Win!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
        switch (scRobot){
            case 10 :
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You Lose!!!");

                builder.setNegativeButton("จบเกมส์", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                    }
                });
                builder.show();
        }
    }

}
