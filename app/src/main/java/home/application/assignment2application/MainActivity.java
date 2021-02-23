package home.application.assignment2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    TextView t;

//hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.welcomeBtn);
        e = (EditText) findViewById(R.id.nameEditText);
        t = (TextView) findViewById(R.id.outputTextView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           String userName = e.getText().toString();
                t.setText("Hello, " + userName);
            }
        });


    }


}