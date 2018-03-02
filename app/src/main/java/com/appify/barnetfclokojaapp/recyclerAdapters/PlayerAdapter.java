package com.appify.barnetfclokojaapp.recyclerAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appify.barnetfclokojaapp.R;
import com.appify.barnetfclokojaapp.model.Player;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 08/02/2018.
 */

public class PlayerAdapter extends RecyclerView.Adapter <PlayerAdapter.ViewHolder>{
    ArrayList<Player> playersArrayList;

    public PlayerAdapter(ArrayList<Player> players) {
        playersArrayList = players;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.player_recycler_layout, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Player player = playersArrayList.get(position);

        holder.nameTv.setText(player.getName());
        holder.positionTv.setText(player.getPosition());
        ImageLoader.getInstance().displayImage(player.getImageUrl(), holder.imageView);
    }

    @Override
    public int getItemCount() {
        return playersArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTv, positionTv;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            nameTv = (TextView)itemView.findViewById(R.id.nameTv);
            positionTv = (TextView)itemView.findViewById(R.id.position_tv);
        }
    }

}
