
public class Hiker {

    public static int answer(String args) {
            String[] rs = args.split(",");
            int sum = 0;
            for (int i=0; i< rs.length; i++) {
                if ("".equals(rs[i])) {
                    continue;
                }
                sum += Integer.parseInt(rs[i]);
            }
            return sum;
    }
}
