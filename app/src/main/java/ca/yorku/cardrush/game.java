package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class game extends AppCompatActivity {
    private Button button;

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

        ImageButton button = (ImageButton) findViewById(R.id.TrialButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
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

            }
        });





    }
}