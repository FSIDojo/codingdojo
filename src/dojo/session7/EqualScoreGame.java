package dojo.session7;

class EqualScoreGame implements ScoreInvoke {
    private final int m_score1;
    private String ALL = "-ALL";

    public EqualScoreGame(int m_score1) {
        this.m_score1 = m_score1;
    }

    @Override
    public String invoke() {
        String score;
        switch (m_score1) {
            case 0:
                score = "Love" + ALL;
                break;
            case 1:
                score = "Fifteen" + ALL;
                break;
            case 2:
                score = "Thirty" + ALL;
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

}
