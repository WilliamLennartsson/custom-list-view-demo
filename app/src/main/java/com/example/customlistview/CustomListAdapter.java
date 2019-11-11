package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private ArrayList<Dog> dataSource;
    private LayoutInflater inflater;
    private Context context;

    public CustomListAdapter(Activity activity, ArrayList<Dog> list) {
        this.dataSource = list;
        this.inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        context = activity.getApplicationContext();
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View dogItemView = null;
        if (convertView == null) {
            dogItemView = inflater.inflate(R.layout.dog_item_layout, parent, false);
        } else {
            dogItemView = convertView;
        }
        Dog dog = dataSource.get(position);
        TextView nameTextView = dogItemView.findViewById(R.id.dog_name_text_view);
        nameTextView.setText(dog.getName());

        TextView breedTextView = dogItemView.findViewById(R.id.dog_breed_text_view);
        breedTextView.setText(dog.getBreed());

        ImageView dogImageView = dogItemView.findViewById(R.id.dog_image_view);
        Drawable image = context.getResources().getDrawable(android.R.drawable.btn_star);
        dogImageView.setImageDrawable(image);
        return dogItemView;
    }
}
