package com.appify.barnetfclokojaapp.model;

/**
 * Created by Yinka Ige on 27/01/2018.
 */

public class Player {
    private String id;
    private String name;
    private String imageUrl;
    private String position;
    private int jerseyNumber;
    private int goals;
    private int yellows;
    private int reds;
    private int appearances;
    private int assists;

    public Player() {

    }

    public Player(String name, String position, String imageUrl){
        this.name = name;
        this.position = position;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellows() {
        return yellows;
    }

    public void setYellows(int yellows) {
        this.yellows = yellows;
    }

    public int getReds() {
        return reds;
    }

    public void setReds(int reds) {
        this.reds = reds;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
}
