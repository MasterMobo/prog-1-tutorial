package sampleTest2.problem2;

public class Team{
    private String name;
    private int score;

    private Team winsTo;

    public Team(String name) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid Name");
        }
        this.name = name;
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

    public Team getWinsTo() {
        return winsTo;
    }

    public void addPoint(int points) {
        score += points;
    }

    public void win(Team other) {
        this.addPoint(3);
        this.winsTo = other;
    }

    public void lose(Team other) {
        other.winsTo = this;
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
