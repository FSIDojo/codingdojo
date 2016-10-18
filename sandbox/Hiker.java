
public class Hiker {

    public static int answer(String str) {
        if(null == str || "".equals(str)) {
            return 0;
        }
        return add(0, str.split(","));  
    }

    private static int add(int sum, String[] ints) {
        for (String i : ints) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}
