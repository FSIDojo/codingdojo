
public class NumberParser {
    public int[] parse(String text) {
        String[] arr = text.split(",|\n");
        int result[] = new int[arr.length];
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == null ||"".equals(arr[i])){
                result[i] = 0;
            } else {
                result[i] = Integer.parseInt(arr[i]);
            }
        }
        
        return result;
    }
}