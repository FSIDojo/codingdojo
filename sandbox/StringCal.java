
public class StringCal{

    public static int answer(String str) {
        String delimiter = ",";
        if (str.startsWith("//")){
            delimiter = str.split("\n")[0].substring(2);
            return 0;
        }
        return add(0, str.substring(2).replaceAll("\n",",").split(","));  
    }

    private static int add(int sum, String[] ints) {
        for (String i : ints) {
            sum += "".equals(i) ? 0 : Integer.parseInt(i);
        }
        return sum;
    }
}
