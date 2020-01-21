package com.example.client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText_Msg);

        final Button button = findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                connect connect = new connect();
                connect.execute(editText.getText().toString());


            }
        });
    }
}


