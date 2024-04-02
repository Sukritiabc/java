package lab7;

public class PlayerStat {
	private String playerName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;

    // Constructor
    public PlayerStat(String playerName, int gamesPlayed, int goalsScored, int assists) {
        this.playerName = playerName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    // Getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    // Method to calculate total points
    public int calculateTotalPoints() {
        return goalsScored + assists;
    }

    // Method to display player stats
    public void displayPlayerStats() {
        System.out.println("Player: " + playerName);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Assists: " + assists);
        System.out.println("Total Points: " + calculateTotalPoints());
    }
}

