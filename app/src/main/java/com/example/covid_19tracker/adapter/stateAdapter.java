package com.example.covid_19tracker.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid_19tracker.R;

import java.util.ArrayList;

public class stateAdapter extends RecyclerView.Adapter<stateAdapter.ViewHolder> {
  private ArrayList<sta>arrayList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.statecase,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView Statename, Statecase;

       Statecase= itemView.findViewById(R.id.cccases);
       Statename=itemView.findViewById(R.id.sname);
        }
    }
}
