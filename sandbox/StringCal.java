
public class StringCal{

    public static int answer(String str) {
        if (str.startWith("//")){
            return 0;
        }
        return add(0, str.replaceAll("\n",",").split(","));  
    }

    private static int add(int sum, String[] ints) {
        for (String i : ints) {
            sum += "".equals(i) ? 0 : Integer.parseInt(i);
        }
        return sum;
    }
}
