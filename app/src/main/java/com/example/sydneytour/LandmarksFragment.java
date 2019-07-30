package com.example.sydneytour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class LandmarksFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycle_view);
        List<Destination> landmarks = initDestinationsData();


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        DestinationsAdapter adapter = new DestinationsAdapter(landmarks);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    private List<Destination> initDestinationsData() {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(getString(R.string.sydney_tour_eye),
                getString(R.string.location_sydney_tour_eye), R.string.description_sydney_tour_eye, R.drawable.sydney_tower_eye));
        destinations.add(new Destination(getString(R.string.sydney_harbour_bridge),
                getString(R.string.location_sydney_harbours_bridge), R.string.description_sydney_harbour_bridge, R.drawable.harbour_bridge));
        destinations.add(new Destination(getString(R.string.taronga_zoo_sydney), getString(R.string.location_sydney_harbours_bridge),
                R.string.description_taronga_zoo_sydney, R.drawable.tarongazoo));
        destinations.add(new Destination(getString(R.string.circular_quay), getString(R.string.location_circular_quay),
                R.string.description_circular_quay, R.drawable.circular_quay));
        destinations.add(new Destination(getString(R.string.sydney_opera_house), getString(R.string.location_opera_house),
                R.string.description_opera_house, R.drawable.opera_house));

        return destinations;
    }
}
