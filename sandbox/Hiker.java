
public class Hiker {

    private static String convert(String token) {
        

        StringBuffer sb = new StringBuffer(256);
        char del = '';
        if (token.startWith("//")) {
            del = token.charAt(3);
        }
        for (int i = 3; i < token.length(); i++) {
             if (token.charAt(i) >= '0' && token.charAt(i) <= '9') {
                 sb.append(token.charAt(i));
             } else {
                if (token.charAt(i) != del && del !='') {
                    return "";
                }
                sb.append(',');
             }
        }
        return sb.toString();
    }
    
    public static int answer(String args) {
        int sum = 0;
        String[] rs = convert(args).split(",");
        for (int i=0; i< rs.length; i++) {
            sum = sum + (rs[i].equals("") ? 0 : Integer.parseInt(rs[i]));
        }
        return sum;
    }
}
