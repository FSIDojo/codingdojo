
public class Hiker {

    public static int answer(String args) {
        int sum = 0;
        String[] rs = args.split(",");
        for (int i=0; i< rs.length; i++) {
            sum = sum + (rs[i].equeal("") ? 0 : Integer.parseInt(rs[i]));
        }
        return sum;
    }
}
