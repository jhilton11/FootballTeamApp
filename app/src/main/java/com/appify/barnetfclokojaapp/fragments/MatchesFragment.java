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
import com.appify.barnetfclokojaapp.model.Match;
import com.appify.barnetfclokojaapp.recyclerAdapters.MatchesAdapter;
import com.appify.barnetfclokojaapp.utils.createTestData;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 06/02/2018.
 */

public class MatchesFragment extends Fragment {
    RecyclerView matchRecyclerview;
    LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.matches_fragment, container, false);
        matchRecyclerview = (RecyclerView)view.findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        matchRecyclerview.setLayoutManager(linearLayoutManager);
        loadRecyclerView();

        return view;
    }

    private void loadRecyclerView() {
        final ArrayList<Match> matchArrayList = new ArrayList<>();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Matches");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot: dataSnapshot.getChildren()) {
                    Match match = snapshot.getValue(Match.class);
                    matchArrayList.add(match);
                }
                matchRecyclerview.setAdapter(new MatchesAdapter(matchArrayList));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
