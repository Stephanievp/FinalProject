package com.example.covidconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enter = findViewById(R.id.enter_button);
    }

    public void launchMainPage(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);

    }
}
