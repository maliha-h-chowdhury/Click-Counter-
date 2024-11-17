package com.example.clickcounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    private Context context;
    private List<String> titles;
    private List<String> subtitles;

    public CustomListAdapter(Context context, List<String> titles, List<String> subtitles) {
        this.context = context;
        this.titles = titles;
        this.subtitles = subtitles;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView subtitleTextView = convertView.findViewById(R.id.subtitleTextView);

        titleTextView.setText(titles.get(position));
        subtitleTextView.setText(subtitles.get(position));

        return convertView;
    }
}
