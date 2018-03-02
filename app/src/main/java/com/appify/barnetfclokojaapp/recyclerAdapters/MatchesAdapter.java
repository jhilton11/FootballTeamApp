package com.appify.barnetfclokojaapp.recyclerAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appify.barnetfclokojaapp.R;
import com.appify.barnetfclokojaapp.model.Match;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 09/02/2018.
 */

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder>{

    ArrayList<Match> matchArrayList;

    public MatchesAdapter(ArrayList<Match> array) {
        matchArrayList = array;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.matches_recycler_layout, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Match match = matchArrayList.get(position);

        holder.homeTeamTv.setText(match.getHomeTeam());
        holder.awayTeamTv.setText(match.getAwayTeam());
        if (match.isLive() || match.isPlayed()) {
            holder.homeScoreTv.setText(match.getHomeScore()+"");
            holder.awayScoreTv.setText(match.getAwayScore()+"");
        } else {
            holder.homeScoreTv.setText("?");
            holder.awayScoreTv.setText("?");
        }
        holder.awayTeamTv.setText(match.getAwayTeam()+"");
        holder.timeTv.setText(match.getTime());
        holder.dateTv.setText(match.getDate());
        holder.matchTypeTv.setText(match.getMatchType());
    }

    @Override
    public int getItemCount() {
        return matchArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView homeTeamTv, awayTeamTv, homeScoreTv, awayScoreTv, dateTv, timeTv, matchTypeTv, venueTv;
        public ViewHolder(View itemView) {
            super(itemView);
            homeTeamTv = (TextView)itemView.findViewById(R.id.homeTeamTv);
            awayTeamTv = (TextView)itemView.findViewById(R.id.awayTeamTv);
            homeScoreTv = (TextView)itemView.findViewById(R.id.homeScoreTv);
            awayScoreTv = (TextView)itemView.findViewById(R.id.awayScoreTv);
            dateTv = (TextView)itemView.findViewById(R.id.dateTv);
            timeTv = (TextView)itemView.findViewById(R.id.timeTv);
            matchTypeTv = (TextView)itemView.findViewById(R.id.matchTypeTv);
        }
    }

}
