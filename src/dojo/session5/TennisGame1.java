package dojo.session5;

import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final String ALL = "All";
    public static final String DASH = "-";
    public static final String DEUCE = "Deuce";

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    private Map<Integer, String> scoreMap = new HashMap<Integer, String>();

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        scoreMap.put(ZERO, "Love");
        scoreMap.put(ONE, "Fifteen");
        scoreMap.put(TWO, "Thirty");
        scoreMap.put(THREE, "Forty");
    }

    public void wonPoint(String playerName) {
        if (player1Name.equals(playerName)) {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        if (m_score1 == m_score2 && m_score1 >= THREE ) {
            score.append(DEUCE);
        } else if (m_score1 == m_score2) {
            score.append(scoreToString(m_score1)).append(DASH).append(ALL);
        } else if (m_score1 > THREE || m_score2 > THREE) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) {
                score.append("Advantage ").append(player1Name);
            } else if (minusResult == -1) {
                score.append("Advantage ").append(player2Name);
            } else if (minusResult >= 2) {
                score.append("Win for ").append(player1Name);
            } else {
                score.append("Win for ").append(player2Name);
            }
        } else {
            score.append(scoreToString(m_score1));
            score.append(DASH);
            score.append(scoreToString(m_score2));
        }
        return score.toString();
    }

    private String scoreToString(int tempScore) {
        return scoreMap.get(tempScore);
    }
}
