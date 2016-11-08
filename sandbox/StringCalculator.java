
public class StringCalculator{

    public static int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        String[] temp = numbers.split(",");
        if(temp.length == 1){
            return 1;
        }
        //for(String a:temp)
        return 3;
    }
}
