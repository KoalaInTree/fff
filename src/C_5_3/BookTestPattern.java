package C_5_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookTestPattern {
    public static void printRes(String s,String ... args){
        Pattern p ;
        Matcher m ;
        int i= 1 ;
        for (String t : args){
            p = Pattern.compile(t);
            m = p.matcher(s);
            int j = 0;
            while (m.find()){
                System.out.printf("find %d matcher res,res is :%s\n",i,m.group());
                ++j;
            }
            System.out.printf("--------%d´Î-------\n",j);
            i++;
        }
        System.out.println(s.length());
    }

    public static void test1(){
        String s = "Java now has regular expressions";
        String reg1 = "^Java"; //Java
        String reg2 = "\\Breg.*";//regular expressions
        String reg3 = "n.w\\s+h(a|i)s"; //now has
        String reg4 = "s?"; //
        String reg5 = "s*"; //s ss s
        String reg6 = "s{4}";//
        String reg7 = "s{1}.";// s   s
        String reg8 = "s{0,3}";// s ss s
        String reg9 = "s{0}";
        String[] ss = new String[]{reg1,reg2,reg3,reg4,reg5,reg6,reg7,reg8,reg9};
        printRes(s,ss);
    }

    private static void test2(){
        String s = "Arline ate eight apples and one orange while Anita hadn't any";
        String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        /**
         * 1.Arline
         * 2. ate
         * 3. one
         * 4. orange
         * 5. Anita
         */
        printRes(s,reg);
    }
    public static void main(String[] args) {
        test2();

    }
}
