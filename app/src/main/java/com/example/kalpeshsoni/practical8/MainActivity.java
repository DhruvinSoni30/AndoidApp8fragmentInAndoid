package com.example.kalpeshsoni.practical8;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Syllabus.OnFragmentInteractionListener,Theory.OnFragmentInteractionListener,Practical.OnFragmentInteractionListener,Others.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tab

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
