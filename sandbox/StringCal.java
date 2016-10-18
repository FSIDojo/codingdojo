
public class StringCal{

    public static int answer(String str) {
        String delimiter = ",";
        if (str.startsWith("//")){
            delimiter = str.split("\n")[0].substring(2);
            str = str.split("\n");
            return 0;
        }
        return add(0, str.replaceAll("\n",delimiter ).split(delimiter ));  
    }

    private static int add(int sum, String[] ints) {
        for (String i : ints) {
            sum += "".equals(i) ? 0 : Integer.parseInt(i);
        }
        return sum;
    }
}
