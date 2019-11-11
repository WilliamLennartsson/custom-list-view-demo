package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView dogListView;
    private CustomListAdapter adapter;
    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogs.add(new Dog("Pelle", "Husky"));
        dogs.add(new Dog("Rosmarin", "Fluffig jävel"));
        dogs.add(new Dog("Ponk", "Sån stor"));
        dogs.add(new Dog("Bull", "Pudel"));
        dogs.add(new Dog("Hund", "Råghund"));
        dogs.add(new Dog("Slev", "Mops"));
        dogs.add(new Dog("Bull", "Pudel"));
        dogs.add(new Dog("Nisse", ""));
        dogs.add(new Dog("Pisse", "Pudel"));
        dogs.add(new Dog("Nill", "Pudel"));
        dogs.add(new Dog("Bill", "Pudel"));
        dogs.add(new Dog("Bob", "Pudel"));
        dogs.add(new Dog("Hojkla", "Pudel"));
        dogs.add(new Dog("Null", "Pudel"));
        dogs.add(new Dog("Kastrull", "Pudel"));


        dogListView = findViewById(R.id.dog_list_view);
        adapter = new CustomListAdapter(this, dogs);
        dogListView.setAdapter(adapter);
    }
}
