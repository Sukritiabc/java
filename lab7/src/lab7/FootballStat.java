package lab7;

class FootballStats extends PlayerStat {
    private int yellowCards;
    private int redCards;

    // Constructor
    public FootballStats(String playerName, int gamesPlayed, int goalsScored, int assists, int yellowCards, int redCards) {
        super(playerName, gamesPlayed, goalsScored, assists);
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    // Getters and setters for football-specific attributes
    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    // Method to display football stats
    public void displayPlayerStats() {
        super.displayPlayerStats();
        System.out.println("Yellow Cards: " + yellowCards);
        System.out.println("Red Cards: " + redCards);
    }
}
