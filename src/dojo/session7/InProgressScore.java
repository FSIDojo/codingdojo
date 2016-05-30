package dojo.session7;

class InProgressScore {

    private int m_score2;
    private int m_score1;

    public InProgressScore(int m_score1, int m_score2) {
        this.m_score1 = m_score1;
        this.m_score2 = m_score2;
    }


    public String invoke() {
        return diffScore();
    }

    private String diffScore() {
        int tempScore;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = m_score1;
            } else {
                score += "-";
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
