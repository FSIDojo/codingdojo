
public class Hiker {

    public static int answer(String str) {
        if(null == str || "".equals(str)) {
            return 0;
        }
       return add(str.split(","));  
    }

    private static int add(String[] ints) {
       int sum = 0;
        for (String i : ints) {
            sum = sum + Integer.parseInt(i);
        }
        return sum;
    }
}
