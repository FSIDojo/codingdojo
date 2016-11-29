
public class FtsTranslator {

    public static String translate(boolean flag, String keywords) {
        if (keywords.startsWith("*")) {
            return "*word*";
        }
        return "word*";
    }
}
