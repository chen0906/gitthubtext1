package com.itheima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public RecyclerView recyclerView;
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        listView = (ListView) findViewById(R.id.listview);
    }
}
