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
                (new Handler()).postDelayed(this::remove, 3000);
            }
        }
        if(cardFlip==2 && compare[0]!=compare[1]){
            cardFlip=0;
            (new Handler()).postDelayed(this::flipDown, 3000);
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

        int[][] setup = new int[5][6];
        for(int i=0;i<setup.length;i++){
            for(int j=0;j<setup[0].length;j++){
                setup[i][j] = (int)(Math.random()*3+1);
            }
        }

        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                compare[0]=setup[0][0];
                if(setup[0][0] == 1){
                    button.setBackgroundResource(R.drawable.mark);
                }else if(setup[0][0] == 2){
                    button.setBackgroundResource(R.drawable.b);
                }else if(setup[0][0] == 3){
                    button.setBackgroundResource(R.drawable.c);
                }else if(setup[0][0] == 4){
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
                compare[1]=setup[0][1];
                if(setup[0][1] == 1){
                    button2.setBackgroundResource(R.drawable.mark);
                }else if(setup[0][1] == 2){
                    button2.setBackgroundResource(R.drawable.b);
                }else if(setup[0][1] == 3){
                    button2.setBackgroundResource(R.drawable.c);
                }else if(setup[0][1] == 4){
                    button2.setBackgroundResource(R.drawable.joker1);
                }else{
                    button2.setBackgroundResource(R.drawable.icon);
                }
                flip();
            }
        });


    }
}