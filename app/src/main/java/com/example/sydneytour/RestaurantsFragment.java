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

public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Destination> restaurants = new ArrayList<>();
        initDestinationsData(restaurants);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycle_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        DestinationsAdapter adapter = new DestinationsAdapter(restaurants);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void initDestinationsData(List<Destination> destinations) {
        destinations.add(new Destination("Aria Restaurant Sydney", "1 Macquarie St, Sydney NSW 2000",
                R.string.description_arya_restaurant, R.drawable.aria_restaurant));
        destinations.add(new Destination("Restaurant Hubert", "15 Bligh St, Sydney NSW 2000",
                R.string.description_restaurant_hubert, R.drawable.hubert_restaurant));
        destinations.add(new Destination("Bennelong Restaurant and Bar", "Bennelong Point Sydney Opera House, Sydney NSW 2000",
                R.string.description_bennelong_restaurant, R.drawable.bennelong_restaurant));
        destinations.add(new Destination("Tetsuya's Restaurant", "529 Kent St, Sydney NSW 2000",
                R.string.description_tetsuyas_restaurant, R.drawable.tetsuyas_restaurant));
        destinations.add(new Destination("Mr. Wong", "3 Bridge Ln, Sydney NSW 2000",
                R.string.description_mr_wong_restaurant, R.drawable.mr_wong));
    }
}
