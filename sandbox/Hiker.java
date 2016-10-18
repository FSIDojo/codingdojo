
public class Hiker {

    public static int answer(String args) {
        if(args.length() == 1){
            return Integer.parseInt(args);
        } else {
            String[] rs = args.split(",");
            int sum = 0;
            for (int i=0; i<rs.length; i++) {
                sum += Integer.parseInt(rs[i]);
            }
            return sum;
            
        }
    }
}
