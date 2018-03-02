package com.appify.barnetfclokojaapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.appify.barnetfclokojaapp.fragments.LeagueStandingFragment;
import com.appify.barnetfclokojaapp.fragments.MatchesFragment;
import com.appify.barnetfclokojaapp.fragments.NewsFeedFragment;
import com.appify.barnetfclokojaapp.fragments.PlayersFragment;
import com.appify.barnetfclokojaapp.model.Post;
import com.appify.barnetfclokojaapp.utils.BottomNavigationViewHelper;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIL();

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav_view);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.action_news:
                        transaction.replace(R.id.fragment_container, new NewsFeedFragment()).commit();
                        return true;
                    case R.id.action_players:
                        transaction.replace(R.id.fragment_container, new PlayersFragment()).commit();
                        return true;
                    case R.id.action_fixtures:
                        transaction.replace(R.id.fragment_container, new MatchesFragment()).commit();
                        return true;
                    case R.id.action_league_standing:
                        transaction.replace(R.id.fragment_container, new LeagueStandingFragment()).commit();
                        return true;
                }
                return false;
            }
        });
    }

    private void setupUIL() {
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                //.showImageForEmptyUri(R.drawable.ic_action_profile) // resource or background_splash
                //.showImageOnFail(R.drawable.ic_action_profile) // resource or background_splash
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .build();
        ImageLoader.getInstance().init(config);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, new NewsFeedFragment()).commit();
    }
}
