package com.example.picassolibrarytut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.iv_main);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/d/dd/Tide_Wallpaper_%28IPhone_SE%29.png")
                .placeholder(R.drawable.my_image)
                .error(R.drawable.humaaans)
                .into(imageView);

    }
}