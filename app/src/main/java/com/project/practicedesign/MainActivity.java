package com.project.practicedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView layoutMain = findViewById(R.id.landingText);
        Button greetingButton = findViewById(R.id.greetingButtonMain);
        ImageView imageView = findViewById(R.id.imageView);

        layoutMain.setText("How are you doing world?");

        //ImageView greetingImage = new ImageView(MainActivity.this);
        greetingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                Glide.with(getBaseContext())
                        .load("https://i.giphy.com/media/eeYbfcTxoxGlG/giphy.webp")
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .thumbnail(0.1f)
                        .into(imageView);

                Toast.makeText(MainActivity.this,"end",Toast.LENGTH_SHORT).show();


            }
        });






    }
}