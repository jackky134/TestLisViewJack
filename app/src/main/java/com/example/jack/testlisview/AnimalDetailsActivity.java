package com.example.jack.testlisview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jack.testlisview.model.Animal;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details2);

        ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);

        AnimalData animalData = AnimalData.getsInstance();
        Animal animal = animalData.animalList.get(position);

        nameTextView.setText(animal.info);
        animalImageView.setImageResource(animal.picture);

        getSupportActionBar().setTitle(animal.name);
    }
}
