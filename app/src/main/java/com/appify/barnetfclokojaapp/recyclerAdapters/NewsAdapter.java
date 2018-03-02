package com.appify.barnetfclokojaapp.recyclerAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appify.barnetfclokojaapp.R;
import com.appify.barnetfclokojaapp.model.Post;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Yinka Ige on 05/02/2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    ArrayList<Post> postArray;

    public NewsAdapter(ArrayList<Post> PostArray) {
        this.postArray = PostArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_recycler_layout, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Post post = postArray.get(position);

        holder.timeTv.setText(post.getTime());
        holder.titleTv.setText(post.getTitle());
        holder.bodyTv.setText(post.getBody());
        ImageLoader.getInstance().displayImage(post.getImageUrl(), holder.imageView);
    }

    @Override
    public int getItemCount() {
        return postArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTv;
        TextView timeTv;
        ImageView imageView;
        TextView bodyTv;

        public ViewHolder(View itemView) {
            super(itemView);

            titleTv = (TextView) itemView.findViewById(R.id.titleTv);
            timeTv = (TextView) itemView.findViewById(R.id.timeTv);
            bodyTv = (TextView) itemView.findViewById(R.id.bodyTv);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }


}
