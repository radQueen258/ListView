package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<City> {

    public void ListAdapter (Context context, ArrayList<City> cityArrayList) {

        super(context,R.layout.list_item, cityArrayList);

    }

    public listAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        City city = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.city_pic);
        TextView userName = convertView.findViewById(R.id.cityName);

        imageView.setImageResource(city.imageId);
        userName.setText(city.name);


        return super.getView(position, convertView, parent);
    }
}
