package com.example.radiobuttoneg;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pickTurtle(View view) {
        ImageView imgView = (ImageView) findViewById(R.id.imageView);
        if (view.getId()==R.id.donatello)
            imgView.setImageResource(R.drawable.tmntdon);
        else if(view.getId()==R.id.leonardo)
            imgView.setImageResource(R.drawable.tmntleo);
        else if(view.getId()==R.id.michaelangelo)
            imgView.setImageResource(R.drawable.tmntmike);
        else
            imgView.setImageResource(R.drawable.tmntraph);

        Toast.makeText(this,"You clicked the " + ((RadioButton)view).getText() + " button!", Toast.LENGTH_SHORT).show();
    }
}