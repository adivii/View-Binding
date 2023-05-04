package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    EditText inputText;
    TextView outputText;
    Button btnCetak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();

        setContentView(view);

        inputText = activityMainBinding.textInput;
        outputText = activityMainBinding.textOutput;
        btnCetak = activityMainBinding.btnCetak;

        btnCetak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText.setText(inputText.getText());
            }
        });
    }
}