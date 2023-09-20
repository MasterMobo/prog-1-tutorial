package sampleTest2.problem2;

import java.util.ArrayList;

public class Team{
    private String name;
    private int score;

    private ArrayList<Team> winsTo;

    public Team(String name) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid Name: " + name);
        }
        this.name = name;
        winsTo = new ArrayList<>();
    }

    public static boolean isValidName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isAlphabetic(c)) return false;
        }
        return true;
    }

    public int getScore() {
        return score;
    }

    public boolean hasWon(Team other) {
        return winsTo.contains(other);
    }

    public void addPoint(int points) {
        score += points;
    }

    public void win(Team other) {
        this.addPoint(3);
        this.winsTo.add(other);
    }

    public void lose(Team other) {
        other.win(this);
    }

    public void draw(Team other) {
        this.addPoint(1);
        other.addPoint(1);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }


}
