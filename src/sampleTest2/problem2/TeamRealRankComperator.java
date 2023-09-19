package sampleTest2.problem2;

import java.util.Comparator;

public class TeamRealRankComperator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        if (t1.getWinsTo() == t2) {
            return -1;
        }

        return 1;
    }
}
