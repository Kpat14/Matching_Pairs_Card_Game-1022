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
    int[] storeCount = new int[2];
    int count=0;
    int score=0;
    int ReturnedButton1=0;
    int ReturnedButton2=0;


    void makeCompare(int a, int b, int[][] setup){
        count++;
        if(count==1){
            compare[0] = setup[a][b];
        }
        if(count==2){
            compare[1] = setup[a][b];
            count=0;
        }

    }

    void score(){
        score++;
        if(score==15){
            System.out.println("YOU WIN!!!!!!!");
        }
    }

    //Function to reset pictures back to default image
    void flipDown(){
        compare[0]=0;
        compare[1]=0;
        if(ReturnedButton1 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 2){
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setBackgroundResource(R.drawable.joker1);
        }
       if(ReturnedButton2 == 1) {
           ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
           button2.setBackgroundResource(R.drawable.joker1);
       }
        if(ReturnedButton2 == 2){
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton2 == 8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if(ReturnedButton1 == 10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setBackgroundResource(R.drawable.joker1);
        }
    }
    void remove(){
        compare[0]=0;
        compare[1]=0;
        if(ReturnedButton1==1){
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==2){
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setVisibility(View.GONE);
        }

        if(ReturnedButton2==1){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
            button2.setVisibility(View.GONE);
        }
       if(ReturnedButton2==2){
           ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
           button2.setVisibility(View.GONE);
       }
        if(ReturnedButton2==3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setVisibility(View.GONE);
        }

    }
    //Function that increases cardFlip by 1, if cardFlip is at two should flip both cards down.
    void flip(int count){
        cardFlip++;
        if(cardFlip == 1){
            storeCount[0] = count;
        }else{
            storeCount[1] = count;
        }
        if(cardFlip==2){
            ReturnedButton1 = storeCount[0];
            ReturnedButton2=  storeCount[1];
            if(compare[0]==compare[1]){
                (new Handler()).postDelayed(this:: remove,2000);
                score();
            }else if (compare[0]!=compare[1]){
                ReturnedButton1 = storeCount[0];
                ReturnedButton2=storeCount[1];
                (new Handler()).postDelayed(this::flipDown, 2000);
            }
            cardFlip=0;
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
        /*
        int[][] setup = new int[5][6];


        for(int i=0;i<setup.length;i++){
            for(int j=0;j<setup[0].length;j++){
                setup[i][j] = (int)(Math.random()*3+1);
            }
        }

         */
        int[][] setup={{1, 2, 3, 4, 5},{6,7,8,9,10},{11,12,13,14,15},{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        for(int i=0;i<setup.length;i++){
            for(int j=0;j< setup[i].length;j++){
                int a1= (int) (Math.random()* setup.length);
                int b1 = (int)(Math.random()*setup[i].length);
                int hold = setup[i][j];
                setup[i][j]=setup[a1][b1];
                setup[a1][b1]=hold;
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
                    button.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
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
                    button2.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button2.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button2.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button2.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button2.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button2.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button2.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button2.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button2.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button2.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button2.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button2.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button2.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button2.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button2.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=2;
                int ButtonNumber=3;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button3.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button3.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button3.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button3.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button3.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button3.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button3.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button3.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button3.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button3.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button3.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button3.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button3.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button3.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button3.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });


        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=3;
                int ButtonNumber=4;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button4.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button4.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button4.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button4.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button4.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button4.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button4.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button4.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button4.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button4.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button4.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button4.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button4.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button4.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button4.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=4;
                int ButtonNumber=5;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button5.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button5.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button5.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button5.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button5.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button5.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button5.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button5.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button5.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button5.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button5.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button5.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button5.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button5.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button5.setBackgroundResource(R.drawable.triangle);
                }
             flip(ButtonNumber);
            }
        });

        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=0;
                int ButtonNumber=6;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button6.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button6.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button6.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button6.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button6.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button6.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button6.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button6.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button6.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button6.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button6.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button6.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button6.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button6.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button6.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });

        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=1;
                int ButtonNumber=7;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button7.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button7.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button7.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button7.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button7.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button7.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button7.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button7.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button7.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button7.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button7.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button7.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button7.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button7.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button7.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });

        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=2;
                int ButtonNumber=8;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button8.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button8.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button8.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button8.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button8.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button8.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button8.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button8.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button8.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button8.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button8.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button8.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button8.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button8.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button8.setBackgroundResource(R.drawable.triangle);
                }
               flip(ButtonNumber);
            }
        });

        ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=3;
                int ButtonNumber=9;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button9.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button9.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button9.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button9.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button9.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button9.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button9.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button9.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button9.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button9.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button9.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button9.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button9.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button9.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button9.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=4;
                int ButtonNumber=10;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button10.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button10.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button10.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button10.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button10.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button10.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button10.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button10.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button10.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button10.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button10.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button10.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button10.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button10.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button10.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });


    }
}