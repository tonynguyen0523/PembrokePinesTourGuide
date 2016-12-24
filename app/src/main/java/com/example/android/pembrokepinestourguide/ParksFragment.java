package com.example.android.pembrokepinestourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by tonynguyen on 11/18/16.
 */

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.list_view, container, false);

    // Array Lit of descriptions
    final ArrayList<Descriptions> parkDesc = new ArrayList<>();
    parkDesc.add(new Descriptions(R.drawable.cbsmithpark,R.string.cb_smith,R.string.cb_address,R.string.cb_num));
    parkDesc.add(new Descriptions(R.drawable.pembrokeshorespark,R.string.pembroke_shores,R.string.pemshore_address,R.string.pemshore_num));
    parkDesc.add(new Descriptions(R.drawable.silverlakespark,R.string.silverlakes,R.string.silverlakes_address,R.string.silverlakes_num));
    parkDesc.add(new Descriptions(R.drawable.flamingopark,R.string.flamingo_park,R.string.flampark_address,R.string.flampark_num));
    parkDesc.add(new Descriptions(R.drawable.townsgateparkandpool,R.string.towngate_park,R.string.towngate_address,R.string.towngate_num));


    // Creating Adapter
    DescriptionAdapter descAdapter = new DescriptionAdapter(getActivity(),parkDesc);

    // Creating list view and setting to adapter
    ListView listView = (ListView)rootView.findViewById(R.id.list_view);
    listView.setAdapter(descAdapter);

    // Make each item of list view clickable
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            int viewCheck = 2;

            Descriptions desc = parkDesc.get(position);

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


