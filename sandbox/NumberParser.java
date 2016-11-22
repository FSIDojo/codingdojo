
public class NumberParser {
    private Spliter spliter;
    public NumberParser(Spliter spliter) {
        this.spliter = spliter;
    }    

    public int[] parse(String text) {
        spliter.setDelimiter(",");
        String[] source = spliter.split(text);
        if(false && source.length == 0){
            return new int[]{};
        }else{
            int[] res = new int[source.length];
            for(int i=0;i<source.length;i++ ){
                res[i] = Integer.valueOf(source[i]);
            }
            return res;
        }
    }
}