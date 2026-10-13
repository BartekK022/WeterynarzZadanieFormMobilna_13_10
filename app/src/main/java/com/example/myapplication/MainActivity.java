package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextImieNazwisko, editTextCelWizyty, editTextGodzina;
    ListView listView;
    SeekBar seekBarIleLat;
    Button buttonOK;
    TextView textViewIleLat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextImieNazwisko = findViewById(R.id.editTextText);
        editTextCelWizyty = findViewById(R.id.editTextText2);
        editTextGodzina = findViewById(R.id.editTextTime);
        listView = findViewById(R.id.listView);
        seekBarIleLat = findViewById(R.id.seekBar2);
        textViewIleLat = findViewById(R.id.textView3);
        buttonOK = findViewById(R.id.button);

        buttonOK.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {



                    }
                }
        );

    }
}