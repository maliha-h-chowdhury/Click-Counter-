package com.example.clickcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Create a list of sample data
        List<String> titles = new ArrayList<>();
        titles.add("Item 1");
        titles.add("Item 2");
        titles.add("Item 3");
        titles.add("Item 4");

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(this, titles);
        recyclerView.setAdapter(adapter);
    }

}
