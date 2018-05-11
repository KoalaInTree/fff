package Default;

import C_4_24.MyException;

import java.util.regex.Pattern;

public class Parent {
    int a = 1;
    public void say(){
        System.out.println("Default.Parent say" + a);
    }
    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        //System.out.printf("1");
        Pattern pathPattern = Pattern.compile("(^/*|/+)(^[^/]+|[^/]*)");
        String ss = pathPattern.matcher("http://172.123.10.1:8012/user\\//pms/order/1").group(2);
        System.out.println(ss);
    }

    public Parent(){
        System.out.println("empty constructor");
    }
    public Parent(String name){
        System.out.println(name);
    }
    public void exp() throws MyException{};
}
