package com.example.jack.testlisview.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jack.testlisview.R;
import com.example.jack.testlisview.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 10/29/2017.
 */

public class AnimalListAdapter extends ArrayAdapter<Animal> {

    private Context mcontext;
    private ArrayList<Animal> mAnimalList;
    private int mLayoutResId;

    public AnimalListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mLayoutResId = resource;
        this.mAnimalList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View v = inflater.inflate(mLayoutResId,null);

        ImageView iv = (ImageView)v.findViewById(R.id.imageView);
        TextView tv = (TextView) v.findViewById(R.id.textView);

        Animal animal = mAnimalList.get(position);

        iv.setImageResource(animal.picture);
        tv.setText(animal.name);

        return  v;
    }
}
