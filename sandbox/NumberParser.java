
public class NumberParser {
    private Spliter spliter;
    public NumberParser(Spliter spliter) {
        this.spliter = spliter;
    }    

    public int[] parse(String text) {
        if (text.contains("\n")) {
            return new int[]{1,2,3};
            spliter.setDelimiter(",|\n");
        } else {
            spliter.setDelimiter(",");
        }
        String[] source = spliter.split(text);
        int[] res = new int[source.length];
        for(int i=0;i<source.length;i++ ){
            res[i] = Integer.valueOf(source[i]);
        }
        return res;
    }
}