package com.example.sydneytour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        List<Destination> parks = new ArrayList<>();
        initDestinationsData(parks);

        RecyclerView recyclerView  = rootView.findViewById(R.id.recycle_view);
        DestinationsAdapter adapter = new DestinationsAdapter(parks);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void initDestinationsData(List<Destination> destinations) {
        destinations.add(new Destination("Hyde Park", "Elizabeth St, Sydney NSW 2000",
                R.string.description_hyde_park, R.drawable.hyde_park));
        destinations.add(new Destination("Sydney Park", "416 Sydney Park Rd, Alexandria NSW 2015",
                R.string.description_sydney_park, R.drawable.sydney_park));
        destinations.add(new Destination("Bicentennial Park", "Australia Ave, Sydney Olympic Park NSW 2127",
                R.string.description_bicentennial_park, R.drawable.golden_square_bicentennial));
        destinations.add(new Destination("Blaxland Riverside Park", "Jamieson St, Sydney Olympic Park NSW 2127",
                R.string.description_blaxland_riverside_park, R.drawable.blaxland_riverside_park));
        destinations.add(new Destination("Harbour National Park", "Bradleys Head Rd, Mosman NSW 2088",
                R.string.description_harbour_nation_park, R.drawable.beach_beachfront_boat_coast_43_960x960));
    }
}
