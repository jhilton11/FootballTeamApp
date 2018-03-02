package com.appify.barnetfclokojaapp.model;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 27/01/2018.
 */

public class Match {
    private String id;
    private String HomeTeam;
    private String AwayTeam;
    private int HomeScore;
    private int awayScore;
    private String Venue;
    private String Referee;
    private String date;
    private String time;
    private String matchType;
    private boolean isLive;
    private boolean isPlayed;
    private ArrayList<MatchEvent> liveCommentary;

    Match() {

    }

    public Match(String homeTeam, String awayTeam, int homeScore, int awayScore, String venue, String date, String time, String matchType, boolean isLive) {
        HomeTeam = homeTeam;
        AwayTeam = awayTeam;
        HomeScore = homeScore;
        this.awayScore = awayScore;
        Venue = venue;
        this.date = date;
        this.time = time;
        this.matchType = matchType;
        this.isLive = isLive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        HomeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return AwayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        AwayTeam = awayTeam;
    }

    public int getHomeScore() {
        return HomeScore;
    }

    public void setHomeScore(int homeScore) {
        HomeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getReferee() {
        return Referee;
    }

    public void setReferee(String referee) {
        Referee = referee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public ArrayList<MatchEvent> getLiveCommentary() {
        return liveCommentary;
    }

    public void setLiveCommentary(ArrayList<MatchEvent> liveCommentary) {
        this.liveCommentary = liveCommentary;
    }
}
