package Default;

public class StringParseLong {
    public static void main(String[] args) {
        String s = "359.0000";
        s = s.substring(0,s.indexOf("."))+"00";
        Long l = Long.valueOf(s);
        System.out.println(l);
    }
}
