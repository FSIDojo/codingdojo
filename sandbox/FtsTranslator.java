public class FtsTranslator {
    public static String translate (boolean exactMatch, String keywords){
        return keywords+"*";
    }
}