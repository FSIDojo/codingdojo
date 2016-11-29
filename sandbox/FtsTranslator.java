public class FtsTranslator {
    public static String translate (boolean exactMatch, String keywords){
        if (keywords.contains(" ")) {
            return keywords.replace(" ", " AND ");
        }
        if (keywords.endsWith("*")) {
            return keywords;
        }
        return keywords+"*";
    }
}