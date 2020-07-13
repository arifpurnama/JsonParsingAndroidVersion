package com.arifpurnama.jsonparsing.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arifpurnama.jsonparsing.R;
import com.arifpurnama.jsonparsing.model.AndroidVersion;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> android;

    //membuat parameter
    public DataAdapter(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvVer.setText(android.get(position).getVer());
        holder.tvName.setText(android.get(position).getName());
        holder.tvApi.setText(android.get(position).getApi());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvVer, tvName, tvApi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvVer = itemView.findViewById(R.id.tv_ver);
            tvName = itemView.findViewById(R.id.tv_name);
            tvApi = itemView.findViewById(R.id.tv_api);
        }
    }
}
