
public class NumberParser {
    public int[] parse(String text) {
        if(text.equals("")) {
            return new int[0];
        } else if (text.contains(",")) {
            String[] res = text.split(",");
            ArrayList list = new ArrayList();
            for (String str : res ) {
                list.add(Integer.parseInt(str));
            }
            return list.toArray();
        }
        return null;
    }
}