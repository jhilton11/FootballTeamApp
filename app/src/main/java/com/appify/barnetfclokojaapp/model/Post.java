package com.appify.barnetfclokojaapp.model;

/**
 * Created by Yinka Ige on 27/01/2018.
 */

public class Post {
    private String id;
    private String title;
    private String time;
    private String date;
    private String body;
    private String imageUrl;

    public Post() {

    }

    public Post(String id, String title, String time, String date, String body, String imageUrl) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.date = date;
        this.body = body;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
