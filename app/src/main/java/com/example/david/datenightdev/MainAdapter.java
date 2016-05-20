package com.example.david.datenightdev;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by david on 16/05/2016.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private ArrayList<MainDataDef> mainData;

    public MainAdapter(ArrayList<MainDataDef> a){

        this.mainData = a;
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder{
        ImageView imageIcon;
        TextView textName;
        TextView textSummary;

        public MainViewHolder(View v){
            super (v);
            this.imageIcon=(ImageView)v.findViewById(R.id.card_image);
            this.textName=(TextView)v.findViewById(R.id.title_text_view);
            this.textSummary=(TextView) v.findViewById(R.id.summary_text);
        }

    }

    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main,parent, false);
        v.setOnClickListener(MainActivity.mainOnClickListener);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder( final MainViewHolder holder, final int position) {
        ImageView imageIcon = holder.imageIcon;
        TextView textName = holder.textName;
        TextView textSummary = holder.textSummary;

        imageIcon.setImageResource(mainData.get(position).getImage());
        textName.setText(mainData.get(position).getName());
        textSummary.setText(mainData.get(position).getSummary());
    }

    @Override
    public int getItemCount() {

        return mainData.size();
    }
}
