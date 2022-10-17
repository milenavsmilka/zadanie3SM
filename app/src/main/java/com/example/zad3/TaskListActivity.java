package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_task);
    }
}