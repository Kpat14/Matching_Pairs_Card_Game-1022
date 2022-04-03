package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class game extends AppCompatActivity {
    private Button button;
    private Button button2;
    private static long timer_in_millis = 180000;

    private TextView countdown;
    private CountDownTimer mcountdownTimer;

    private boolean running;

    private boolean addTime_matched = false;
    private boolean setcomplete = true;
    int stopDoubleClick =0;

    private long mTimeLeftInMillis = timer_in_millis;

    //Variable to count cardFlips
    int cardFlip = 0;
    int[] compare = new int[2];
    int[] storeCount = new int[2];
    int count = 0;
    private static double score = 0;
    int ReturnedButton1 = 0;
    int ReturnedButton2 = 0;


    int[][] setup =
                    {{1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15},
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15}};

    public static double getMyString() {
        return score;
    }



    void setupGameArray(){
        for (int i = 0; i < setup.length; i++) {
            for (int j = 0; j < setup[i].length; j++) {
                int a1 = (int) (Math.random() * setup.length);
                int b1 = (int) (Math.random() * setup[i].length);
                int hold = setup[i][j];
                setup[i][j] = setup[a1][b1];
                setup[a1][b1] = hold;
            }
        }
    }

    void makeCompare(int a, int b, int[][] setup) {
        count++;
        if (count == 1) {
            compare[0] = setup[a][b];
        }
        if (count == 2) {
            compare[1] = setup[a][b];
            count = 0;
        }

    }

    void score() {
        score = score +0.5;
        if (score%15==0) {
            System.out.println("Set complete. Well Done!!!!!!!");
        }
        if(score==1){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("1");
        }else if(score==2){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("2");
        }else if(score==3){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("3");
        }else if(score==4){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("4");
        }else if(score==5){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("5");
        }else if(score==6){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("6");
        }else if(score==7){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("7");
        }else if(score==8){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("8");
        }else if(score==9){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("9");
        }else if(score==10){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("10");
        }else if(score==11){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("11");
        }else if(score==12){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("12");
        }else if(score==13){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("13");
        }else if(score==14){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("14");
        }else if(score==15){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("15");
            setupGameArray();
            setBack();
        }else if(score==16){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("16");
        } else if(score==17){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("17");
        }else if(score==18){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("18");
        }else if(score==19){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("19");
        }else if(score==20){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("20");
        }else if(score==21){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("21");
        }else if(score==21){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("21");
        }else if(score==22){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("22");
        }else if(score==23){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("23");
        }else if(score==24){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("24");
        }else if(score==25){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("25");
        }else if(score==26){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("26");
        }else if(score==27){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("27");
        }else if(score==28){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("28");
        }else if(score==29){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("29");
        }else if(score==30){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("30");
            setupGameArray();
            setBack();
        }else if(score==31){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("31");
        }else if(score==32){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("32");
        }else if(score==33){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("33");
        }else if(score==34){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("34");
        }else if(score==35){
            TextView tv1 = (TextView)findViewById(R.id.textView4);
            tv1.setText("35");
        }
    }
    public void setBack(){
        ImageButton button1 = (ImageButton) findViewById(R.id.Button1);
        button1.setVisibility(View.VISIBLE);
        button1.setBackgroundResource(R.drawable.joker1);
        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setVisibility(View.VISIBLE);
        button2.setBackgroundResource(R.drawable.joker1);
        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button3.setVisibility(View.VISIBLE);
        button3.setBackgroundResource(R.drawable.joker1);
        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button4.setVisibility(View.VISIBLE);
        button4.setBackgroundResource(R.drawable.joker1);
        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button5.setVisibility(View.VISIBLE);
        button5.setBackgroundResource(R.drawable.joker1);
        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button6.setVisibility(View.VISIBLE);
        button6.setBackgroundResource(R.drawable.joker1);
        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button7.setVisibility(View.VISIBLE);
        button7.setBackgroundResource(R.drawable.joker1);
        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button8.setVisibility(View.VISIBLE);
        button8.setBackgroundResource(R.drawable.joker1);
        ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
        button9.setVisibility(View.VISIBLE);
        button9.setBackgroundResource(R.drawable.joker1);
        ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
        button10.setVisibility(View.VISIBLE);
        button10.setBackgroundResource(R.drawable.joker1);
        ImageButton button11 = (ImageButton) findViewById(R.id.Button11);
        button11.setVisibility(View.VISIBLE);
        button11.setBackgroundResource(R.drawable.joker1);
        ImageButton button12 = (ImageButton) findViewById(R.id.Button12);
        button12.setVisibility(View.VISIBLE);
        button12.setBackgroundResource(R.drawable.joker1);
        ImageButton button13 = (ImageButton) findViewById(R.id.Button13);
        button13.setVisibility(View.VISIBLE);
        button13.setBackgroundResource(R.drawable.joker1);
        ImageButton button14 = (ImageButton) findViewById(R.id.Button14);
        button14.setVisibility(View.VISIBLE);
        button14.setBackgroundResource(R.drawable.joker1);
        ImageButton button15 = (ImageButton) findViewById(R.id.Button15);
        button15.setVisibility(View.VISIBLE);
        button15.setBackgroundResource(R.drawable.joker1);
        ImageButton button16 = (ImageButton) findViewById(R.id.Button16);
        button16.setVisibility(View.VISIBLE);
        button16.setBackgroundResource(R.drawable.joker1);
        ImageButton button17 = (ImageButton) findViewById(R.id.Button17);
        button17.setVisibility(View.VISIBLE);
        button17.setBackgroundResource(R.drawable.joker1);
        ImageButton button18 = (ImageButton) findViewById(R.id.Button18);
        button18.setVisibility(View.VISIBLE);
        button18.setBackgroundResource(R.drawable.joker1);
        ImageButton button19 = (ImageButton) findViewById(R.id.Button19);
        button19.setVisibility(View.VISIBLE);
        button19.setBackgroundResource(R.drawable.joker1);
        ImageButton button20 = (ImageButton) findViewById(R.id.Button20);
        button20.setVisibility(View.VISIBLE);
        button20.setBackgroundResource(R.drawable.joker1);
        ImageButton button21 = (ImageButton) findViewById(R.id.Button21);
        button21.setVisibility(View.VISIBLE);
        button21.setBackgroundResource(R.drawable.joker1);
        ImageButton button22 = (ImageButton) findViewById(R.id.Button22);
        button22.setVisibility(View.VISIBLE);
        button22.setBackgroundResource(R.drawable.joker1);
        ImageButton button23 = (ImageButton) findViewById(R.id.Button23);
        button23.setVisibility(View.VISIBLE);
        button23.setBackgroundResource(R.drawable.joker1);
        ImageButton button24 = (ImageButton) findViewById(R.id.Button24);
        button24.setVisibility(View.VISIBLE);
        button24.setBackgroundResource(R.drawable.joker1);
        ImageButton button25 = (ImageButton) findViewById(R.id.Button25);
        button25.setVisibility(View.VISIBLE);
        button25.setBackgroundResource(R.drawable.joker1);
        ImageButton button26 = (ImageButton) findViewById(R.id.Button26);
        button26.setVisibility(View.VISIBLE);
        button26.setBackgroundResource(R.drawable.joker1);
        ImageButton button27 = (ImageButton) findViewById(R.id.Button27);
        button27.setVisibility(View.VISIBLE);
        button27.setBackgroundResource(R.drawable.joker1);
        ImageButton button28 = (ImageButton) findViewById(R.id.Button28);
        button28.setVisibility(View.VISIBLE);
        button28.setBackgroundResource(R.drawable.joker1);
        ImageButton button29 = (ImageButton) findViewById(R.id.Button29);
        button29.setVisibility(View.VISIBLE);
        button29.setBackgroundResource(R.drawable.joker1);
        ImageButton button30 = (ImageButton) findViewById(R.id.Button30);
        button30.setVisibility(View.VISIBLE);
        button30.setBackgroundResource(R.drawable.joker1);
    }
   public void makeVisible(){
        ImageButton button1 = (ImageButton) findViewById(R.id.Button1);
        button1.setVisibility(View.VISIBLE);
        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setVisibility(View.VISIBLE);
        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button3.setVisibility(View.VISIBLE);
        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button4.setVisibility(View.VISIBLE);
        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button5.setVisibility(View.VISIBLE);
        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button6.setVisibility(View.VISIBLE);
        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button7.setVisibility(View.VISIBLE);
        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button8.setVisibility(View.VISIBLE);
       ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
       button9.setVisibility(View.VISIBLE);
       ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
       button10.setVisibility(View.VISIBLE);
       ImageButton button11 = (ImageButton) findViewById(R.id.Button11);
       button11.setVisibility(View.VISIBLE);
       ImageButton button12 = (ImageButton) findViewById(R.id.Button12);
       button12.setVisibility(View.VISIBLE);
       ImageButton button13 = (ImageButton) findViewById(R.id.Button13);
       button13.setVisibility(View.VISIBLE);
       ImageButton button14 = (ImageButton) findViewById(R.id.Button14);
       button14.setVisibility(View.VISIBLE);
       ImageButton button15 = (ImageButton) findViewById(R.id.Button15);
       button15.setVisibility(View.VISIBLE);
       ImageButton button16 = (ImageButton) findViewById(R.id.Button16);
       button16.setVisibility(View.VISIBLE);
       ImageButton button17 = (ImageButton) findViewById(R.id.Button17);
       button17.setVisibility(View.VISIBLE);
       ImageButton button18 = (ImageButton) findViewById(R.id.Button18);
       button18.setVisibility(View.VISIBLE);
       ImageButton button19 = (ImageButton) findViewById(R.id.Button19);
       button19.setVisibility(View.VISIBLE);
       ImageButton button20 = (ImageButton) findViewById(R.id.Button20);
       button20.setVisibility(View.VISIBLE);
       ImageButton button21 = (ImageButton) findViewById(R.id.Button21);
       button21.setVisibility(View.VISIBLE);
       ImageButton button22 = (ImageButton) findViewById(R.id.Button22);
       button22.setVisibility(View.VISIBLE);
       ImageButton button23 = (ImageButton) findViewById(R.id.Button23);
       button23.setVisibility(View.VISIBLE);
       ImageButton button24 = (ImageButton) findViewById(R.id.Button24);
       button24.setVisibility(View.VISIBLE);
       ImageButton button25 = (ImageButton) findViewById(R.id.Button25);
       button25.setVisibility(View.VISIBLE);
       ImageButton button26 = (ImageButton) findViewById(R.id.Button26);
       button26.setVisibility(View.VISIBLE);
       ImageButton button27 = (ImageButton) findViewById(R.id.Button27);
       button27.setVisibility(View.VISIBLE);
       ImageButton button28 = (ImageButton) findViewById(R.id.Button28);
       button28.setVisibility(View.VISIBLE);
       ImageButton button29 = (ImageButton) findViewById(R.id.Button29);
       button29.setVisibility(View.VISIBLE);
       ImageButton button30 = (ImageButton) findViewById(R.id.Button30);
       button30.setVisibility(View.VISIBLE);
    }


    //Function to reset pictures back to default image
    void flipDown() {
        compare[0] = 0;
        compare[1] = 0;
        if (ReturnedButton1 == 1) {
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 2) {
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 3) {
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 4) {
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 5) {
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 6) {
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 7) {
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 8) {
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 9) {
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 10) {
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 11) {
            ImageButton button = (ImageButton) findViewById(R.id.Button11);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 12) {
            ImageButton button = (ImageButton) findViewById(R.id.Button12);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 13) {
            ImageButton button = (ImageButton) findViewById(R.id.Button13);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 14) {
            ImageButton button = (ImageButton) findViewById(R.id.Button14);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 15) {
            ImageButton button = (ImageButton) findViewById(R.id.Button15);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 16) {
            ImageButton button = (ImageButton) findViewById(R.id.Button16);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 17) {
            ImageButton button = (ImageButton) findViewById(R.id.Button17);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 18) {
            ImageButton button = (ImageButton) findViewById(R.id.Button18);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 19) {
            ImageButton button = (ImageButton) findViewById(R.id.Button19);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 20) {
            ImageButton button = (ImageButton) findViewById(R.id.Button20);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 21) {
            ImageButton button = (ImageButton) findViewById(R.id.Button21);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 22) {
            ImageButton button = (ImageButton) findViewById(R.id.Button22);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 23) {
            ImageButton button = (ImageButton) findViewById(R.id.Button23);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 24) {
            ImageButton button = (ImageButton) findViewById(R.id.Button24);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 25) {
            ImageButton button = (ImageButton) findViewById(R.id.Button25);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 26) {
            ImageButton button = (ImageButton) findViewById(R.id.Button26);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 27) {
            ImageButton button = (ImageButton) findViewById(R.id.Button27);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 28) {
            ImageButton button = (ImageButton) findViewById(R.id.Button28);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 29) {
            ImageButton button = (ImageButton) findViewById(R.id.Button29);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton1 == 30) {
            ImageButton button = (ImageButton) findViewById(R.id.Button30);
            button.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 1) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 2) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 3) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button3);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 4) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button4);
            button2.setBackgroundResource(R.drawable.joker1);

        }
        if (ReturnedButton2 == 5) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button5);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 6) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button6);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 7) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button7);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 8) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button8);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 9) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button9);
            button2.setBackgroundResource(R.drawable.joker1);

        }
        if (ReturnedButton2 == 10) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button10);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 11) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button11);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 12) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button12);
            button2.setBackgroundResource(R.drawable.joker1);

        }
        if (ReturnedButton2 == 13) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button13);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 14) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button14);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 15) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button15);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 16) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button16);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 17) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button17);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 18) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button18);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 19) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button19);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 20) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setBackgroundResource(R.drawable.joker1);

        }
        if (ReturnedButton2 == 20) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 21) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button21);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 22) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button22);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 23) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button23);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 24) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button24);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 25) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button25);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 26) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button26);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 27) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button27);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 28) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button28);
            button2.setBackgroundResource(R.drawable.joker1);
        }
        if (ReturnedButton2 == 29) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button29);
            button2.setBackgroundResource(R.drawable.joker1);

        }
        if (ReturnedButton2 == 30) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button30);
            button2.setBackgroundResource(R.drawable.joker1);
        }


    }

    void remove() {
        compare[0] = 0;
        compare[1] = 0;
        score();
        if (ReturnedButton1 == 1) {
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 2) {
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 3) {
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 4) {
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 5) {
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 6) {
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 7) {
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 8) {
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 9) {
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setVisibility(View.GONE);
        }
        if (ReturnedButton1 == 10) {
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setVisibility(View.GONE);
        }
        if (ReturnedButton1 == 11) {
            ImageButton button = (ImageButton) findViewById(R.id.Button11);
            button.setVisibility(View.GONE);
        }
        if (ReturnedButton1 == 12) {
            ImageButton button = (ImageButton) findViewById(R.id.Button12);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 13) {
            ImageButton button = (ImageButton) findViewById(R.id.Button13);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 14) {
            ImageButton button = (ImageButton) findViewById(R.id.Button14);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 15) {
            ImageButton button = (ImageButton) findViewById(R.id.Button15);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 16) {
            ImageButton button = (ImageButton) findViewById(R.id.Button16);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 17) {
            ImageButton button = (ImageButton) findViewById(R.id.Button17);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 18) {
            ImageButton button = (ImageButton) findViewById(R.id.Button18);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 19) {
            ImageButton button = (ImageButton) findViewById(R.id.Button19);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 20) {
            ImageButton button = (ImageButton) findViewById(R.id.Button20);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 21) {
            ImageButton button = (ImageButton) findViewById(R.id.Button21);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 22) {
            ImageButton button = (ImageButton) findViewById(R.id.Button22);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 23) {
            ImageButton button = (ImageButton) findViewById(R.id.Button23);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 24) {
            ImageButton button = (ImageButton) findViewById(R.id.Button24);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 25) {
            ImageButton button = (ImageButton) findViewById(R.id.Button25);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 26) {
            ImageButton button = (ImageButton) findViewById(R.id.Button26);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 27) {
            ImageButton button = (ImageButton) findViewById(R.id.Button27);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 28) {
            ImageButton button = (ImageButton) findViewById(R.id.Button28);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 29) {
            ImageButton button = (ImageButton) findViewById(R.id.Button29);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton1 == 30) {
            ImageButton button = (ImageButton) findViewById(R.id.Button30);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }

        if (ReturnedButton2 == 1) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 2) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 3) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button3);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 4) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button4);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 5) {
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 6) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button6);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 7) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button7);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 8) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button8);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 9) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button9);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 10) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button10);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 11) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button11);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 12) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button12);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 13) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button13);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 14) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button14);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 15) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button15);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 16) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button16);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 17) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button17);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 18) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button18);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 19) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button19);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 20) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 21) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button21);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 22) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button22);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 23) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button23);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 24) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button24);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 25) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button25);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 26) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button26);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 27) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button27);
            button2.setVisibility(View.GONE);
            addTime_matched = true;

        }
        if (ReturnedButton2 == 28) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button28);
            button2.setVisibility(View.GONE);
            addTime_matched = true;
        }
        if (ReturnedButton2 == 29) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button29);
            button2.setVisibility(View.GONE);
            addTime_matched = true;

        }
        if (ReturnedButton2 == 30) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button30);
            button2.setVisibility(View.INVISIBLE);
            addTime_matched = true;
        }

    }
    //Function that increases cardFlip by 1, if cardFlip is at two should flip both cards down.


    void flip(int count) {
        cardFlip++;
        if (cardFlip == 1) {
            storeCount[0] = count;

        } else {
            storeCount[1] = count;

        }
        if (storeCount[0] == storeCount[1]) {
            cardFlip = 0;
            ReturnedButton1 = storeCount[0];
            (new Handler()).postDelayed(this::flipDown, 500);
        }
        if (cardFlip == 2) {
            ImageButton button1 = (ImageButton) findViewById(R.id.Button1);
            button1.setClickable(false);
            ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
            button2.setClickable(false);
            ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
            button3.setClickable(false);
            ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
            button4.setClickable(false);
            ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
            button5.setClickable(false);
            ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
            button6.setClickable(false);
            ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
            button7.setClickable(false);
            ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
            button8.setClickable(false);
            ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
            button9.setClickable(false);
            ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
            button10.setClickable(false);
            ImageButton button11 = (ImageButton) findViewById(R.id.Button11);
            button11.setClickable(false);
            ImageButton button12 = (ImageButton) findViewById(R.id.Button12);
            button12.setClickable(false);
            ImageButton button13 = (ImageButton) findViewById(R.id.Button13);
            button13.setClickable(false);
            ImageButton button14 = (ImageButton) findViewById(R.id.Button14);
            button14.setClickable(false);
            ImageButton button15 = (ImageButton) findViewById(R.id.Button15);
            button15.setClickable(false);
            ImageButton button16 = (ImageButton) findViewById(R.id.Button16);
            button16.setClickable(false);
            ImageButton button17 = (ImageButton) findViewById(R.id.Button17);
            button17.setClickable(false);
            ImageButton button18 = (ImageButton) findViewById(R.id.Button18);
            button18.setClickable(false);
            ImageButton button19 = (ImageButton) findViewById(R.id.Button19);
            button19.setClickable(false);
            ImageButton button20 = (ImageButton) findViewById(R.id.Button20);
            button20.setClickable(false);
            ImageButton button21 = (ImageButton) findViewById(R.id.Button21);
            button21.setClickable(false);
            ImageButton button22 = (ImageButton) findViewById(R.id.Button22);
            button22.setClickable(false);
            ImageButton button23 = (ImageButton) findViewById(R.id.Button23);
            button23.setClickable(false);
            ImageButton button24 = (ImageButton) findViewById(R.id.Button24);
            button24.setClickable(false);
            ImageButton button25 = (ImageButton) findViewById(R.id.Button25);
            button25.setClickable(false);
            ImageButton button26 = (ImageButton) findViewById(R.id.Button26);
            button26.setClickable(false);
            ImageButton button27 = (ImageButton) findViewById(R.id.Button27);
            button27.setClickable(false);
            ImageButton button28 = (ImageButton) findViewById(R.id.Button28);
            button28.setClickable(false);
            ImageButton button29 = (ImageButton) findViewById(R.id.Button29);
            button29.setClickable(false);
            ImageButton button30 = (ImageButton) findViewById(R.id.Button30);
            button30.setClickable(false);

            ReturnedButton1 = storeCount[0];
            ReturnedButton2 = storeCount[1];
            if (compare[0] == compare[1]) {
                (new Handler()).postDelayed(this::remove, 500);
                addTime_matched = true;
                score();
            } else if (compare[0] != compare[1]) {

                ReturnedButton1 = storeCount[0];
                ReturnedButton2 = storeCount[1];
                addTime_matched = false;
                (new Handler()).postDelayed(this::flipDown, 500);
            }
            cardFlip = 0;
            reset();
            button1.setClickable(true);
            button2.setClickable(true);
            button3.setClickable(true);
            button4.setClickable(true);
            button5.setClickable(true);
            button6.setClickable(true);
            button7.setClickable(true);
            button8.setClickable(true);
            button9.setClickable(true);
            button10.setClickable(true);
            button11.setClickable(true);
            button12.setClickable(true);
            button13.setClickable(true);
            button14.setClickable(true);
            button15.setClickable(true);
            button16.setClickable(true);
            button17.setClickable(true);
            button18.setClickable(true);
            button19.setClickable(true);
            button20.setClickable(true);
            button21.setClickable(true);
            button22.setClickable(true);
            button23.setClickable(true);
            button24.setClickable(true);
            button25.setClickable(true);
            button26.setClickable(true);
            button27.setClickable(true);
            button28.setClickable(true);
            button29.setClickable(true);
            button30.setClickable(true);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        countdown = findViewById(R.id.countdown);


        button = (Button) findViewById(R.id.button7);


        button2 = (Button) findViewById(R.id.start);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(game.this, endGame.class);
                startActivity(intent);
            }
        });














        // SETTING UP THE BUTTON S
        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = 0;
                int b = 0;
                int ButtonNumber = 1;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                int b = 1;
                int ButtonNumber = 2;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button2.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button2.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button2.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button2.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button2.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button2.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button2.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button2.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button2.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button2.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button2.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button2.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button2.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button2.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button2.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                int b = 2;
                int ButtonNumber = 3;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button3.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button3.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button3.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button3.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button3.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button3.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button3.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button3.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button3.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button3.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button3.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button3.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button3.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button3.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button3.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });


        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                int b = 3;
                int ButtonNumber = 4;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button4.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button4.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button4.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button4.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button4.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button4.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button4.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button4.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button4.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button4.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button4.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button4.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button4.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button4.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button4.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 0;
                int b = 4;
                int ButtonNumber = 5;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button5.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button5.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button5.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button5.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button5.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button5.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button5.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button5.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button5.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button5.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button5.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button5.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button5.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button5.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button5.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 1;
                int b = 0;
                int ButtonNumber = 6;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button6.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button6.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button6.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button6.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button6.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button6.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button6.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button6.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button6.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button6.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button6.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button6.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button6.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button6.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button6.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 1;
                int b = 1;
                int ButtonNumber = 7;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button7.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button7.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button7.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button7.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button7.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button7.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button7.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button7.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button7.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button7.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button7.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button7.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button7.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button7.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button7.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 1;
                int b = 2;
                int ButtonNumber = 8;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button8.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button8.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button8.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button8.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button8.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button8.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button8.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button8.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button8.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button8.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button8.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button8.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button8.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button8.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button8.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 1;
                int b = 3;
                int ButtonNumber = 9;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button9.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button9.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button9.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button9.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button9.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button9.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button9.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button9.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button9.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button9.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button9.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button9.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button9.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button9.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button9.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 1;
                int b = 4;
                int ButtonNumber = 10;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button10.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button10.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button10.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button10.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button10.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button10.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button10.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button10.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button10.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button10.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button10.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button10.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button10.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button10.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button10.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button11 = (ImageButton) findViewById(R.id.Button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 2;
                int b = 0;
                int ButtonNumber = 11;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button11.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button11.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button11.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button11.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button11.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button11.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button11.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button11.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button11.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button11.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button11.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button11.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button11.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button11.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button11.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button12 = (ImageButton) findViewById(R.id.Button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 2;
                int b = 1;
                int ButtonNumber = 12;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button12.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button12.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button12.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button12.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button12.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button12.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button12.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button12.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button12.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button12.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button12.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button12.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button12.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button12.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button12.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button13 = (ImageButton) findViewById(R.id.Button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 2;
                int b = 2;
                int ButtonNumber = 13;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button13.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button13.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button13.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button13.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button13.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button13.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button13.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button13.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button13.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button13.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button13.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button13.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button13.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button13.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button13.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button14 = (ImageButton) findViewById(R.id.Button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 2;
                int b = 3;
                int ButtonNumber = 14;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button14.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button14.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button14.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button14.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button14.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button14.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button14.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button14.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button14.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button14.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button14.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button14.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button14.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button14.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button14.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button15 = (ImageButton) findViewById(R.id.Button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 2;
                int b = 4;
                int ButtonNumber = 15;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button15.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button15.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button15.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button15.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button15.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button15.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button15.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button15.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button15.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button15.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button15.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button15.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button15.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button15.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button15.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button16 = (ImageButton) findViewById(R.id.Button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 3;
                int b = 0;
                int ButtonNumber = 16;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button16.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button16.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button16.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button16.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button16.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button16.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button16.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button16.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button16.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button16.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button16.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button16.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button16.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button16.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button16.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button17 = (ImageButton) findViewById(R.id.Button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 3;
                int b = 1;
                int ButtonNumber = 17;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button17.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button17.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button17.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button17.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button17.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button17.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button17.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button17.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button17.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button17.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button17.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button17.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button17.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button17.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button17.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button18 = (ImageButton) findViewById(R.id.Button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 3;
                int b = 2;
                int ButtonNumber = 18;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button18.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button18.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button18.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button18.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button18.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button18.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button18.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button18.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button18.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button18.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button18.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button18.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button18.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button18.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button18.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button19 = (ImageButton) findViewById(R.id.Button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 3;
                int b = 3;
                int ButtonNumber = 19;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button19.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button19.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button19.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button19.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button19.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button19.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button19.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button19.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button19.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button19.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button19.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button19.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button19.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button19.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button19.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button20 = (ImageButton) findViewById(R.id.Button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 3;
                int b = 4;
                int ButtonNumber = 20;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button20.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button20.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button20.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button20.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button20.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button20.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button20.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button20.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button20.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button20.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button20.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button20.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button20.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button20.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button20.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button21 = (ImageButton) findViewById(R.id.Button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 4;
                int b = 0;
                int ButtonNumber = 21;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button21.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button21.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button21.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button21.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button21.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button21.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button21.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button21.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button21.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button21.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button21.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button21.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button21.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button21.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button21.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button22 = (ImageButton) findViewById(R.id.Button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 4;
                int b = 1;
                int ButtonNumber = 22;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button22.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button22.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button22.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button22.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button22.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button22.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button22.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button22.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button22.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button22.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button22.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button22.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button22.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button22.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button22.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button23 = (ImageButton) findViewById(R.id.Button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 4;
                int b = 2;
                int ButtonNumber = 23;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button23.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button23.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button23.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button23.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button23.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button23.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button23.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button23.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button23.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button23.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button23.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button23.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button23.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button23.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button23.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button24 = (ImageButton) findViewById(R.id.Button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 4;
                int b = 3;
                int ButtonNumber = 24;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button24.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button24.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button24.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button24.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button24.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button24.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button24.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button24.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button24.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button24.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button24.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button24.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button24.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button24.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button24.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button25 = (ImageButton) findViewById(R.id.Button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 4;
                int b = 4;
                int ButtonNumber = 25;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button25.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button25.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button25.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button25.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button25.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button25.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button25.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button25.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button25.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button25.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button25.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button25.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button25.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button25.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button25.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button26 = (ImageButton) findViewById(R.id.Button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 5;
                int b = 0;
                int ButtonNumber = 26;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button26.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button26.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button26.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button26.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button26.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button26.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button26.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button26.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button26.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button26.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button26.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button26.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button26.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button26.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button26.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button27 = (ImageButton) findViewById(R.id.Button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 5;
                int b = 1;
                int ButtonNumber = 27;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button27.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button27.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button27.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button27.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button27.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button27.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button27.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button27.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button27.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button27.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button27.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button27.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button27.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button27.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button27.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button28 = (ImageButton) findViewById(R.id.Button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 5;
                int b = 2;
                int ButtonNumber = 28;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button28.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button28.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button28.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button28.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button28.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button28.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button28.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button28.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button28.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button28.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button28.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button28.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button28.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button28.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button28.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button29 = (ImageButton) findViewById(R.id.Button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 5;
                int b = 3;
                int ButtonNumber = 29;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button29.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button29.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button29.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button29.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button29.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button29.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button29.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button29.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button29.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button29.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button29.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button29.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button29.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button29.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button29.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button30 = (ImageButton) findViewById(R.id.Button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = 5;
                int b = 4;
                int ButtonNumber = 30;
                makeCompare(a, b, setup);
                if (setup[a][b] == 1) {
                    button30.setBackgroundResource(R.drawable.circle);
                } else if (setup[a][b] == 2) {
                    button30.setBackgroundResource(R.drawable.clovers);
                } else if (setup[a][b] == 3) {
                    button30.setBackgroundResource(R.drawable.diamond);
                } else if (setup[a][b] == 4) {
                    button30.setBackgroundResource(R.drawable.heart);
                } else if (setup[a][b] == 5) {
                    button30.setBackgroundResource(R.drawable.hexagon);
                } else if (setup[a][b] == 6) {
                    button30.setBackgroundResource(R.drawable.jewel);
                } else if (setup[a][b] == 7) {
                    button30.setBackgroundResource(R.drawable.octogon);
                } else if (setup[a][b] == 8) {
                    button30.setBackgroundResource(R.drawable.oval);
                } else if (setup[a][b] == 9) {
                    button30.setBackgroundResource(R.drawable.pentagon);
                } else if (setup[a][b] == 10) {
                    button30.setBackgroundResource(R.drawable.rectangle);
                } else if (setup[a][b] == 11) {
                    button30.setBackgroundResource(R.drawable.spades);
                } else if (setup[a][b] == 12) {
                    button30.setBackgroundResource(R.drawable.square);
                } else if (setup[a][b] == 13) {
                    button30.setBackgroundResource(R.drawable.star);
                } else if (setup[a][b] == 14) {
                    button30.setBackgroundResource(R.drawable.trapezoid);
                } else {
                    button30.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
    }

    private void startTimer() {
        makeVisible();
        setupGameArray();

        mcountdownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;

                if(addTime_matched){
                    matched();
                }
               updateCountdownText();
            }

            @Override
            public void onFinish() {
                running = false;
                Intent intent = new Intent(game.this, endGame.class);
                startActivity(intent);

            }
        }.start();

        running = true;


    }

    private void updateCountdownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        countdown.setText(timeLeft);
    }




    private void matched() {
        mTimeLeftInMillis += 15;
    }

    private void addTime_setComplete(){
       mTimeLeftInMillis += 30;
        updateCountdownText();
    }

    private void reset(){
        addTime_matched = false;
    }





}
