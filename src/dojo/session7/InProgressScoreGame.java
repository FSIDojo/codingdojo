package dojo.session7;

class InProgressScoreGame implements IScore {

    private int m_score2;
    private int m_score1;

    public InProgressScoreGame(int m_score1, int m_score2) {
        this.m_score1 = m_score1;
        this.m_score2 = m_score2;
    }

    @Override
    public String score() {
        String score = "";
        score += translateScoreToName(m_score1);
        score += "-";
        score += translateScoreToName(m_score2);
        return score;
    }

    private String translateScoreToName(int tempScore) {
        String score;
        switch (tempScore) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
            default:
                return "";
        }
        return score;
    }

}
