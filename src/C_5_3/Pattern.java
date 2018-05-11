package C_5_3;

import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
        String s = "A Asasdadasd sadasd sadas 。 A Asasdadasd sadasd sadas 。";
        String s2 = "A。";
        String ss = "aaa aa";
        String sss = "aaa a 。";
        String ssss = "Aasda ass";
        String s3 = "              " +
                " \n  ";
        String s4 = "hi,my name is lucy ";
        String s4_reg = "\\bhi\\b.*\\blucy\\b";
        String s_reg = "[A-Z].*。$";
        String s3_reg = "\\s";
        boolean b = java.util.regex.Pattern.matches(s3_reg,s3);
        System.out.println(b);
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(s4_reg);
        Matcher m = p.matcher(s4);
        while (m.find()){
            System.out.println(m.group()+" ");
        }

    }
}
