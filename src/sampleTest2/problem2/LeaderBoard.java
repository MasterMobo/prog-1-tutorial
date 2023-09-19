package sampleTest2.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeaderBoard {
    private ArrayList<Team> teams;

    public LeaderBoard() {
        teams = new ArrayList<>();
    }

    public void add(Team t) {
        teams.add(t);
    }

    public ArrayList<Team> rank(){
        ArrayList<Team> res = new ArrayList<>(List.copyOf(teams));
        res.sort(Comparator.comparing((Team::getScore)));
        Collections.reverse(res);
        return res;
    }

    public ArrayList<Team> realRank(){
        ArrayList<Team> res = new ArrayList<>(List.copyOf(teams));
        TeamRealRankComperator comparator = new TeamRealRankComperator();
        res.sort(comparator);
        return res;
    }
}
