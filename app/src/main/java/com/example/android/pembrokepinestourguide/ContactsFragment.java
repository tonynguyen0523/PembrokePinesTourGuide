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

public class ContactsFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Array Lit of descriptions
        final ArrayList<Descriptions> contactDesc = new ArrayList<>();
        contactDesc.add(new Descriptions(R.string.cityhall_info,R.string.pemcityhall_address,R.string.hall_num));
        contactDesc.add(new Descriptions(R.string.city_attorney,R.string.pemcityhall_address,R.string.attorney_num));
        contactDesc.add(new Descriptions(R.string.city_manager,R.string.pemcityhall_address,R.string.manager_num));
        contactDesc.add(new Descriptions(R.string.fire_department,R.string.pemcityhall_address,R.string.fire_num));
        contactDesc.add(new Descriptions(R.string.police_department,R.string.pemcityhall_address,R.string.popo_num));
        contactDesc.add(new Descriptions(R.string.public_services,R.string.pemcityhall_address,R.string.publicservice_num));
        contactDesc.add(new Descriptions(R.string.tech_serv,R.string.pemcityhall_address,R.string.tech_num));
        contactDesc.add(new Descriptions(R.string.human_resource,R.string.pemcityhall_address,R.string.hr_num));
        contactDesc.add(new Descriptions(R.string.rAndA,R.string.pemcityhall_address,R.string.rAndR_num));
        contactDesc.add(new Descriptions(R.string.comm_serv,R.string.pemcityhall_address,R.string.community_num));


        // Creating Adapter
        DescriptionAdapter descAdapter = new DescriptionAdapter(getActivity(),contactDesc);

        // Creating list view and setting to adapter
        ListView listView = (ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(descAdapter);

        // Make each item of list view clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Check which view to use
                int viewCheck = 2;

                // Position user clicked
                Descriptions desc = contactDesc.get(position);

                // Pass data to the DetailActivity.class
                Intent intent = new Intent(getActivity(),DetailActivity.class);
                intent.putExtra("vCheck", viewCheck);
                intent.putExtra("position", position);
                intent.putExtra("title", desc.getTitle());
                intent.putExtra("phoneNumber", desc.getDescTwo());
                intent.putExtra("address", desc.getDescOne());

                startActivity(intent);


            }
        });


        return rootView;
    }


}
