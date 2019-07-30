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

import java.util.ArrayList;
import java.util.List;

public class MuseumsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycle_view);

        ArrayList<Destination> museums = new ArrayList<>();
        initDestinationsData(museums);

        DestinationsAdapter adapter = new DestinationsAdapter(museums);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void initDestinationsData(List<Destination> destinations) {
        destinations.add(new Destination("Museum of Sydney", getResources().getString(R.string.location_museum_of_sydney),
                R.string.description_museum_of_sydney, R.drawable.museum_of_sydney));
        destinations.add(new Destination("Australian Museum", getResources().getString(R.string.location_australian_museum),
                R.string.description_australian_museum, R.drawable.australian_museum));
        destinations.add(new Destination("Hyde Park Barracks Museum", getResources().getString(R.string.location_hydepark_museum), R.string.description_hydepark_museum,
                R.drawable.hydepark_museum));
        destinations.add(new Destination("Powerhouse Museum", getResources().getString(R.string.location_powerhouse_museum),
                R.string.description_powerhouse_museum, R.drawable.powerhouse_museum));
        destinations.add(new Destination("Australian National Maritime Museum", getResources().getString(R.string.location_australian_maritime_museum),
                R.string.description_australian_maritime_museum, R.drawable.australin_national_maritime_museum));
        destinations.add(new Destination("Susannah Place Museum", getResources().getString(R.string.location_susannah_museum),
                R.string.description_susannah_museum, R.drawable.susannah_museum));
    }
}
