public class ScoreTable {
    private String  team1;
    private String team2;
    private int goalTeam1;
    private int goalTeam2;


    public ScoreTable() {
        this.team1 = team1;
        this.team2 = team2;
        this.goalTeam1 = goalTeam1;
        this.goalTeam2 = goalTeam2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getGoalTeam1() {
        return goalTeam1;
    }

    public void setGoalTeam1(int goalTeam1) {
        this.goalTeam1 = goalTeam1;
    }

    public int getGoalTeam2() {
        return goalTeam2;
    }

    public void setGoalTeam2(int goalTeam2) {
        this.goalTeam2 = goalTeam2;
    }

    @Override
    public String toString() {
        return
                team1 + ' ' + goalTeam1 + " - " + goalTeam2 + ' ' +team2;
    }
}
