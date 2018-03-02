package com.appify.barnetfclokojaapp.recyclerAdapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appify.barnetfclokojaapp.R;
import com.appify.barnetfclokojaapp.model.Match;
import com.appify.barnetfclokojaapp.model.MatchEvent;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 12/02/2018.
 */

public class CommentaryAdapter extends RecyclerView.Adapter<CommentaryAdapter.ViewHolder>{
    ArrayList<MatchEvent> matchEvents;

    public CommentaryAdapter(ArrayList<MatchEvent> matchEvents) {
        this.matchEvents = matchEvents;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.commentary_recycler_layout, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MatchEvent matchEvent = matchEvents.get(position);
        holder.timeTv.setText(matchEvent.getTime());
        holder.matchEventTv.setText(matchEvent.getEvent());
    }

    @Override
    public int getItemCount() {
        return matchEvents.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView timeTv;
        TextView matchEventTv;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            timeTv = (TextView) itemView.findViewById(R.id.timeTv);
            matchEventTv = (TextView)itemView.findViewById(R.id.matchEventTv);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
