package dojo.session6;

import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ADVANTAGE_PLAYER1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER1 = "Win for player1";
    public static final String WIN_FOR_PLAYER2 = "Win for player2";
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String DEUCE = "Deuce";
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (this.player1Name.equals(playerName))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        Map<Integer, String> equalScore = new HashMap<Integer, String>(){
            {   put(0, LOVE_ALL);
                put(1, FIFTEEN_ALL);
                put(2, THIRTY_ALL);
            }
        };
        if (m_score1 == m_score2) {
            if(m_score1>=3) {
                score = DEUCE;
            }else {
                score = equalScore.get(m_score1);
            }

        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) {
                score = ADVANTAGE_PLAYER1;
            } else if (minusResult == -1) {
                score = ADVANTAGE_PLAYER2;
            } else if (minusResult >= 2) {
                score = WIN_FOR_PLAYER1;
            } else {
                score = WIN_FOR_PLAYER2;
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = m_score1;
                } else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
