package dojo.session5;

import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private Map<Integer, String> scoreMap = null;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        scoreMap = new HashMap<Integer, String>();
        scoreMap.put(ZERO, "Love");
        scoreMap.put(ONE, "Fifteen");
        scoreMap.put(TWO, "Thirty");
        scoreMap.put(THREE, "Forty");
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (m_score1 == m_score2) {
            if (m_score1 >= 3) {
                score.append("Deuce");
            } else {
                score.append(scoreToString(m_score1)).append("-All");
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
        return scoreMap.get(tempScore);
    }
}
