package com.example.android.pembrokepinestourguide;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by tonynguyen on 11/17/16.
 */

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Array Lit of descriptions
        final ArrayList<Descriptions> restaurantDesc = new ArrayList<>();
        restaurantDesc.add(new Descriptions(R.drawable.lostacos,R.string.los,R.string.los_type,R.string.los_dollar,R.string.los_number,R.string.los_address));
        restaurantDesc.add(new Descriptions(R.drawable.brimstone,R.string.brimstone,R.string.brim_type,R.string.brim_dollar,R.string.brim_number,R.string.brim_address));
        restaurantDesc.add(new Descriptions(R.drawable.mazza,R.string.mazza,R.string.mazza_type,R.string.mazza_dollar,R.string.mazza_num,R.string.mazza_address));
        restaurantDesc.add(new Descriptions(R.drawable.thepub,R.string.the_pub,R.string.pub_type,R.string.pub_dollar,R.string.pub_num,R.string.pub_address));
        restaurantDesc.add(new Descriptions(R.drawable.shinju,R.string.shinju,R.string.shin_type,R.string.shin_dollar,R.string.shin_num,R.string.shin_address));
        restaurantDesc.add(new Descriptions(R.drawable.ruchi,R.string.ruchis,R.string.ruchi_type,R.string.ruchi_dollar,R.string.ruchi_num,R.string.ruchi_address));
        restaurantDesc.add(new Descriptions(R.drawable.villagetavern,R.string.village_tavern,R.string.village_type,R.string.village_dollar,R.string.village_num,R.string.village_address));
        restaurantDesc.add(new Descriptions(R.drawable.flanigans,R.string.flanigas,R.string.flan_type,R.string.flan_dollar,R.string.flan_num,R.string.flan_address));
        restaurantDesc.add(new Descriptions(R.drawable.mikan,R.string.mikan,R.string.mikan_dollar,R.string.mikan_dollar,R.string.mikan_num,R.string.mikan_address));
        restaurantDesc.add(new Descriptions(R.drawable.sostacaffe,R.string.sosta,R.string.sosta_type,R.string.sosta_dollar,R.string.sosta_num,R.string.sosta_address));


        // Creating Adapter
        DescriptionAdapter descAdapter = new DescriptionAdapter(getActivity(),restaurantDesc);

        // Creating list view and setting to adapter
        ListView listView = (ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(descAdapter);

        // Make each item of list view clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int viewCheck = 1;

                Descriptions desc = restaurantDesc.get(position);

                Intent intent = new Intent(getActivity(),DetailActivity.class);
                intent.putExtra("vCheck", viewCheck);
                intent.putExtra("position", position);
                intent.putExtra("image", desc.getImageResourceId());
                intent.putExtra("title", desc.getTitle());
                intent.putExtra("foodType", desc.getDescOne());
                intent.putExtra("dollarSign", desc.getDescTwo());
                intent.putExtra("phoneNumber", desc.getDescThree());
                intent.putExtra("address", desc.getDescFour());
                startActivity(intent);
            }
        });


        return rootView;
    }
}
