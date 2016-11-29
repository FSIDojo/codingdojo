public class FtsTranslator {
    public static String translate (boolean exactMatch, String keywords){
        if (keywords.endsWith("*")) {
            return keywords;
        }
        return keywords+"*";
    }
}