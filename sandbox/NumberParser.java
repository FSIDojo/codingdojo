
public class NumberParser {
    public int[] parse(String text) {
        if(text.equals("")){
            return new int[]{};
        }else{
            String[] source = text.split(",");
            int[] res = new int[source.length];
            for(int i=0;i<source.length;i++ ){
                res[i] = Integer.valueOf(source[i]);
            }
            return res;
        }
    }
}