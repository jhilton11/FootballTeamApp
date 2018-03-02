package com.appify.barnetfclokojaapp.model;

/**
 * Created by Yinka Ige on 12/02/2018.
 */

public class MatchEvent {
    private String id;
    private String event;
    private int time;
    private String report;

    public MatchEvent() {

    }

    public MatchEvent(String event, int time, String report) {
        this.event = event;
        this.time = time;
        this.report = report;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
