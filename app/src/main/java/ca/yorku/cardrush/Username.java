package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Username extends AppCompatActivity {
    private Button button;
    private EditText username;
    private static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        button = (Button) findViewById(R.id.button6);
        username = (EditText) findViewById(R.id.textInputEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Username.this, game.class);
                startActivity(intent);
                name = username.getText().toString();
            }
        });

    }
    public static String getMyString() {
        return name;
    }
}