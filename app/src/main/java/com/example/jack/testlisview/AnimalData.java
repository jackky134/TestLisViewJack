package com.example.jack.testlisview;

import com.example.jack.testlisview.model.Animal;

import java.util.ArrayList;

/**
 * Created by Jack on 10/29/2017.
 */


public class AnimalData {

    private static AnimalData sInstance;


    public ArrayList<Animal> animalList;



    public static AnimalData getsInstance(){
        if(sInstance == null){
            sInstance = new AnimalData();
        }

        return sInstance;
    }
}
