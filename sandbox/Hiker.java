
public class Hiker {

    private static String[] split2(String token) {
        StringBuffer sb = new StringBuffer(256);
        for (int i = 0; i < token.length(); i++) {
             if (token.charAt(i) >= '0' && token.charAt(i) <= '9') {
                 sb.append(token[i]);
                 sb.append(',');
             }
        }
        return sb.toString();
    }
    
    public static int answer(String args) {
        int sum = 0;
        String[] rs = split2(args).split(",");
        for (int i=0; i< rs.length; i++) {
            sum = sum + (rs[i].equals("") ? 0 : Integer.parseInt(rs[i]));
        }
        return sum;
    }
}
