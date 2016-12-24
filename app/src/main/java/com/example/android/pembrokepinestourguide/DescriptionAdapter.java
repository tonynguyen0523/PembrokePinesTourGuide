package com.example.android.pembrokepinestourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tonynguyen on 11/16/16.
 */

public class DescriptionAdapter extends ArrayAdapter<Descriptions> {


    public DescriptionAdapter(Context context, ArrayList<Descriptions> description) {
        super(context,0,description);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if layout is being reuse, if not inflate new layout
        View itemListView = convertView;
        if(itemListView == null){
                itemListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // Get position of array list
        Descriptions currentDescriptions = getItem(position);

        // Set text view of title
        TextView title = (TextView)itemListView.findViewById(R.id.text_one);
        title.setText(currentDescriptions.getTitle());

        // Set text view of description one
        TextView descOne = (TextView)itemListView.findViewById(R.id.text_two);
        descOne.setText(currentDescriptions.getDescOne());

        // Set text view of description two
        TextView descTwo = (TextView)itemListView.findViewById(R.id.text_three);
            descTwo.setText(currentDescriptions.getDescTwo());

        // Set image view
        ImageView image = (ImageView)itemListView.findViewById(R.id.list_item_image);
        // If has image, set image, if not set visibility GONE
        if(currentDescriptions.hasImage()){
            image.setImageResource(currentDescriptions.getImageResourceId());
        }else {
            image.setVisibility(View.GONE);
        }

        return itemListView;
    }
}
