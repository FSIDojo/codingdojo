
public class FtsTranslator {

    public static String translate(boolean flag, String keywords) {
        if (keywords.endsWith("*")) {
            return keywords;
        } else if (keywords.endsWith("?")) {
            return keywords;
        }
        return keywords + "*";
    }
}
