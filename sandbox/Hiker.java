
public class Hiker {

    public static int answer(String args) {
        int sum = 0;
        for (String[] rs = args.split(","), int i=0; i< rs.length; i++) {
            sum = sum + (rs[i].equeal("") ? 0 : Integer.parseInt(rs[i]));
        }
        return sum;
    }
}
