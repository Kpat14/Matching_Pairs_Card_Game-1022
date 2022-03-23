package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class game extends AppCompatActivity {
    private Button button;
    //Variable to count cardFlips
    int cardFlip=0;
    int[] compare = new int[2];
    int count=0;
    int score=0;


    void makeCompare(int a, int b, int[][] setup){
        if(count==0){
            compare[0] = setup[a][b];
        }
        if(count==1){
            compare[1] = setup[a][b];
            count=0;
        }
        count++;
    }

    void score(){
        score++;
        if(score==15){
            System.out.println("YOU WIN!!!!!!!");
        }
    }

    //Function to reset pictures back to default image
    void flipDown(){
        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setBackgroundResource(R.drawable.joker1);
        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setBackgroundResource(R.drawable.joker1);

    }
    void remove(){
        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setVisibility(View.GONE);
        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setVisibility(View.GONE);
    }
    //Function that increases cardFlip by 1, if cardFlip is at two should flip both cards down.
    void flip(){
        cardFlip++;
        if(cardFlip==2){
            if(compare[0]==compare[1]){
                //(new Handler()).postDelayed(this::remove, 3000);
                try {
                    wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                remove();
                score();
            }
        }
        if(cardFlip==2 && compare[0]!=compare[1]){
            cardFlip=0;
            //(new Handler()).postDelayed(this::flipDown, 3000);
            try {
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flipDown();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(game.this, endGame.class);
                startActivity(intent);
            }
        });
        //setups up matrix that can hold 30 elements
        int[][] setup = new int[5][6];
        for(int i=0;i<setup.length;i++){
            for(int j=0;j<setup[0].length;j++){
                setup[i][j] = (int)(Math.random()*3+1);
            }
        }

        // SETTING UP THE BUTTONS

        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a=0;
                int b=0;
                int ButtonNumber=1;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button.setBackgroundResource(R.drawable.joker1);
                }else{
                    button.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=1;
                int ButtonNumber=2;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button2.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button2.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button2.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button2.setBackgroundResource(R.drawable.joker1);
                }else{
                    button2.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=2;
                int ButtonNumber=3;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button3.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button3.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button3.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button3.setBackgroundResource(R.drawable.joker1);
                }else{
                    button3.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });


        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=3;
                int ButtonNumber=4;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button4.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button4.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button4.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button4.setBackgroundResource(R.drawable.joker1);
                }else{
                    button4.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=4;
                int ButtonNumber=5;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button5.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button5.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button5.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button5.setBackgroundResource(R.drawable.joker1);
                }else{
                    button5.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=0;
                int ButtonNumber=6;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button6.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button6.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button6.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button6.setBackgroundResource(R.drawable.joker1);
                }else{
                    button6.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=1;
                int ButtonNumber=7;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button7.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button7.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button7.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button7.setBackgroundResource(R.drawable.joker1);
                }else{
                    button7.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=2;
                int ButtonNumber=8;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button8.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button8.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button8.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button8.setBackgroundResource(R.drawable.joker1);
                }else{
                    button8.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=3;
                int ButtonNumber=9;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button9.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button9.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button9.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button9.setBackgroundResource(R.drawable.joker1);
                }else{
                    button9.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=4;
                int ButtonNumber=10;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button10.setBackgroundResource(R.drawable.mark);
                }else if(setup[a][b] == 2){
                    button10.setBackgroundResource(R.drawable.b);
                }else if(setup[a][b] == 3){
                    button10.setBackgroundResource(R.drawable.c);
                }else if(setup[a][b] == 4){
                    button10.setBackgroundResource(R.drawable.joker1);
                }else{
                    button10.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });


    }
}