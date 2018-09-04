package com.androiddevs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {


    private ListView lvProfiles;
    private MyAppAdapter myAppAdapter;
    private ArrayList<ProfileModel> profileModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileModelArrayList = new ArrayList<>();
        profileModelArrayList.add(new ProfileModel("Nirav", 100.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Surabhi", 50.0, R.drawable.female));
        profileModelArrayList.add(new ProfileModel("Martins", 220.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Steven", 60.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Akeba", 400.0, R.drawable.female));
        profileModelArrayList.add(new ProfileModel("Ravi", 900.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Nirav", 350.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Surabhi", 25.0, R.drawable.female));
        profileModelArrayList.add(new ProfileModel("Martins", 125.0, R.drawable.male));
        profileModelArrayList.add(new ProfileModel("Martins", 800.0, R.drawable.male));

        lvProfiles = (ListView) findViewById(R.id.lvProfiles);

        Collections.sort(profileModelArrayList, new Comparator<ProfileModel>() {
            @Override
            public int compare(ProfileModel c1, ProfileModel c2) {
                return  (int) (c1.getPopulation() - c2.getPopulation());
            }
        });
        myAppAdapter = new MyAppAdapter(profileModelArrayList, MainActivity.this);
        lvProfiles.setAdapter(myAppAdapter);
    }
}