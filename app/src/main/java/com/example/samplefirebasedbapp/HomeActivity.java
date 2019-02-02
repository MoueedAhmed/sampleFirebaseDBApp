package com.example.samplefirebasedbapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private FloatingActionButton fabAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fabAdd = (FloatingActionButton) findViewById(R.id.addFab_home);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myDialog = new AlertDialog.Builder(HomeActivity.this);
                LayoutInflater inflater = LayoutInflater.from(HomeActivity.this);
                View myView = inflater.inflate(R.layout.custom_input,null);
                myDialog.setView(myView);
                AlertDialog dialog = myDialog.create();
                dialog.show();
            }
        });
    }
}
