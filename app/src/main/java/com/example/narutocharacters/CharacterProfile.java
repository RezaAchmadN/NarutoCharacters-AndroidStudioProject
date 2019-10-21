package com.example.narutocharacters;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class CharacterProfile extends AppCompatActivity {
    private Context context;
    ImageView profile;
    TextView name,description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_profile);

        profile = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        description = findViewById(R.id.tv_item_description);

        Intent intent = getIntent();
        String[] data = intent.getStringArrayExtra("data");

        name.setText(data[0]);
        description.setText(data[1]);


        Glide.with(this)
                .load(data[2])
                .apply(new RequestOptions().override(200, 200))
                .into(profile);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


}
