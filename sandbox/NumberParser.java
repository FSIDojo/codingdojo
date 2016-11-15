
public class NumberParser {
    public int[] parse(String text) {
        String[] arr = text.split(",");
        int result[] = new int[arr.length];
        for(int i = 0; i < arr.length; i ++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        
        return result;
    }
}