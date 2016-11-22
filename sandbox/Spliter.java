
public class Spliter {
    
    private String delimiter;

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String[] split(String text) {
        return text.split(delimiter);
    }
}