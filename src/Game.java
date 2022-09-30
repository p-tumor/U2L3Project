public class Game {
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }



    public int getScore() {return score;}

    public void addPlayer(){players++;}

    public void increaseScore(int x){score+=x;}

    public double averageScorePerPlayer(){return (double)score/players;}

    public void end()
    {
        gameOver = true;
    }

}
