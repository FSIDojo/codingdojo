package dojo.session7;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        score = createIScore(m_score1, m_score2);
        return score;
    }

    private String createIScore(int score1, int score2) {
        String score;
        if (score1== score2)

        {
            score = new EqualScoreGame(score1).score();
        }
        else if (score1>=4 || score2 >=4)
        {
            score = new MaybeEndGame(score1, score2).score();
        }
        else
        {
            score = new InProgressScoreGame(score1, score2).score();
        }
        return score;
    }

}
