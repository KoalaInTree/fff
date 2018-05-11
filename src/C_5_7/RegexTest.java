package C_5_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2018/5/7
 */
public class RegexTest {

    public static void test1() throws ClassNotFoundException {
        Class.forName("aa");
        //匹配出http://hi.baidu.com/mianshiti/blog/category/微软面试题和微软面试题
        String s = "<a href=\"http://hi.baidu.com/mianshiti/blog/category/微软面试题\">微软面试题</a> <a href=\"http://asdadom/mianshiti/blog/category/微软面试题\">微软面试题</a>";
        s = "http://g.cn";
        String s_reg = "http(s)?://(\\w+.)+\\w+((/\\w+)+)?";
        print(s,s_reg);
    }

    public static void test2(){
        //验证邮箱地址
        String s = "wb-cdj390654@alibaba-inc.com";
        String s_reg = "^(\\w+-)*\\w+@(\\w+[\\.-])+\\w+$";
        print(s,s_reg);
    }

    public static void test3(){
        String s ="aa  ab";
        String s_reg = "(?<!\\s+)[ab]+";
        print(s,s_reg);
    }

    public static void test4(){
        String s = "18926804957";
        String s_reg = "^1(3[0-9]|5[^4,\\D]|7[0-8]|8[0,5-9])\\d{8}$";
        print(s,s_reg);
    }

    public static void test5(){
        String s = "11Aa123321aaaaaaaaa";
        //密码强度-强 数字+大小写+特殊符号
        String s_reg = "[(|)|{|}|!|@|#|$|%|^|\\\\|/]";
        s_reg = "^(?![a-zA-Z]+$)(?![A-Z0-9]+$)(?![A-Z\\W_]+$)(?![a-z0-9]+$)(?![a-z\\W_]+$)(?![0-9\\W_]+$)"
            + "[a-zA-Z0-9\\W_]{8,}$";
        print(s,s_reg);

    }

    public static void test6(){
        String s = "aAaaaaaaaaaaaaa1211!";
        String s_reg = "windows (?:98|2000|2003)";
        s_reg = "^(?![a-zA-Z0-9]+$)(?![\\W_0-9]+$)(?![a-zA-Z\\W_]+$)(?!.*\\s+.*)[0-9a-zA-Z\\W_]{8,}$";
        print(s,s_reg);
    }

    public static void test7(){
        String s = "a,c";
        String s_reg = "a\\b.c";
        print(s,s_reg);
    }

    public static void test8(){
        String s ="abcabc";
        String s_reg = "a(?<!a)b";
        print(s,s_reg);
    }

    public static void test9(){
        String s = "<b>sb</b>";
        String s_reg= "(<(\\w+)>)sb</\\2>";
        print(s,s_reg);
    }

    public static void test10(){
        String s ="aaa\naasa\nass\n";
        String s_reg = "(?m)^";
        print(s,s_reg);
    }
    private static void print(String s,String reg){
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group() + "\n11");
        }
    }
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        //test8();
        //test9();
        test10();
    }
}
