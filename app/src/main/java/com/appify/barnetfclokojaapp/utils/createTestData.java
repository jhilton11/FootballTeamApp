package com.appify.barnetfclokojaapp.utils;

import com.appify.barnetfclokojaapp.model.Goal;
import com.appify.barnetfclokojaapp.model.Match;
import com.appify.barnetfclokojaapp.model.Player;
import com.appify.barnetfclokojaapp.model.Post;
import com.appify.barnetfclokojaapp.model.RedCard;
import com.appify.barnetfclokojaapp.model.YellowCard;

import java.util.ArrayList;

/**
 * Created by Yinka Ige on 07/02/2018.
 */

public final class createTestData {
    private static ArrayList<Post> newsArray;
    private static ArrayList<Match> matchesArray;
    private static ArrayList<Player> playersArray;
    private static ArrayList<Goal> goalsArray;
    private static ArrayList<RedCard> redCardsArray;
    private static ArrayList<YellowCard> yellowCardsArrayList;

    public static ArrayList<Post> newsData() {
        newsArray = new ArrayList<>();

        String imageurl = "https://www.dropbox.com/s/67wvupjum04dyt9/IMG-20170308-WA0022.jpg?dl=0";

        Post post = new Post("1", "Barnet wins", "4pm", "22/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post);
        Post post1 = new Post("2", "Barnet wins", "4pm", "24/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post1);
        Post post2 = new Post("3", "Barnet wins", "4pm", "26/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post2);
        Post post3 = new Post("4", "Barnet wins", "4pm", "27/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post3);
        Post post4 = new Post("5", "Barnet wins", "4pm", "28/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post4);
        Post post5 = new Post("6", "Barnet wins", "4pm", "29/02/2018", "Barnet 2 - 0 Kabawa Utd", imageurl);
        newsArray.add(post5);

        return newsArray;
    }

    public static ArrayList<Player> playersData() {
        ArrayList<Player> playersArrayList = new ArrayList<>();
        String imageUrl = "drawable/player_avatar";
        Player player = new Player("Musa Umar", "Forward", imageUrl);
        playersArrayList.add(player);

        Player player1 = new Player("Iko Bala", "Midfielder/Defender", imageUrl);
        playersArrayList.add(player1);

        Player player2 = new Player("Michael Samuel", "Midfielder", imageUrl);
        playersArrayList.add(player2);

        Player player3 = new Player("Clement Ochuko", "Midfielder", imageUrl);
        playersArrayList.add(player3);

        Player player4 = new Player("Femi Solomon", "Defender", imageUrl);
        playersArrayList.add(player4);

        Player player5 = new Player("Mustapha Umar", "Goalkeeper", imageUrl);
        playersArrayList.add(player5);

        Player player6 = new Player("Joshua ", "Goalkeeper", imageUrl);
        playersArrayList.add(player6);

        return playersArrayList;
    }

    public static ArrayList<Match> matchesData() {
        matchesArray = new ArrayList<>();
        Match match = new Match("Barnet FC", "Kabawa FC", 3, 1, "Holy Trinity", "05-03-2018", "4pm", "Pro League", true);
        matchesArray.add(match);

        Match match1 = new Match("Barnet FC", "Super Star FC", 4, 0, "Holy Trinity", "12-03-2018", "4pm", "Pro League", true);
        matchesArray.add(match1);

        Match match2 = new Match("Zico Utd", "Barnet FC", 2, 3, "Holy Trinity", "20-03-2018", "4pm", "Pro League", true);
        matchesArray.add(match2);

        Match match3 = new Match("Zico FC", "Barnet FC", 0, 3, "Holy Trinity", "26-03-2018", "4pm", "Pro League", false);
        matchesArray.add(match3);

        Match match4 = new Match("Barnet FC", "Ultimate", 5, 0, "Holy Trinity", "05-04-2018", "4pm", "Pro League", false);
        matchesArray.add(match4);

        return matchesArray ;
    }

}
