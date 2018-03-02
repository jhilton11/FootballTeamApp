package com.appify.barnetfclokojaapp.model;

/**
 * Created by Yinka Ige on 27/01/2018.
 */

public class Goal {
    private String id;
    private String playerId;
    private String playerName;
    private String assisterId;
    private String assisterName;
    private String time;
    private String date;
    private String matchId;

    Goal() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getAssisterId() {
        return assisterId;
    }

    public void setAssisterId(String assisterId) {
        this.assisterId = assisterId;
    }

    public String getAssisterName() {
        return assisterName;
    }

    public void setAssisterName(String assisterName) {
        this.assisterName = assisterName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
}
