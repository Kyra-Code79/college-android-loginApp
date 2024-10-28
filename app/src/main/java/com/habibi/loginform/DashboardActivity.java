package com.habibi.loginform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    private TextView outputResult;
    private EditText etJari, etTinggi;
    private Button btnHitung;
    private final float phi = 3.14F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
//        Inisialisasi view
        etJari = findViewById(R.id.jaritabung);
        etTinggi = findViewById(R.id.tinggitabung);
        outputResult = findViewById(R.id.outputResult);
        btnHitung = findViewById(R.id.calculateVolume);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleHitung();
            }
        });
    }
    private  void handleHitung(){
        String inputJari = etJari.getText().toString();
        String inputTabung = etTinggi.getText().toString();

        if(inputTabung.isEmpty() || inputJari.isEmpty()){
            Toast.makeText(this, "Masukkan Jari jari dan Tinggi Tabung", Toast.LENGTH_SHORT).show();
            return;
        }
        float jari = Float.parseFloat(inputJari);
        float tinggi = Float.parseFloat(inputTabung);

        float volume = phi * (jari * jari) * tinggi;

        outputResult.setText("Volume Tabung adalah: "+volume);

    }
}
