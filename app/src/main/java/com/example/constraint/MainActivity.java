package com.example.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View view) {
        Spinner spi = findViewById(R.id.spinner);
        String exe =String.valueOf(spi.getSelectedItem());
        Intent intent;
        switch (exe){
            case "1":
                intent = new Intent(this, Excercise1.class);
                startActivity(intent);
                break;
            case "2":
                intent = new Intent(this, Excercise2.class);
                startActivity(intent);
                break;
            case "3":
                intent = new Intent(this, Excercise3.class);
                startActivity(intent);
                break;
            case "4":
                intent = new Intent(this, Excercise4.class);
                startActivity(intent);
            default:
                TextView text = findViewById(R.id.textView);
                text.setText("Ejercicio no encontrado");
        }
    }
}