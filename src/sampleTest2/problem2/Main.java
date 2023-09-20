package sampleTest2.problem2;

public class Main {
    public static void main(String[] args) {
        try {
            Team a = new Team("A");
            Team b = new Team("B");
            Team c = new Team("C");
            Team d = new Team("D");
            a.win(b);

            a.win(c);

            a.lose(d);

            b.win(c);

            b.win(d);

            c.win(d);

// assume leader is a LeaderBoard object
            LeaderBoard leader = new LeaderBoard();
            leader.add(d);

            leader.add(a);

            leader.add(c);

            leader.add(b);


            System.out.println(leader.rank());
            System.out.println(leader.realRank());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
