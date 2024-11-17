package com.example.clickcounter;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        // Prepare data
        List<String> groupList = new ArrayList<>();
        HashMap<String, List<String>> childMap = new HashMap<>();

        // Add groups
        groupList.add("Fruits");
        groupList.add("Vegetables");

        // Add children
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Tomato");

        childMap.put(groupList.get(0), fruits);
        childMap.put(groupList.get(1), vegetables);

        // Set adapter
        CustomExpandableListAdapter adapter = new CustomExpandableListAdapter(this, groupList, childMap);
        expandableListView.setAdapter(adapter);
    }
}
