
public class Hiker {

    public static int answer(String str) {
        if(null == str || "".equals(str)) {
            return 0;
        }
       String[] ints = str.split(",");
      int sum = 0;
      for(int i=0; i< ints.length;i++) {
           sum = sum + Integer.parseInt(ints[i]);
       }
       return sum;

        
    }
}
