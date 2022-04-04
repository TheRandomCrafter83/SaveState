package com.coderz.f1.savestate;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edittextValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextValue = findViewById(R.id.edittext_value);
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("value"))
                edittextValue.setText(savedInstanceState.getString("value"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("value", edittextValue.getText().toString());

        Log.d("debugSaveState", "SaveStateDone");
    }
}