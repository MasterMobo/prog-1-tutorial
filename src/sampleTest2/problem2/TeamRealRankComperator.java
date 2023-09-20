package sampleTest2.problem2;

import java.util.Comparator;

public class TeamRealRankComperator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        if (t1.getScore() != t2.getScore()) {
            return -Integer.compare(t1.getScore(), t2.getScore());
        }

        if (t1.hasWon(t2)) {
            return -1;
        }

        return 1;
    }
}
