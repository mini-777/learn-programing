package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button infoButton = (Button)findViewById(R.id.infoButton);
        final Button reviewButton = (Button)findViewById(R.id.reviewButton);
        final Button teamButton = (Button)findViewById(R.id.teamButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);

        infoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE);
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new InfoFragment());
                fragmentTransaction.commit();
            }

        });

        reviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE);
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ReviewFragment());
                fragmentTransaction.commit();
            }
        });

        teamButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE);
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new TeamFragment());
                fragmentTransaction.commit();
            }
        });
    }
}