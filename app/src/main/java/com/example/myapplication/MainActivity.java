package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextImieNazwisko, editTextCelWizyty, editTextGodzina;
    ListView listViewGatunki;
    SeekBar seekBarIleLat;
    Button buttonOK;
    TextView textViewIleLat;
    int wiek;
    String gatunek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextImieNazwisko = findViewById(R.id.editTextText);
        editTextCelWizyty = findViewById(R.id.editTextText2);
        editTextGodzina = findViewById(R.id.editTextTime);
        listViewGatunki = findViewById(R.id.listView);
        seekBarIleLat = findViewById(R.id.seekBar2);
        textViewIleLat = findViewById(R.id.textView3);
        buttonOK = findViewById(R.id.button);

        seekBarIleLat.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        wiek = i;
                        textViewIleLat.setText("Ile ma lat? " + wiek);

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        listViewGatunki.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT).show();
                        if(i == 0) {
                            gatunek = "pies";
                            seekBarIleLat.setMax(18);
                        } else if(i == 1) {
                            gatunek = "kot";
                            seekBarIleLat.setMax(20);
                        } else if(i == 2) {
                            gatunek = "SwinkaMorska";
                            seekBarIleLat.setMax(9);
                        }
                    }
                }
        );
        buttonOK.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(editTextImieNazwisko != null && editTextCelWizyty != null && editTextGodzina != null) {
                            String imieINazwisko = editTextImieNazwisko.getText().toString();
                            String celWizyty = editTextCelWizyty.getText().toString();
                            String godzinaWizyty = editTextGodzina.getText().toString();

                            Toast.makeText(MainActivity.this, ""+imieINazwisko+", "+ gatunek + ", lat: " + wiek + ", " + celWizyty + ", " + godzinaWizyty, Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(MainActivity.this, "Wypełnij pola", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }
}