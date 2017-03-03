package com.example.cice.sharedelementactivitytransition;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     *Se recomienda poner un nombre en el string
     * y añadir una opcion en styles llamada windowcontenttransitions
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        Button button = (Button) findViewById(R.id.buttonkl);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String transitionName = getString(R.string.transition_string);

                View viewStart = findViewById(R.id.imageView2);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, viewStart, transitionName);
                ActivityCompat.startActivity(MainActivity.this, intent, optionsCompat.toBundle());
            }
        });
    }
}
