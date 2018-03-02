package com.appify.barnetfclokojaapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appify.barnetfclokojaapp.R;
import com.appify.barnetfclokojaapp.model.Post;
import com.appify.barnetfclokojaapp.recyclerAdapters.NewsAdapter;
import com.appify.barnetfclokojaapp.utils.createTestData;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 05/02/2018.
 */

public class NewsFeedFragment extends Fragment {
    RecyclerView newsRecycler;
    LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment, container, false);
        newsRecycler = (RecyclerView)view.findViewById(R.id.news_recyclerview);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        newsRecycler.setLayoutManager(linearLayoutManager);
        loadRecyclerview();
        return view;
    }

    private void loadRecyclerview (){
        final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("News");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<Post> NewsArray = new ArrayList<>();
                for (DataSnapshot snapshot: dataSnapshot.getChildren()) {
                    Post newPost = snapshot.getValue(Post.class);
                    NewsArray.add(newPost);
                }
                newsRecycler.setAdapter(new NewsAdapter(NewsArray));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void loadFakeData() {
        newsRecycler.setAdapter(new NewsAdapter(createTestData.newsData()));
    }
}
