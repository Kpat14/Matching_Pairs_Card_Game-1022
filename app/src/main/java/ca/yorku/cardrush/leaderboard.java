package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class leaderboard extends AppCompatActivity {

    private Button button;
    Double points = game.getMyString();
    int i = Integer.valueOf(points.intValue());

    String username = Username.getMyString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        button = (Button) findViewById(R.id.button11);
        TextView textView = findViewById(R.id.textView8);
        textView.setText(String.valueOf(i));

        TextView textView2 = findViewById(R.id.textView7);
        textView2.setText(username);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(leaderboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}