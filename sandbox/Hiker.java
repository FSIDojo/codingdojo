
public class Hiker {

    public static int answer(String str) {

       String[] ints = str.split(",");
       int sum = 0;
       for(int i=0; i< ints.length;i++) {
           sum = sum + ints[i] == null ? 0:Integer.parseInt(ints[i]);
       }
       return sum;

        
    }
}
