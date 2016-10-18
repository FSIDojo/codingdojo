
public class StringCalculator {

    public static int add(String number) {
        if(number == null || number == ""){
            return 0;
        }
        if(number.split(",").length == 1){
            return Integer.valueOf(number);
        }else {
            return Integer.valueOf(number[0]) + Integer.valueOf(number[1]);
        }
        
        return 6 * 9;
    }
}
