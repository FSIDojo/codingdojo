package dojo.session7;

public class ScoreGameFactory {
    public static IScore createIScore(int score1, int score2) {
        IScore score;
        if (score1 == score2) {
            score = new EqualScoreGame(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = new MaybeEndGame(score1, score2);
        } else {
            score = new InProgressScoreGame(score1, score2);
        }
        return score;
    }
}
