package dojo.session7;

class EqualScoreGame implements IScore {
    public static final String EQUAL_TEMPLATE = "%s-All";
    private final int m_score1;
    private String ALL = "-All";
    public static final String[] SCORE_NAMES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};


    public EqualScoreGame(int m_score1) {
        this.m_score1 = m_score1;
    }

    @Override
    public String score() {
        return m_score1 < SCORE_NAMES.length-1 ? String.format(EQUAL_TEMPLATE, SCORE_NAMES[m_score1])
                : "Deuce";
    }

}
