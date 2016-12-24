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
 * Created by tonynguyen on 11/18/16.
 */

public class ShoppingFragment extends Fragment{

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Array Lit of descriptions
        final ArrayList<Descriptions> shoppingDesc = new ArrayList<>();
        shoppingDesc.add(new Descriptions(R.drawable.pembrokepinesmall,R.string.pembroke_mall,R.string.pemmall_address,R.string.pemmall_num));
        shoppingDesc.add(new Descriptions(R.drawable.pembrokegardens,R.string.pembroke_garden,R.string.pemgarden_address,R.string.pemgarden_num));

        // Creating Adapter
        DescriptionAdapter descAdapter = new DescriptionAdapter(getActivity(),shoppingDesc);

        // Creating list view and setting to adapter
        ListView listView = (ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(descAdapter);

        // Make each item of list view clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int viewCheck = 2;

                Descriptions desc = shoppingDesc.get(position);

                Intent intent = new Intent(getActivity(),DetailActivity.class);
                intent.putExtra("vCheck", viewCheck);
                intent.putExtra("position", position);
                intent.putExtra("image", desc.getImageResourceId());
                intent.putExtra("title", desc.getTitle());
                intent.putExtra("address", desc.getDescOne());
                intent.putExtra("phoneNumber", desc.getDescTwo());

                startActivity(intent);
            }
        });



        return rootView;
    }
}
