
public class StringCalculator {

    public static int add(String number) {
        if(number == null || "".equals(number)){
            return 0;
        }
        String delimiter = ",";
        if(number.startsWith("//")){
           delimiter = number.charAt(2)+"";
        }
        number = number.replace("\n",delimiter).replace("//","");
        return add(number.split(delimiter));
    }


    private static int add(String... numbers){
        int ret = 0;
        for(String number : numbers){
            ret += "".equals(number)?0: Integer.valueOf(number);            
        }
        return ret;
    }
}
