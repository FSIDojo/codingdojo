package dojo.session6;

import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE = "Advantage ";
    public static final String WIN_FOR = "Win for ";
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
        if(m_score1 == m_score2 && m_score1>=3) {
            score = DEUCE;
        }else if (m_score1 == m_score2) {
            score = equalScore.get(m_score1);
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            score = getAdvOrWin(minusResult) + getAdvPlayer(minusResult);
        } else {
            score += convertScoreToString(m_score1);
            score += "-";
            score += convertScoreToString(m_score2);
        }
        return score;
    }

    private String getAdvPlayer(int minusResult) {
        String playerName;
        if (minusResult > 0 ) {
            playerName = this.player1Name;
        } else {
            playerName = this.player2Name;
        }
        return playerName;
    }

    private String getAdvOrWin(int minusResult) {
        String prefix = "";
        if (minusResult == 1 || minusResult == -1) {
            prefix = ADVANTAGE;
        } else if (minusResult >= 2 || minusResult <= -2) {
            prefix = WIN_FOR;
        }
        return prefix;
    }

    private String convertScoreToString(int tempScore) {
        Map<Integer, String> scoreMap = new HashMap<Integer, String>() {
            {
                put(0, LOVE);
                put(1, FIFTEEN);
                put(2, THIRTY);
                put(3, FORTY);
            }
        };
        return scoreMap.get(tempScore);
    }
}
