
public class Hiker {

    public static int answer(String str) {
        if(null == str) {
            return 0;
        } else {
            String[] ints = str.split(",");
            int sum = 0;
            for(int i=0; i< ints.length();i++) {
                if(ints[i] != null) {
                    sum = sum + Integer.parseInt(ints[i]);
                }
            }
            return sum;
        }
        
    }
}
