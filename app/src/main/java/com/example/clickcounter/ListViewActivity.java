package com.example.clickcounter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listView);

        List<String> titles = new ArrayList<>();
        List<String> subtitles = new ArrayList<>();

        // Populate sample data
        titles.add("Item 1");
        subtitles.add("This is the first item.");

        titles.add("Item 2");
        subtitles.add("This is the second item.");

        CustomListAdapter adapter = new CustomListAdapter(this, titles, subtitles);
        listView.setAdapter(adapter);
    }
}
