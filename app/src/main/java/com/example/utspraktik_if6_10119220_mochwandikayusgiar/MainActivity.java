package com.example.utspraktik_if6_10119220_mochwandikayusgiar;

//NIM: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF-6

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button lanjut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lanjut1=findViewById(R.id.lanjut1);
        lanjut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, page2.class);
                startActivity(intent);
            }
        });

    }
}