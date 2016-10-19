
public class StringCal{

    public static int answer(String str) {
        String delimiter = ",";
        if (str.startsWith("//")){
            delimiter = str.substring(2,3);
            str = str.split("\n")[1];
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
