
public class NumberParser {
    public int[] parse(String text) {
        String[] arr = text.split(",");
        int result[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i ++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        
        return result;
    }
}