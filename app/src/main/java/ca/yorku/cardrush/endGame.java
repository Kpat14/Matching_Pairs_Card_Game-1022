package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class endGame extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    Double points = game.getMyString();
    int i = Integer.valueOf(points.intValue());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        TextView textView = findViewById(R.id.textView6);
        textView.setText(String.valueOf(i));
        button = (Button) findViewById(R.id.button12);
        button2 = (Button) findViewById(R.id.button9);
        button3 = (Button) findViewById(R.id.button13);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(endGame.this, leaderboard.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(endGame.this, Username.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(endGame.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}