package com.example.radiobuttoneg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        ImageView turtleImg = findViewById(R.id.imageView);
        if(intent.getIntExtra("TurtleID",R.id.donatello) == R.id.donatello)
            turtleImg.setImageResource(R.drawable.tmntdon);
        else if(intent.getIntExtra("TurtleID",R.id.donatello) == R.id.michaelangelo)
            turtleImg.setImageResource(R.drawable.tmntmike);
        else if(intent.getIntExtra("TurtleID",R.id.donatello) == R.id.raphael)
            turtleImg.setImageResource(R.drawable.tmntraph);
        else
            turtleImg.setImageResource(R.drawable.tmntleo);
    }
}