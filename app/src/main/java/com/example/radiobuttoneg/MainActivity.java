package com.example.radiobuttoneg;

import android.content.Intent;
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
        Intent intent = new Intent(this, ImageActivity.class);

        if (view.getId()==R.id.donatello)
            intent.putExtra("TurtleID",R.id.donatello);
        else if(view.getId()==R.id.leonardo)
            intent.putExtra("TurtleID",R.id.leonardo);
        else if(view.getId()==R.id.michaelangelo)
            intent.putExtra("TurtleID",R.id.michaelangelo);
        else
            intent.putExtra("TurtleID",R.id.raphael);

        startActivity(intent);

        //Toast.makeText(this,"You clicked the " + ((RadioButton)view).getText() + " button!", Toast.LENGTH_SHORT).show();
    }
}