package com.example.sydneytour;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.List;

public class DestinationsAdapter extends RecyclerView.Adapter<DestinationsAdapter.MyViewHolder> {
    private List<Destination> destinationList;
    private SparseBooleanArray mTogglePositions;

    public DestinationsAdapter(List<Destination> destinationList) {
        this.destinationList = destinationList;
        this.mTogglePositions = new SparseBooleanArray();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_destination, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        Destination destination = destinationList.get(i);

        holder.name.setText(destination.getName());
        holder.street.setText(destination.getLocation());
        holder.imageIcon.setImageResource(destination.getImageResourceId());

        String description = holder.expandableTextView.getContext().getResources().getString((destination.getDescriptionResourceId()));
        holder.expandableTextView.setText(description, mTogglePositions, i);
    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageIcon;
        TextView name;
        TextView street;
        ExpandableTextView expandableTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageIcon = itemView.findViewById(R.id.image_icon);
            name = itemView.findViewById(R.id.text_name);
            street = itemView.findViewById(R.id.text_street);
            expandableTextView = itemView.findViewById(R.id.expand_text_view);
        }
    }
}
