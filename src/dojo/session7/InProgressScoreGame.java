package dojo.session7;

class InProgressScoreGame implements IScore {

    public static final String IN_PROGRESS_TEMPLATE = "%s-%s";
    private int m_score2;
    private int m_score1;
    public static final String[] SCORE_NAMES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public InProgressScoreGame(int m_score1, int m_score2) {
        this.m_score1 = m_score1;
        this.m_score2 = m_score2;
    }

    @Override
    public String score() {
        return String.format(IN_PROGRESS_TEMPLATE, SCORE_NAMES[m_score1], SCORE_NAMES[m_score2]);
    }

}
