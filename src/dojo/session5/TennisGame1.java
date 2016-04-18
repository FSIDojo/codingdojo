package dojo.session5;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case ZERO:
                    score.append("Love-All");
                    break;
                case ONE:
                    score.append("Fifteen-All");
                    break;
                case TWO:
                    score.append("Thirty-All");
                    break;
                default:
                    score.append("Deuce");
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) {
                score.append("Advantage player1");
            } else if (minusResult == -1) {
                score.append("Advantage player2");
            } else if (minusResult >= 2) {
                score.append("Win for player1");
            } else {
                score.append("Win for player2");
            }
        } else {
            score.append(scoreToString(m_score1));
            score.append("-");
            score.append(scoreToString(m_score2));
        }
        return score.toString();
    }

    private String scoreToString(int tempScore) {
        StringBuilder score = new StringBuilder();
        switch (tempScore) {
            case ZERO:
                score.append("Love");
                break;
            case ONE:
                score.append("Fifteen");
                break;
            case TWO:
                score.append("Thirty");
                break;
            case THREE:
                score.append("Forty");
                break;
        }
        return score.toString();
    }
}
