
public class StringCalculator {

    public static int add(String number) {
        if(number == null || number == ""){
            return 0;
        }
        String temp[] = number.split(",");
        if(temp.length == 1){
            return Integer.valueOf(temp[0]);
        }else {
            return Integer.valueOf(temp[0]) + Integer.valueOf(temp[1]);
        }
       
    }
}
