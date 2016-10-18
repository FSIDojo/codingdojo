
public class StringCalculator {

    public static int add(String number) {
        if(number == null || "".equals(number)){
            return 0;
        }
        number.replace("\n",",");
        return add(number.split(","));
    }


    private static int add(String... numbers){
        int ret = 0;
        for(String number : numbers){
            ret += Integer.valueOf(number);            
        }
        return ret;
    }
}
