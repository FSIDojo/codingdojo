
public class Hiker {

    public static int answer(String str) {
        if(null == str || "".equals(str)) {
            return 0;
        }
        int sum = 0;
        for (String i : str.split(",") {
            sum = sum + Integer.parseInt(i);
        }
       return sum;  
    }
}
